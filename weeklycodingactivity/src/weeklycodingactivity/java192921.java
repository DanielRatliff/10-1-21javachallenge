package weeklycodingactivity;

public class java192921 {
	
	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		System.out.println("x="+x+" y="+y);
		int[] result = swapnums(x,y);
		System.out.println("x="+result[0]+" y="+result[1]);
		System.out.println();
		System.out.println();
		double i = 3.7;
		double j = 6.3;
		System.out.println("i = "+i+" j = "+j);
		double[] res = swapnums(i,j);
		System.out.println("i="+res[0]+" j="+res[1]);
	}
	
	public static int[] swapnums(int x, int y) {
		x+=y;
		y=x-y;
		x-=y;
		return new int[] {x,y};
	}
	public static double[] swapnums(double x, double y) {
		x+=y;
		y=x-y;
		x-=y;
		return new double[] {x,y};
	}
}
