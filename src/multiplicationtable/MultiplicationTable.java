package multiplicationtable;

import java.util.*;

/**
 *
 * @author Erfan
 */
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Random  r = new Random ();
        int RND1 , RND2 , Ans;        
        RND1 = r.nextInt(10);
        RND2 = r.nextInt(10);
        int [][] m = new int [RND1][RND2];
        System.out.println("How much is "+RND1+" times "+RND2+" ?");
        Ans = s.nextInt();
        if (Ans == (RND1*RND2)) {
            System.out.println("**Great**");
        }else {
            for (int i = 0; i < RND1; i++) {
                for (int j = 0; j < RND2; j++) {
                    System.out.print("| ");
                }
                System.out.println("");               
            }
                System.out.format("Sum of these %d X %d is = %d\n",RND1,RND2,RND1*RND2);
        }
    }
    
}
