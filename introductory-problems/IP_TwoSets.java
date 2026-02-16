import java.io.*; 
import java.util.*; 

public class IP_TwoSets {
    private static final long MOD = 1000000007; 
    
    public static void main(String[] args) throws IOException {
        // if (System.getProperty("ONLINE_JUDGE") == null) { 
        //     PrintStream ps = new PrintStream(new File("/Users/kzaydahmed/Desktop/Practice_Pro/cses/output.txt")); 
        //     InputStream is = new FileInputStream("/Users/kzaydahmed/Desktop/Practice_Pro/cses/input.txt"); 
        //     System.setIn(is); 
        //     System.setOut(ps); 
        // } 
        
        // OPTIMISED APPROACH 
        /*
        Key Idea (CSES Two Sets):

        The total sum of numbers from 1 to n is n*(n+1)/2.
        We can split them into two equal-sum sets ONLY if n % 4 == 0 or n % 4 == 3.

        Why?
        Because numbers can be grouped in blocks of 4:
        (i, i+1, i+2, i+3)

        Distribute as:
        Set1 -> i and i+3
        Set2 -> i+1 and i+2

        Both pairs have equal sum:
        i + (i+3) = (i+1) + (i+2)

        If n % 4 == 3, handle first three numbers separately:
        Set1 -> 1, 2
        Set2 -> 3
        Then continue grouping in blocks of 4.
        */
        FastScanner in = new FastScanner(); 
        int T = in.nextInt(); 
        StringBuilder sb = new StringBuilder(); 

        if (T%4 == 0 || T%4 == 3) {
            // pattern repeats every 4 numbers 
            List<Long> list1 = new ArrayList<>(); 
            List<Long> list2 = new ArrayList<>(); 
            if (T%4 == 3) {
                list1.add(1L);  
                list1.add(2L);
                list2.add(3L); 
            }
        
            long startPoint = (T%4 == 0) ? 1L : 4L; 
            for (long i = startPoint; i <= T; i+=4) {
                list1.add(i); 
                list1.add(i+3); 

                list2.add(i+1); 
                list2.add(i+2); 
            }
            sb.append("YES\n");
            sb.append(list1.size()); 
            sb.append("\n"); 
            for (int i = 0; i < list1.size(); i++) {
                sb.append(list1.get(i)); 
                sb.append(" "); 
            }
            sb.append("\n"); 
            sb.append(list2.size()); 
            sb.append("\n"); 
            for (int i = 0; i < list2.size(); i++) {
                sb.append(list2.get(i)); 
                sb.append(" "); 
            }
            System.out.println(sb.toString());
        } else {
            sb.append("NO"); 
            System.out.println(sb.toString()); 
        }







        // MY FIRST APPROACH


        // long sum = (long)(1L*T*(T+1L)/2); 
        // if (sum%2 == 0) {
        //     // System.out.println("YES"); 
        //     long halfSum = sum/2; 

        //     int start = 1, end = T; 
        //     List<Integer> list1 = new ArrayList<>(); 
        //     List<Integer> list2 = new ArrayList<>(); 
        //     boolean[] used = new boolean[T+1]; 

        //     while (halfSum > 0) {
        //         if (halfSum >= end) {
        //             halfSum -= end; 
        //             list1.add(end); 
        //             used[end] = true; 
        //             end--; 
        //         } else {
        //             halfSum -= start; 
        //             list1.add(start); 
        //             used[start] = true; 
        //             start++; 
        //         }
        //     }

        //     for (int i = 1; i <= T; i++) {
        //         if (!used[i]) {
        //             list2.add(i); 
        //         }
        //     }

        //     // System.out.println(list1.size());
        //     // for (int i = 0; i < list1.size(); i++) {
        //     //     System.out.print(list1.get(i)); 
        //     //     System.out.print(" "); 
        //     // }
        //     // System.out.println();
        //     // System.out.println(list2.size());
        //     // for (int i = 0; i < list2.size(); i++) {
        //     //     System.out.print(list2.get(i)); 
        //     //     System.out.print(" "); 
        //     // }

        //     StringBuilder sb = new StringBuilder();

        //     sb.append("YES\n");

        //     sb.append(list1.size()).append("\n");
        //     for (int x : list1) {
        //         sb.append(x).append(" ");
        //     }
        //     sb.append("\n");

        //     sb.append(list2.size()).append("\n");
        //     for (int x : list2) {
        //         sb.append(x).append(" ");
        //     }
        //     sb.append("\n");

        //     System.out.print(sb.toString());
        // } else {
        //     System.out.println("NO");
        // }
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
