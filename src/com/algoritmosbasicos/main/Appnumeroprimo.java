package com.algoritmosbasicos.main;
import java.util.Scanner;

public class Appnumeroprimo 
{

	public static void main(String[] args) 
	{
		int iNum=0;
		char cRes=' ';
		boolean isPrimo=true;
		
		Scanner entrada= new Scanner(System.in);
		
		do {
			isPrimo=true;
		System.out.println("Ingresese un numero:");
		
		iNum=entrada.nextInt();
		
		for (int cont=2;cont<iNum;cont++)
		{
			if (iNum%cont==0)
			{
				isPrimo=false;
			}
		}
		
		System.out.println("El numero introducido es primo?: " + isPrimo);
		System.out.println("Deseas calcular otro numero?" );
		cRes=entrada.next().charAt(0);
		}while (cRes=='s' || cRes=='S');
	}

}
