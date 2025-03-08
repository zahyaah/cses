import java.io.*; 
import java.util.*; 

public class IP_TwoSets {
    private static final long MOD = 1000000007; 
    
    public static void main(String[] args) throws IOException {
        // if (System.getProperty("ONLINE_JUDGE") == null) { 
        //     PrintStream ps = new PrintStream(new File("/Users/kzaydahmed/Desktop/Practice_Pro/cses/output.txt")); 
        //     InputStream is = new FileInputStream("/Users/kzaydahmed/Desktop/Practice_Pro/cses/input.txt"); 
        //     System.setIn(is); 
        //     System.setOut(ps); 
        // } 
        
        FastScanner in = new FastScanner(); 
        int T = in.nextInt(); 
        long actualSum = T*(T+1L)/2; 
        if ((actualSum&1) == 1) {
            System.out.println("NO");
        } else {
            // 1 2 3 4 5 6 7 8 -> 36 -> 18 -> 
            // 5 + 8
            long halfSum = actualSum/2; 
            System.out.println("YES");
            StringBuilder firstSet = new StringBuilder(); 
            StringBuilder secondSet = new StringBuilder(); 
            int first = 0, second = 0; 

            for (int i = T; i >= 1; i--) {
                if (halfSum >= i) {
                    halfSum -= i; 
                    firstSet.append(i).append(" "); 
                    first++; 
                }
                else {
                    secondSet.append(i).append(" "); 
                    second++; 
                }

            }
            System.out.println(first);
            System.out.println(firstSet);
            System.out.println(second);
            System.out.println(secondSet);
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