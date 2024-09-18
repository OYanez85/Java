// Percussion instrument class
class PercussionInstrument extends Instrument {
    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    // Implement the abstract tocar() method
    @Override
    public void tocar() {
        System.out.println("A percussion instrument is playing.");
    }

    static {
        System.out.println("PercussionInstrument class loaded.");
    }
}
