package org.launchcode;

public class Main {
    public static void main(String[] args) {

        CD cdName = new CD(32, "right", 512, "MP3", true);
        // TODO: Declare and initialize a CD and a DVD object.
        DVD dvdName = new DVD(256, "right", 10, "MP4", true);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cdName.spinDisc();
        cdName.storeData();

        dvdName.spinDisc();
        dvdName.storeData();
    }
}