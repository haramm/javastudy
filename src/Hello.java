public class Hello {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int j = 1;
		double[] Array = new double[4];
		Array[0] = a+b;
		Array[1] = a-b;
		Array[2] = a*b;
		Array[3] = (double)a/b;
		for (double i : Array) {
			
			switch(j) {
			case 1:
				System.out.print("a + b = ");
				j = j+1;
				break;
			case 2:
				System.out.print("a - b = ");
				j =j +1;
				break;
			case 3:
				System.out.print("a 곱하기 b = ");
				j = j+1;
				break;
				
			case 4:
				System.out.print("a 나누기 b = ");
				j = j+1;
				break;
				
			}
			
			System.out.println(i);
			
		}
		
	}
}
