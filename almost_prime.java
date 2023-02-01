import java.io.*;
import java.util.*;
public class almost_prime {
    public static class Task {
        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            int n = sc.nextInt();
            int cnt=0,cnt1=0;
            for(int i=2;i<n;i++)
            {
            	for(int j=2;j<i;j++)
            	{
            		if(i%j==0)
            		{
            			cnt++
            		}
            	}
            	if(cnt==2)
            	{
            		pw.println(i);
            		cnt1++;
           	 	}
            	cnt=0;
        	}
            
           	pw.println(cnt1);
            
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader(System.getenv("INPUT")));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream(System.getenv("OUTPUT"))));
        // Scanner sc = new Scanner(System.in);
        // PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        Task t = new Task();
        // int T = sc.nextInt();
        // while (T-- > 0)
            t.solve(sc, pw);
        pw.close();
    }
}
class Scanner {
    private StringTokenizer st;
    private BufferedReader br;
    public Scanner(InputStream s) {
        br = new BufferedReader(new InputStreamReader(s));
    }
    public Scanner(FileReader s) throws FileNotFoundException {
        br = new BufferedReader(s);
    }
    public String next() throws IOException {
        while (st == null || ! st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }
    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }
    public String nextLine() throws IOException {
        return br.readLine();
    }
    public double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
    public int[] readIntArray(int n) throws IOException {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = nextInt();
        return arr;
    }
    public long[] readLongArray(int n) throws IOException {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = nextLong();
        return arr;
    }
}