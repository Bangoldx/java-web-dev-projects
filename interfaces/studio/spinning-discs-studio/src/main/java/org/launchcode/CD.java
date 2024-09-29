package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {

    private boolean readsViaLaser = true;

    public CD(int speed, String direction, int dataSize, String dataType, boolean readsViaLaser) {
        super(speed, direction, dataSize, dataType);
    }

    public boolean isReadsViaLaser() {
        return readsViaLaser;
    }

    @Override
    public void spinDisc() {
        System.out.println("CD is spinning @" + getSpeed() + "RPMs");
    }

    @Override
    public void storeData() {
        System.out.println("Storing " + getDataSize() +"MBs");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
