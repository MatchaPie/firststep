/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_2;

import java.util.Comparator;

/**
 *
 * @author wangy
 */
public class xComparator implements Comparator<Circle>{
 

    @Override
    public int compare(Circle c1, Circle c2) {
        return c1.x -c2.x;
    }

}
