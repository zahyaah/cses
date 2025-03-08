import java.io.*; 
import java.util.*; 

public class IP_CoinPiles {
    private static final long MOD = 1000000007; 
    
    public static void main(String[] args) throws IOException {
        // if (System.getProperty("ONLINE_JUDGE") == null) { 
        //     PrintStream ps = new PrintStream(new File("/Users/kzaydahmed/Desktop/Practice_Pro/cses/output.txt")); 
        //     InputStream is = new FileInputStream("/Users/kzaydahmed/Desktop/Practice_Pro/cses/input.txt"); 
        //     System.setIn(is); 
        //     System.setOut(ps); 
        // } 
        
        FastScanner in = new FastScanner(); 
        int N = in.nextInt(); 

        for (int i = 0; i < N; i++) {
            int A = in.nextInt(); 
            int B = in.nextInt();   

            if (solve(A, B))
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }    
    public static boolean solve(int A, int B) {
        if ((A+B)%3 == 0 && 2*A >= B && 2*B >= A)
            return true; 
        return false; 
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

