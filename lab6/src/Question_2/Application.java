/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_2;
import java.util.*;
/**
 *
 * @author wangy
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
    System.out.println("---------using array--------");
        Circle[] arrayX = {new Circle(1,2,18),new Circle(4,5,6),
                           new Circle(364,8,9),new Circle(98,65,8)};
        display(Arrays.asList(arrayX));
    System.out.println("---------using arraylist--------");
        ArrayList<Circle> arrayY = new ArrayList<>(Arrays.asList(arrayX));
        display(arrayY);
    System.out.println("sorted arraylist:");    
        Collections.sort(arrayY);
        display(arrayY);
    System.out.println("---------using linkedlist--------");    
        LinkedList<Circle> arrayZ = new LinkedList<>(Arrays.asList(arrayX));
        display(arrayZ);
        Collections.sort(arrayZ, new xComparator());
    System.out.println("sorted linkedlist by x value:");  
        display(arrayZ);
        Collections.reverse(arrayZ);
    System.out.println("sorted linkedlist by reversed x value:"); 
        display(arrayZ);
     System.out.println("circle with maximun radius value:");
        System.out.println(Collections.max(arrayZ));
    }
    public static void display(Collection list){
        for(Object e:list){
            System.out.println(e);
        }
    
     }
     }
