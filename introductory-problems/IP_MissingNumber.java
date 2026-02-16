import java.io.*; 
import java.util.*; 

public class IP_MissingNumber {
    private static final long MOD = 1000000007; 
    
    public static void main(String[] args) throws IOException {
        // if (System.getProperty("ONLINE_JUDGE") == null) { 
        //     PrintStream ps = new PrintStream(new File("/Users/kzaydahmed/Desktop/Practice_Pro/cses/output.txt")); 
        //     InputStream is = new FileInputStream("/Users/kzaydahmed/Desktop/Practice_Pro/cses/input.txt"); 
        //     System.setIn(is); 
        //     System.setOut(ps); 
        // } 
        
        ReadInput in = new ReadInput(); 

        int T = in.nextInt(); 
        long total = T*(T+1L)/2; 
        long sum = 0; 
        
        for (int index = 0; index < T-1; index++) {
            sum += in.nextInt(); 
        }

        System.out.println(total-sum);
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