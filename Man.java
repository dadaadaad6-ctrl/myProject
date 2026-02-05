public class Man {
	static byte la;
	static byte ma;
	public static void main(String[] args) {
		la = 5;
		ma = 4;
		var myNum = 5.99;
		int boy = 11;
		double boy2 = (double) boy;
		System.out.println(boy2);
		System.out.println(myNum);
		boolean isTrue = true;
		System.out.println(isTrue); 
		String x = String.valueOf(la);
		String y = String.valueOf(ma);
		System.out.println(la + ma);
		int arg1 = Integer.parseInt(args[0]);
		int arg2 = Integer.parseInt(args[1]);	
		calculate(arg1, arg2);
	}
	public static void calculate(int a, int b) {
		System.out.println(a + b);
	}
}



