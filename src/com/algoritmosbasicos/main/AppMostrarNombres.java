package com.algoritmosbasicos.main;

import java.util.Scanner; 

public class AppMostrarNombres 
{
//este es un programa que muestra 10 veces el nombre
	public static void main(String[] args) 
	{
		String sNombre="";
		int cont2=0;
		int variable=0;
		char caracter=' ';
		boolean isTrue=false;
		double valor=0.0;
		float valor2=0.0f;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame tu nombre:");
		sNombre = entrada.nextLine();
		
		for (int cont=0;cont<10;cont++) {
			
			System.out.println("Hola " + sNombre);
		}
		//ciclo while
		System.out.println("Give me your name: ");
		sNombre=entrada.nextLine();
		while (cont2<10)
		{
			System.out.println("hola" +sNombre);
			cont2++;
		
		}
		//ciclo do while
		cont2=0;
		System.out.println("Give me your name:");
		sNombre=entrada.nextLine();
		do 
		{
			System.out.println("Hi "+sNombre);
			cont2++;
		} while(cont2<10);
		
		}
	}
		
     


