import java.io.*;
import java.util.*;

public class IP_NumberSpiral {
    public static void main(String[] args) throws IOException {
        // if (System.getProperty("ONLINE_JUDGE") == null) { 
        //     PrintStream ps = new PrintStream(new File("/Users/kzaydahmed/Desktop/OpenSourced/cses/introductory-problems/output.txt")); 
        //     InputStream is = new FileInputStream("/Users/kzaydahmed/Desktop/OpenSourced/cses/introductory-problems/input.txt"); 
        //     System.setIn(is); 
        //     System.setOut(ps); 
        // } 

        FastScanner in = new FastScanner();
        int T = in.nextInt(); 

        while (T-- > 0) {
            long y = in.nextLong();
            long x = in.nextLong();
            System.out.println(solve(x, y));
        }
    }    

    public static long solve(long x, long y) {
        long maxi = Math.max(x, y);
        long square = (maxi - 1) * (maxi - 1);

        if (maxi % 2 == 0) {
            if (x > y) {
                return square + y;
            } else {
                return (maxi * maxi) - x + 1;
            }
        } else {
            if (x > y) {
                return (maxi * maxi) - y + 1;
            } else {
                return square + x;
            }
        }
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}