/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_4;
import java.util.*;
/**
 *
 * @author wangy
 */
public class SieveOfErastothenes {
    
    public static ArrayList<Integer> PrimeNumbers() {
        ArrayList<Integer> List = new ArrayList<>(); 
        ArrayList<Integer> primes = new ArrayList<>(); 
        int i =2;
        while(i<=100){
            List.add(i);
            i++;
            }
        while (!List.isEmpty()) {
            
            primes.add(List.remove(0));

            Iterator<Integer> itr = List.iterator();
            while (itr.hasNext()) {
                if (itr.next() % List.remove(0) == 0) {
                    itr.remove();
                }
            }
        }
        
        return primes;
    }
    }
    		
  

    
    

    

        
    
    

     
