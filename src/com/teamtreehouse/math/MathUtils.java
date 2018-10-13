package com.teamtreehouse.math;

import java.awt.geom.Point2D;

import com.teamtreehouse.docgen.Doc;


@Doc(
        desc = "Utility Class for commonly used math function"
)
public class MathUtils {
    private static final Double EPSILON = 0.0001;

    @Doc(
            desc = "Calculates the area of the triangle",
            params = {"Co-ordinates of the first vertex"},
            returnVal = "calculated are aof the triangle"
    )

    public static Double triangleArea(Point2D.Double a, Point2D.Double b, Point2D.Double c) {
        return 0.0;
    }


    @Doc(
            desc = "Calculates distance of the given points",
            params = {"Coordinates of the first point", "Coordiantes of the other point"},
            returnVal = ""
    )
    public static Double distance(Point2D.Double a, Point2D.Double b) {
        return 0.0;
    }

    public static Double[] quadraticRoots(int a, int b, int c) {
        return new Double[]{};
    }

    @Doc(
            desc = "Displays the values of the epsilon"

    )

    public static void epsilon() {

    }

    private static boolean arePointsClose(Point2D.Double a, Point2D.Double b) {
        return false;
    }
}