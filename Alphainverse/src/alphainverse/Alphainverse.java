/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphainverse;

/**
 *
 * @author Federico Laptop
 */
public class Alphainverse {

  static int modInverse(int alpha, int vocabulary) 
    { 
        int m0 = vocabulary; 
        int y = 0, x = 1; 
  
        if (vocabulary == 1) 
            return 0; 
  
        while (alpha > 1) 
        { 
            // q is quotient 
          
            int q = alpha / vocabulary; 
             System.out.println("q=alpha/vocabulary = "+alpha+"/"+vocabulary+"="+q);
            int t = vocabulary; 
              System.out.println("t=vocabulary:"+t);
            // vocabulary is remainder now, process 
            // same as Euclid's algo 
            vocabulary = alpha% vocabulary; 
            System.out.println("vocabulary=alpha%vocabulary=:"+vocabulary);
            alpha = t; 
            System.out.println("alpha=t:"+alpha);
            t = y; 
            System.out.println("t=y="+y+"="+t);
            
            
            // Update x and y 
            System.out.println("y= x-q*y = "+x+"-"+q+"*"+y);
            y = x - q * y; 
            System.out.println("y ="+y);
            x = t; 
              System.out.println("x=t="+x);
        } 
           // Make x positive 
        if (x < 0) {
            x += m0; 
           System.out.println("x+=m0"+"+="+m0+"="+x);
        }
        System.out.println("return x:"+x);
        return x; 
    }
    public static void main(String[] args) {
        System.out.println("\ninverse:"+Alphainverse.modInverse(5, 12));
    }
    
}
