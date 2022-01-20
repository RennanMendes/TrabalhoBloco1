package LIP;

import java.util.Scanner;

public class Exercicio_4 {
	
	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		byte escolha=0;
		
		System.out.println("Escolha uma das op��es abaixo:");
		System.out.println("1 - Letras do alfabeto de A at� Z");
		System.out.println("2 - Letras do alfabeto de Z at� A");
		System.out.println("3 - Letras do alfabeto a partir da sua escolha");
		System.out.println("4 - Vogal ou consoante");
		System.out.println("5 - C�lculo de �rea");
		escolha = in.nextByte();
		
		switch(escolha)
		{
			case 1:
			{
				alfabetoCrescente();
				break;
			}
			case 2:
			{
				alfabetoDecrescente();
				break;
			}
			case 3:
			{
				alfabetoVariavel();
				break;
			}
			case 4:
			{
				vogalOuConsoante();
				break;
			}
			case 5:
			{
				area();
				break;
			}
			default:
			{
				System.out.println("Op��o Invalida!");
			}
	
		}
		
		System.out.println("\nPrograma finalizado!!!");
		in.close();
	}
	
	public static void alfabetoCrescente() {
		
		char letra='a';
		for(int c=1;c<=26;c++) 
		{
			System.out.print(letra+"\t");
			letra++;
			
		}
		
	}
	
	public static void alfabetoDecrescente() {
		
		char letra='z';
		for(int c=1;c<=26;c++) 
		{
			System.out.print(letra+"\t");
			letra--;
			
		}
		
	}
	
	public static void alfabetoVariavel() {
		
		Scanner in =new Scanner (System.in);
		char letra;
		
		
		System.out.print("Informe a letra a partir da qual ser� mostrado o alfabeto: ");
		letra=in.nextLine().charAt(0);
		
		while(letra<='z') 
		{
			System.out.print(letra+"\t");
			letra++;			
		}
		
		in.close();
	}

	public static void vogalOuConsoante() {
		
		Scanner in= new Scanner(System.in);
		char letra;
		
		System.out.print("Digite uma letra: ");
		letra = in.nextLine().charAt(0);
		
		if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'||letra=='A'||letra=='E'||letra=='I'||letra=='O'||letra=='U')
		{
			System.out.println("A letra digitada � uma vogal");
		}
		else
		{
			System.out.println("A letra digitada � uma consoante");
		}
		
		in.close();
	}
	
	public static void area() {
		
		Scanner in= new Scanner(System.in);
		byte escolha=0;
		
		System.out.println("Escolha uma op��o de c�lculo:\n1 - Tri�ngulo\n2 - Trap�zio\n3 - C�rculo\n4 - Losango");
		escolha=in.nextByte();
		
		switch (escolha)
		{
			case 1:
			{
				double a=0, b=0, h=0;
				
				System.out.print("Digite o valor da base: ");
				b=in.nextDouble();
				System.out.print("Digite a altura: ");
				h=in.nextDouble();
				
				a=b*h/2;
				
				System.out.print("A �rea do tri�ngulo �: "+a);
				break;
			}
			case 2:
			{
				double a=0, b1=0, b2=0, h=0;
				
				System.out.print("Digite o valor da 1� base: ");
				b1=in.nextDouble();
				System.out.print("Digite o valor da 2� base: ");
				b2=in.nextDouble();
				System.out.print("Digite a altura: ");
				h=in.nextDouble();
				
				a=(b1+b2)*h/2;
				
				System.out.print("A �rea do trap�zio �: "+a);
				break;
			}
			case 3:
			{
				double a=0, r=0;
				
				System.out.print("Digite o valor do raio: ");
				r=in.nextDouble();
				
				a=r*Math.PI;
				
				System.out.print("A �rea do c�rculon �: "+a);
				break;
			}
			case 4:
			{
				double a=0, d1=0, d2=0;
				
				System.out.print("Digite o valor da 1� diagonal: ");
				d1=in.nextDouble();
				System.out.print("Digite o valor da 2� diagonal: ");
				d2=in.nextDouble();
				
				a=d1*d2/2;
				
				System.out.print("A �rea do c�rculon �: "+a);
				break;
			}
			default: 
			{
				System.out.println("\nOp��o Invalida!!!");
			}
		}
		in.close();
		
	}
	
	
}
