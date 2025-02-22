package adapter.functinal;

import java.util.function.Function;

public class AdapterMainFunctional {

    public static void main(String[] args) {
        // Step 1: Old System Function (Incompatible)
        Runnable oldSystemRequest = () -> System.out.println("Processing request in Old System");

        // Step 2: Adapter Function (Converts Old System to New System)
        Function<Runnable, Runnable> adapter = oldSystem -> () -> oldSystem.run();

        // Step 3: Apply Adapter
        Runnable newSystemRequest = adapter.apply(oldSystemRequest);

        // Step 4: Call the adapted function
        newSystemRequest.run();



        // Old System: Accepts a String instead of just being Runnable
        Function<String, Runnable> oldSystemRequestWithParameter = message -> () -> System.out.println("Old System processing: " + message);

        // Adapter: Converts Old System function to a Runnable without parameters
        Runnable newSystemRequestWithParameter = oldSystemRequestWithParameter.apply("Hello from Adapter");

        // Execute adapted function
        newSystemRequestWithParameter.run();
    }

}
