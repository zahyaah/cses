import java.io.*; 
import java.util.*; 

public class SS_SumOfTwoValues {
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
        long X = in.nextLong(); 
        long[] arr = new long[N]; 
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt(); 
        }
        Map<Long, Long> map = new HashMap<>(); 
        long[] result = new long[] {-1, -1}; 

        for (int i = 0; i < N; i++) {
            long compliment = X - arr[i]; 
            if (map.containsKey(compliment)) {
                result[0] = map.get(compliment); 
                result[1] = i; 
            }
            map.put(arr[i], (long)i); 
        }
        if (result[0] != -1) {
            System.out.println((result[0]+1) + " " + (result[1]+1)); 
        }
        else {
            System.out.println("IMPOSSIBLE");
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
