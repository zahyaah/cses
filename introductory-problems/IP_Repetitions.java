import java.io.*; 
import java.util.*; 

public class IP_Repetitions {
    private static final long MOD = 1000000007; 
    
    public static void main(String[] args) throws IOException {
        // if (System.getProperty("ONLINE_JUDGE") == null) { 
        //     PrintStream ps = new PrintStream(new File("/Users/kzaydahmed/Desktop/Practice_Pro/cses/output.txt")); 
        //     InputStream is = new FileInputStream("/Users/kzaydahmed/Desktop/Practice_Pro/cses/input.txt"); 
        //     System.setIn(is); 
        //     System.setOut(ps); 
        // } 
        
        ReadInput in = new ReadInput(); 

        String S = in.next(); 
        int N = S.length(); 
        int max = Integer.MIN_VALUE; 

        int start = 0, end = 0; 
        while (end < N) {
            if (S.charAt(start) != S.charAt(end)) {
                max = Math.max(max, end-start); 
                start = end; 
            }
            end++; 
        }
        max = Math.max(max, end-start); 
        System.out.println(max);
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