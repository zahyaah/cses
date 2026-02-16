import java.io.*; 
import java.util.*; 

public class IP_WeirdAlgorithm {
    private static final long MOD = 1000000007; 
    
    public static void main(String[] args) throws IOException {
        // if (System.getProperty("ONLINE_JUDGE") == null) { 
        //     PrintStream ps = new PrintStream(new File("/Users/kzaydahmed/Desktop/Practice_Pro/cses/output.txt")); 
        //     InputStream is = new FileInputStream("/Users/kzaydahmed/Desktop/Practice_Pro/cses/input.txt"); 
        //     System.setIn(is); 
        //     System.setOut(ps); 
        // } 
        
        ReadInput in = new ReadInput(); 

        long N = in.nextLong(); 
        for (int i = 1; i < 1e6; i++) {
            System.out.println(N);

            if (N == 1)
                break; 
            
            if ((N&1) == 1)
                N = N*3 + 1; 
            else 
                N = N/2; 
        }
        
    }    

    static class ReadInput {
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