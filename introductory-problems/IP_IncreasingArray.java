import java.io.*; 
import java.util.*; 

public class IP_IncreasingArray {
    private static final long MOD = 1000000007; 
    
    public static void main(String[] args) throws IOException {
        // if (System.getProperty("ONLINE_JUDGE") == null) { 
        //     PrintStream ps = new PrintStream(new File("/Users/kzaydahmed/Desktop/Practice_Pro/cses/output.txt")); 
        //     InputStream is = new FileInputStream("/Users/kzaydahmed/Desktop/Practice_Pro/cses/input.txt"); 
        //     System.setIn(is); 
        //     System.setOut(ps); 
        // } 
        
        ReadInput in = new ReadInput(); 

        int N = in.nextInt(); 
        long[] A = new long[N]; 

        for (int i = 0; i < N; i++) {
            A[i] = in.nextLong(); 
        }
        long count = 0; 
        for (int i = 1; i < N; i++) {
            if (A[i-1] > A[i]) {
                long difference = A[i-1]-A[i]; 
                A[i] += difference; 
                count += difference; 
            }
        }
        System.out.println(count);
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