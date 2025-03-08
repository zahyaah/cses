import java.util.*; 
import java.io.*; 
import java.lang.*; 

public class IP_WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        long N = in.nextLong(); 
        in.close(); 
        System.out.print(N + " "); 
        while (N != 1) {
            if (N%2 == 0) {
                N /= 2;
            } else {
                N = N*3+1; 
            }
            System.out.print(N + " "); 
        }
    }
}