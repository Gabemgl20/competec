import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner cz = new Scanner (System.in);
		
		int x=1;
		int soma=0;
		
		while (x<=100)
		{
		    soma += x;
		    x++;
		}
		System.out.println(soma);
		
	}
}