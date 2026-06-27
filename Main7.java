public class Main
{
	public static void main(String[] args) {
		double table [] [] = new double [5] [3];
		table [0] [0] = 6.70;
		table [0] [1] = 8.00;
		table [0] [2] = 10.00;
		table [1] [0] = 6;
		table [1] [1] = 9;
		table [1] [2] = 10;
		table [2] [0] = 6;
		table [2] [1] = 8;
		table [2] [2] = 9;
		table [3] [0] = 0;
		table [3] [1] = 2;
		table [3] [2] = 5;
		table [4] [0] = 10;
		table [4] [1] = 9.9;
		table [4] [2] = 10;
		double soma1 = (table [0][0] + table [0][1] + table [0][2]);
		System.out.printf("%.2f", soma1 / 3);
		System.out.println(" ");
		double soma2 = (table [1][0] + table [1][1] + table [1][2]);
	    System.out.printf("%.2f", soma2 / 3);
	    System.out.println(" ");
		double soma3 = (table [2][0] + table [2][1] + table [2][2]);
		System.out.printf("%.2f", soma3 / 3);
		System.out.println(" ");
		double soma4 = (table [3][0] + table [3][1] + table [3][2]);
		System.out.printf("%.2f", soma4 / 3);
		System.out.println(" ");
		double soma5 = (table [4][0] + table [4][1] + table [4][2]);
		System.out.printf("%.2f", soma5 / 3);

	}
}
