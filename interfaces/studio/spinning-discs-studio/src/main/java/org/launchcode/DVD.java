package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    private boolean writesViaLaser = true;
    public DVD(int speed, String direction, int dataSize, String dataType, boolean writesViaLaser) {
        super(speed, direction, dataSize, dataType);
    }
    @Override
    public void spinDisc() {
        System.out.println("DVD is spinning @" + getSpeed() + "RPMs");
    }

    @Override
    public void storeData() {
        System.out.println("Storing " + getDataSize() + "GBs");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
