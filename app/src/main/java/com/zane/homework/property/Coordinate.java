package com.zane.homework.property;
 /**
  * Desc  :  坐标位置
  * Author: Zhangcx
  * Date  : 3/5/21 6:57 PM
  */
public class Coordinate {
    private int xCoordinate;
    private int yCoordinate;

    public Coordinate(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }


    @Override
    public String toString() {
        return xCoordinate + " " + yCoordinate;
    }

    //是否超出外边界
    public boolean isOutSideBound(Coordinate coordinate) {
        return coordinate.xCoordinate >= this.xCoordinate && coordinate.yCoordinate >= this.yCoordinate;
    }

    //是否在内边界内
    public boolean isInsideBound(Coordinate coordinate) {
        return coordinate.xCoordinate <= this.xCoordinate && coordinate.yCoordinate <= this.yCoordinate;
    }


    public Coordinate newCoordinateForStep(int xStep, int yStep) {
        return new Coordinate(xCoordinate + xStep, yCoordinate + yStep);
    }

}
