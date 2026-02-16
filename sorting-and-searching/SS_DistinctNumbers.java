import java.io.*; 
import java.util.*; 

public class SS_DistinctNumbers {
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
        Map<Integer, Integer> map = new HashMap<>(); 

        for (int i = 0; i < N; i++) {
            int value = in.nextInt(); 
            map.put(value, map.getOrDefault(value, 0)+1); 
        }

        System.out.println(map.size());
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
