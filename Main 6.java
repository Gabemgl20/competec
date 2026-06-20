import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner cz = new Scanner (System.in);
		int Numeros [] = new int [5];
		
        for(int i = 0; i < Numeros.length; i++){
            Numeros[i] = cz. nextInt();
        }
		System.out.println("  ");
		for(int i = 0; i < Numeros.length; i++){
		    System.out.print(Numeros[i] + "  ");
		}
		System.out.println();
		boolean TNIS = false;
		
		for(int i = 0; i < Numeros.length; i++){
		        int va=0;
		    for(int x = 0; x < Numeros.length; x++){
		        if (Numeros[i] == Numeros[x]){
		        va++;
		        }
		    }
		        if(va == 3) {
		            TNIS = true; 
		            break;
		        }
		}
		        if (TNIS){
		            System.out.println("Sim");
		        }else {
		            System.out.println("Não");
		        }
		        cz.close();
	}
}