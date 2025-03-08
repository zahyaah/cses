import java.io.*; 
import java.util.*; 

public class IP_Permutations {
    private static final long MOD = 1000000007; 
    
    public static void main(String[] args) throws IOException {
        if (System.getProperty("ONLINE_JUDGE") == null) { 
            PrintStream ps = new PrintStream(new File("/Users/kzaydahmed/Desktop/Practice_Pro/cses/output.txt")); 
            InputStream is = new FileInputStream("/Users/kzaydahmed/Desktop/Practice_Pro/cses/input.txt"); 
            System.setIn(is); 
            System.setOut(ps); 
        } 
        
        FastScanner in = new FastScanner(); 
        int N = in.nextInt(); 
        
        if (N == 1)
            System.out.println("1 ");
        else if (N <= 3) 
            System.out.println("NO SOLUTION");
        else {
            StringBuilder sb = new StringBuilder(); 
            for (int i = 2; i <= N; i += 2) {
                sb.append(i).append(" "); 
            }
            for (int i = 1; i <= N; i += 2) {
                sb.append(i).append(" "); 
            }
            System.out.println(sb);
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