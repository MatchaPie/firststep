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
public class Performer implements Comparable<Performer>{
    private String name;
    private int score;
    

    public Performer(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Performer o) {
        return this.getScore()-o.getScore();
    }

    @Override
    public String toString() {
        return "Performer{" + "name=" + name + ", score=" + score + '}';
    }

    
    
}
