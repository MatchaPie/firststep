package Question_2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author wangy
 */
public class Circle implements Comparable<Circle>{
    int x;
    private int y;
    private double radius;

    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "x=" + x + ", y=" + y + ", radius=" + radius + '}';
    }

    @Override
    public int compareTo(Circle o) {
        double nb = this.radius-o.radius;
        return (int) nb;
    }
    
    
}
