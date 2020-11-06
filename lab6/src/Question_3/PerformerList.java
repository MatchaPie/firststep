/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_3;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author wangy
 */
public class PerformerList {
    private LinkedList<Performer> performerList ;
    
     public PerformerList(LinkedList<Performer> performerList) {
        this.performerList = performerList;
    }

    public LinkedList<Performer> getPerformerList() {
        return performerList;
    }
     
     public void insert(String name, int score){
        
        Performer newPerformer = new Performer(name, score);
        this.performerList.add(newPerformer); 
        Collections.sort(this.performerList);
        Collections.reverse(this.performerList);
        this.performerList.remove(this.performerList.getLast());
        for(Performer f:this.performerList){
            System.out.println(f);
        }
     }}

    
