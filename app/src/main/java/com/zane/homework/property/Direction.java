package com.zane.homework.property;

/**
 * Desc  : 方向
 * Author: Zhangcx
 * Date  : 3/5/21 6:58 PM
 */
public enum Direction {
    N(0, 1) {
        @Override
        public Direction left() {
            return W;
        }

        @Override
        public Direction right() {
            return E;
        }
    },
    S(0, -1) {
        @Override
        public Direction left() {
            return E;
        }

        @Override
        public Direction right() {
            return W;
        }
    },
    E(1, 0) {
        @Override
        public Direction left() {
            return N;
        }

        @Override
        public Direction right() {
            return S;
        }
    },
    W(-1, 0) {
        @Override
        public Direction left() {
            return S;
        }

        @Override
        public Direction right() {
            return N;
        }
    };

    /**
     * 根据名称 获取枚举对象
     */
    public static Direction formName(String name) {
        for (Direction direction : values()) {
            if (direction.name().equals(name)) {
                return direction;
            }
        }
        return null;
    }

    private final int stepOnX;
    private final int stepOnY;

    public int getStepOnX() {
        return stepOnX;
    }

    public int getStepOnY() {
        return stepOnY;
    }

    Direction(int xStep, int yStep) {
        stepOnX = xStep;
        stepOnY = yStep;
    }

    public abstract Direction right();

    public abstract Direction left();


}
