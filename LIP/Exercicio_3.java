package LIP;

import java.util.Scanner;

public class Exercicio_3 {
	
	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		byte escolha=0;
		
		System.out.println("Escolha uma das opções abaixo:\n1 - Par ou impar\n2 - Multiplos de 3\n3 - Multipos de X\n4 - Lanche");
		escolha=in.nextByte();
		
		switch(escolha)
		{
			case 1:
			{
				parOuImpar();
				break;
			}
			case 2:
			{
				multiploDe3(); 
				break;
			}
			case 3:
			{
				multiploDeX();
				break;
			}
			case 4:
			{
				lanche();
				break;
			}
		}
		
		System.out.println("\nPrograma Finalizado!!!");
		in.close();
	}

	public static void parOuImpar() {
		
		Scanner in= new Scanner(System.in);
		int num=0;
		
		System.out.print("Digite um número: ");
		num=in.nextInt();
		
		if(num%2==0)
		{
			System.out.println("O número digitado é par!");
		}
		else
			System.out.println("O número digitado é impar!");
		
		in.close();
	}
	
	public static void multiploDe3() {
		
		for(int x=0;x<=100;x+=3) 
		{
			
			System.out.print(x+"\t");
		}
	}
	
	public static void multiploDeX() {
		
		Scanner in= new Scanner(System.in);
		byte num=0;
		
		System.out.println("Digite um número: ");
		num=in.nextByte();
		
		for(int x=0;x<=100;x+=num) 
		{
			System.out.print(x+"\t");
		}
		in.close();
	}
	
	public static void lanche() {
		
		Scanner in= new Scanner(System.in);
		byte codigo=0;
		int quantidade=0;
		
		System.out.println("Favor digite o código do lanche desejado:");
		System.out.println("     Lanche       Código");
		System.out.println("Cachorro quente    100");
		System.out.println("Bauru simples      101");
		System.out.println("Bauru com ovo      102");
		System.out.println("Hambúrguer         103");
		System.out.println("X-Salada           104");
		codigo=in.nextByte();
		
		System.out.print("Qual é a quantidade desejada: ");
		quantidade=in.nextInt();
		
		switch(codigo)
		{
			case 100:
			{
				System.out.println("O total a pagar é: "+quantidade*3.50);
				break;
			}
			case 101:
			{
				System.out.println("O total a pagar é: "+quantidade*4);
				break;
			}
			case 102:
			{
				System.out.println("O total a pagar é: "+quantidade*4.50);
				break;
			}
			case 103:
			{
				System.out.println("O total a pagar é: "+quantidade*5);
				break;
			}
			case 104:
			{
				System.out.println("O total a pagar é: "+quantidade*6);
				break;
			}
			default:
			{
				System.out.println("Código não encontrado!");
			}
			
			in.close();
		}
		
		
	}
	
}
