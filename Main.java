import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner cz = new Scanner(System.in);
		
		int id1;
		int id2;
		
		System.out.println("Qual é a primeira idade?");
		id1 = cz.nextInt();
		System.out.println("Qual é a segunda idade?");
		id2 = cz.nextInt();
		if (id1 == id2)
		{
		    System.out.println("As duas são iguais");
		}
		else
		{
		    System.out.println("As duas são diferentes");
		}
		if (id1 >= 18)
		{
		    System.out.println("A primeira é maior de idade");
		}
		else
		{
		    System.out.println("A primeira é menor de idade");
		}
		
	}
}
