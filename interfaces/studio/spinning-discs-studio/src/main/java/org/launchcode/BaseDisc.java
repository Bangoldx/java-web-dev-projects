package org.launchcode;

public abstract class BaseDisc {
    private int speed;
    private String direction;
    private int dataSize;
    private String dataType;

    public BaseDisc(int speed, String direction, int dataSize, String dataType){
        this.speed = speed;
        this.direction = direction;
        this.dataSize = dataSize;
        this.dataType = dataType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getDataSize() {
        return dataSize;
    }

    public void setDataSize(int dataSize) {
        this.dataSize = dataSize;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
}
