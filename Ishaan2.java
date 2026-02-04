public class Ishaan2 {
	static int la;
	static int ma;
	public static void main(String[] args) {
		la = 5;
		ma = 4;
		String x = String.valueOf(la);
		String y = String.valueOf(ma);
		System.out.println(la + ma);
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		calculate(a, b);
	}
  	public static void calculate(int c, int d) {
		System.out.println(c + d); 
	}
}

