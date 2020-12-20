import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int t=in.nextInt();
//		int t=1;
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		Solver() {
			int n=in.nextInt();
			int[] a = new int[n+1];
			//assign 1 to n in array
			for(int i=0; i<n; ++i)
				a[i]=i+1;
			//swap a[i] and a[i+1] values using user-defined swap function
			for(int i=0; i<n-1; ++i)
				a[i]=swap(a[i+1], a[i+1]=a[i]);
			for(int i=0; i<n; ++i)
				out.print(a[i]+" ");
			out.println();	
		}
		//user-defined swap function
		int swap(int... args) {
			return args[0];
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	
}
