package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    public CD() {
    }

    public CD(String name, int capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void writeData() {

    }

    @Override
    public String readData() {
        return null;
    }

    @Override
    public void report() {

    }

    @Override
    public void spinDisk() {

    }
}
