package com.moshoop;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj)
//            return true;
//
//        if(!(obj instanceof Point otherPoint))
//            return false;
//
//        return otherPoint.x == x && otherPoint.y ==y;
//    }
//
//    @Override
//    public int hashCode() {
////        Here, a hashcode based on the content of this object is generated,
////        but the default implementation of hashcode is that hashcode is generated
////        based on the address of the object in memory.
//        return Objects.hash(x, y);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
