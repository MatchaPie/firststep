/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_1;

/**
 *
 * @author wangy
 */
import java.util.*;
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Point[]p = {new Point(21,7),new Point(1,9),new Point(2,67),new Point(3,5),new Point(5,6)};
    ArrayList<Point> a = new ArrayList<>(Arrays.asList(p));
    Collections.sort(a);
    System.out.println("--------Using ArrayList---------"); 
    for(int i=0;i < a.size();i++){
        System.out.println(a.get(i));
    }
    
    System.out.println("-----------------");
    
    Collections.sort(a, new yComparator());
    
    for(int i=0;i < a.size();i++){
        System.out.println(a.get(i));
        
    }
    System.out.println("--------Using Arrays---------");    
        Arrays.sort(p);
    
    for(int i=0;i < p.length;i++){
        System.out.println(p[i]);
    }
    
    System.out.println("-----------------");
    
    Arrays.sort(p, new yComparator());
    
    for(int i=0;i < a.size();i++){
        System.out.println(a.get(i));
    }
    
    }}