package aplicacion;
import java,util.Scanner;
import mates.Matematicas;

public class principal{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			System.out.println(x: "Introducir número de pasos: ");
			int numeroPasos = sc.nextInt();

		System.out.println("El número pi es " + Matematicas.generarNumeroPi(numeroPasos));
		sc.close();
	}
}
