package com.zane.homework.property;


 /**
  * Desc  :  定义坐标图
  * Author: Zhangcx
  * Date  : 3/5/21 6:57 PM
  */
public class Plateau {
    //最大边界
    private Coordinate topRightCoordinate = new Coordinate(0, 0);
    //原点
    private Coordinate bottomLeftCoordinate = new Coordinate(0, 0);

    public Plateau(int topRightX, int topRightY) {
        this.topRightCoordinate = topRightCoordinate.newCoordinateForStep(topRightX, topRightY);
    }

    //是否超出边界
    public boolean isOutside(Coordinate coordinate) {
        return bottomLeftCoordinate.isOutSideBound(coordinate) && topRightCoordinate.isInsideBound(coordinate);
    }
}
