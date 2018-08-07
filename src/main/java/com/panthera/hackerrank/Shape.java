
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.hackerrank;

/**
 *
 * @author Mahesh
 */
public class Shape {

}


/* Implement your classes here. Do not use access modifiers in your class declarations. */
class Circle {

    public float radius;

    public Circle(float radius) {
        radius = this.radius;

    }

    public float getArea() {
        return 3.14f * this.radius * this.radius;
    }

}

class Rectangle {

    public float width;
    public float height;

    public Rectangle(float width, float height) {
        width = this.width;
        height = this.height;

    }

    public float getArea() {
        return this.width * this.height;
    }

}

class Square {

    public float width;

    public Square(float width) {
        width = this.width;

    }

    public float getArea() {
        return this.width * this.width;
    }

}
