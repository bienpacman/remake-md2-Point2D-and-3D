package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(0.4f,0.5f);
        System.out.println(point2D);
        System.out.println("_________________________________________");
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(3.2f, 4.7f,1.2f);
        System.out.println(point3D);
    }
}
