package adapter.classic;

// Step 3: Adapter (Bridges OldSystem with NewSystem)
class OldToNewAdapter implements NewSystem {
    private final OldSystem oldSystem;

    public OldToNewAdapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void newRequest() {
        oldSystem.legacyRequest(); // Adapts old method to new interface
    }
}
