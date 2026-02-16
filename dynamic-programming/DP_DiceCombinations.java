import java.io.*; 
import java.util.*; 

public class DP_DiceCombinations {
    private static final int MOD = 1000000007; 
    
    public static void main(String[] args) throws IOException {
        // if (System.getProperty("ONLINE_JUDGE") == null) { 
        //     PrintStream ps = new PrintStream(new File("/Users/kzaydahmed/Desktop/Practice_Pro/cses/output.txt")); 
        //     InputStream is = new FileInputStream("/Users/kzaydahmed/Desktop/Practice_Pro/cses/input.txt"); 
        //     System.setIn(is); 
        //     System.setOut(ps); 
        // } 
        
        FastScanner in = new FastScanner(); 
        int N = in.nextInt(); 
        
        int[] dp = new int[N+1]; 
        dp[0] = 1; 

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j <= i)
                    dp[i] = (dp[i] + dp[i-j])%MOD; 
            }
        }

        System.out.println(dp[N]);
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
