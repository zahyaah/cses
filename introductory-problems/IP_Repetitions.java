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
        
        // FastScanner in = new FastScanner(); 
        Scanner in = new Scanner(System.in); 
        String S = in.next(); 
        int N = S.length(); 
        in.close(); 

        if (N == 0) { 
            System.out.println(0); 
            return;
        }

        int MAX = 0; 
        int end = 0; 
        int count = 1;  

        while (end < N - 1) { 
            if (S.charAt(end) == S.charAt(end + 1)) {
                count++; 
            } else {
                MAX = Math.max(count, MAX); 
                count = 1;
            }
            end++; 
        }
        
        MAX = Math.max(count, MAX);
        System.out.println(MAX);
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