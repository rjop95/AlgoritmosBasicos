package com.algoritmosbasicos.main;
import java.util.Scanner;
public class AppEdad
{

	public static void main(String[] args) 
	{
		int iEdad=0;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Dame tu edad:");
		iEdad = entrada.nextInt();
		
		if (iEdad<5)
		{
			System.out.println("Niño");
		}
		else if (iEdad>=5 && iEdad<18)
		{
			System.out.println("Adolecente");
		}
		else if (iEdad>=18 && iEdad<36)
		{
			System.out.println("Cahvorruco");
			
		}
		else if (iEdad==36)
		{
			System.out.println("inmortal");
		}
		else if (iEdad>36)
		{
			System.out.println("viejito");
		}
		//mas facil
		if (iEdad<5)
		{
			System.out.println("Niño");
		}
		if (iEdad>=5 && iEdad<18)
		{
			System.out.println("Adolecente");
		}
		if (iEdad>=18 && iEdad<36)
		{
			System.out.println("Cahvorruco");
			
		}
		if (iEdad==36)
		{
			System.out.println("inmortal");
		}
		if (iEdad>36)
		{
			System.out.println("viejito");

	}

	}
}
