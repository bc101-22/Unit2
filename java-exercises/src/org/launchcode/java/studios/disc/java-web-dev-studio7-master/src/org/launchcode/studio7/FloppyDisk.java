package org.launchcode.studio7;

public class FloppyDisk extends BaseDisc {
    public FloppyDisk() {
    }

    public FloppyDisk(String name, int capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

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
}
