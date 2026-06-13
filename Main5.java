import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner cz = new Scanner (System.in);
	    int index = cz.nextInt();
		int valores [] = new int [index];
		
        for(int i = 0; i < valores.length; i++){
            valores[i] = cz. nextInt();
        }
		System.out.println("  ");
		for(int i = 0; i < valores.length; i++){
		    System.out.print(valores[i]);
		}
	}
}
