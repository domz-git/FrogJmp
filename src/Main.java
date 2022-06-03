public class Main {
	public static void main(String[] args) {
		
		int X, Y, D;
		X=10;
		Y=85;
		D=30;
		
		System.out.print("----"+solution(X, Y, D));

	}
	
	public static int solution(int X, int Y, int D) {
		
		int c=0;
		while(true) {
			if(X>=Y) {
				break;
			}
			X+=D;
			c++;
		}
		return c;
	}

}
