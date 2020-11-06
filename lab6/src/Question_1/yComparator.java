/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_1;

import java.util.*;

/**
 *
 * @author wangy
 */
public class yComparator implements Comparator<Point>{

    @Override
    public int compare(Point o1, Point o2) {
        if(o1.getY()-o2.getY()!= 0 )return o1.getY()-o2.getY();
        else return o1.getX()-o2.getX();
    }
    
}
