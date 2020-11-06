/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_3;
import java.util.*;

/**
 *
 * @author wangy
 */
public class Application {
    
     public static void main(String[] args) {
    
    Performer[] list1 = {new Performer("a",81),new Performer("b",45),new Performer("c",65),new Performer("d",76),new Performer("e",76),
        new Performer("f",87),new Performer("g",90),new Performer("h",61),new Performer("i",18),new Performer("j",31)};
    PerformerList p = new PerformerList(new LinkedList<>(Arrays.asList(list1)));
    
    display(p.getPerformerList());
    System.out.println("---------ranking and inserting a performer with lower score--------"); 
    p.insert("lower",9);
    
     System.out.println("---------ranking and adding a performer with higher score--------");
    p.insert("higher", 100);
    
     }
      public static void display(Collection list){
        for(Object e:list){
            System.out.println(e);
        }
      }
}
