/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author wangy
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        ListIterator<String> litr = null;
        // adding element to arraylist
        arraylist.add("A");
        arraylist.add("B");
        arraylist.add("C");
        arraylist.add("D");
        litr = arraylist.listIterator();
        while(litr.hasNext()){
            //iterating through the arraylist
            System.out.println(litr.next());
        }
    }
    
}
