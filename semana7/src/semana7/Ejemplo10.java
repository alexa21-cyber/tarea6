package semana7;
import java.util.Scanner;
public class Ejemplo10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int mes=1;
		double cant,ah=0;
		do {
			mes++;
			System.out.println("Ingrese la cantidad ");
			cant=scan.nextDouble();
			ah=ah+cant;
			System.out.println("Su cantidad de ahorro del mes "+(mes-1)+" es: "+ah);
		}while(mes<=12);
		System.out.println("Su ahorro final es: "+ah);

	}

}
