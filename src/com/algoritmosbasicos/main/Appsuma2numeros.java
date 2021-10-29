package com.algoritmosbasicos.main;
import java.util.Scanner;
public class Appsuma2numeros 
{

	public static void main(String[] args) 
	{
	int iNum1=0;
	int iNum2=0;
	int iResultado=0;
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Give me a number");
	iNum1=entrada.nextInt();
	System.out.println("Give me other number");
	iNum2=entrada.nextInt();
	iResultado=iNum1+iNum2;
	System.out.println("The result is:" +iResultado);
	

	}

}
