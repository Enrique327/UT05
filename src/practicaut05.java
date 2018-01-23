import java.util.Scanner;

public class practicaut05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Adivina el número que estoy pensando. Es desde el 1 hasta 10 ");
		
		int aleat = (int) (Math.random()*10+1);
				
		Scanner sc = new Scanner(System.in);		
		int numero = 0;
		int contador = 0;
		
	   while (numero != aleat) {
		   
		   System.out.println("¿Qué número es?: ");
		    numero = sc.nextInt();
			
	   if (numero < aleat) {
			   System.out.println("Es un número mayor.");
	   }
	   if  (numero > aleat) {
				 System.out.println("Es un número más pequeño.");
	}
	   
	   contador++; 
}
	   sc.close();
	   
	   System.out.println("!Has acertado! Y sólo has tardado estos intentos:" + contador);
	   System.out.println("!Bien hecho!");
}
	
	}
