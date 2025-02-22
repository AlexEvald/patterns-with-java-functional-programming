package adapter.classic;

public class AdapterMainClassic {

    public static void main(String[] args) {
        OldSystem oldSystem = new OldSystem();
        NewSystem adaptedSystem = new OldToNewAdapter(oldSystem); // Use adapter

        adaptedSystem.newRequest(); // Calls oldSystem.legacyRequest()
    }

}
