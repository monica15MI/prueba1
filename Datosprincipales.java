package Constructores;

import java.util.Scanner;

public class Datosprincipales {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nombre="";
		int edad=0;
		int antiguedad=0;
		String sexo="";
		String categoria="";
		int n=0;
		String devolver="";
		int i=0;
		
		Empleado [] meterempleados = null;
		System.out.println("¿Cuántos empleados quieres insertar?");
		n =scan.nextInt();
		meterempleados=new Empleado[n];
		
		for ( i = 0; i < n; i++) {
			
			System.out.println("Introduce el nombre ");
			nombre=scan.next();
			System.out.println("Introduce la edad ");
			edad=scan.nextInt();
			Empleado llamar1= new Empleado(nombre, edad);
			System.out.println("Introduce los años en la empresa ");
			antiguedad=scan.nextInt();
			System.out.println("Introduce el sexo ");
			sexo=scan.next();
			System.out.println("Introduce la categoría ");
			categoria=scan.next();
			
			devolver= llamar1.empleado2(antiguedad, sexo, categoria);
			
			if (devolver=="KO") {
				System.out.println("Uno de los datos no es correcto");
			}
			else {
				meterempleados[i]=llamar1;
				System.out.println("El empleado ha sido guardado");
			}
			
		}
	
		
		
			
		
			
		


	}

}
