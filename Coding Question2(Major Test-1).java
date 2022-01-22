/*NAME: DEEPESH AGARWAL.
ROLL NO: 19EJICS042.
*/

//CODING QUESTION:2
import java.util.*;
import java.io.*;

class Main{
    public static boolean convertBase(int M,int BASE){
        int remainder = M%BASE;
        M = M/BASE;
        while(M>=BASE && (M%BASE == remainder))
            M = M/BASE;
        if(M == remainder){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int BASE = 2;
        
        while(convertBase(M,BASE)!= true){
            BASE++;
        }
        System.out.println(BASE);
    }
}