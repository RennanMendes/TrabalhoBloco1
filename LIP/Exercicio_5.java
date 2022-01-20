package LIP;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		byte escolha;
		
		System.out.println("Escolha uma das opções abaixo:\n1 - Tabuada do 8\n2 - Tabuada X\n3 - Tabuada do 1 ao 10");
		escolha = in.nextByte();
		
		switch (escolha)
		{
			case 1:
			{
				tabuada8();
				break;
			}
			case 2:
			{
				tabuadaX();
				break;
			}
			case 3:
			{
				tabuada1ao10();
				break;
			}
			default:
			{
				System.out.println("Opção invalida!!!");
			}
		}
		
		System.out.println("\nPrograma finalizado!!!");
		in.close();
	}
	
	public static void tabuada8() {
		
		Scanner in = new Scanner(System.in);
		byte ordem;
		
		System.out.println("Escolha uma opção de visualização:\n1 - Crescente\n2 - Decrescente");
		ordem=in.nextByte();
		
		if(ordem==1) 
		{
			for(int m=1;m<=10;m++)
			{
				System.out.println(m+" X 8 = "+m*8);
			}
		}
		else if(ordem==2) 
		{
			for(int m=10;m>=1;m--)
			{
				System.out.println(m+" X 8 = "+m*8);
			}
		}
		else
		{
			System.out.println("Opção Invalida!!!");
		}
		
		in.close();
	}

	public static void tabuadaX() {
		
		Scanner in = new Scanner(System.in);
		byte ordem, num=0;
		
		System.out.println("Qual tabuada deseja visualizar?");
		num=in.nextByte();
		System.out.println("Escolha uma opção de visualização:\n1 - Crescente\n2 - Decrescente");
		ordem=in.nextByte();
		
		if(ordem==1) 
		{
			for(int m=1;m<=10;m++)
			{
				System.out.println(m+" X "+num+" = "+m*num);
			}
		}
		else if(ordem==2) 
		{
			for(int m=10;m>=1;m--)
			{
				System.out.println(m+" X "+num+" = "+m*num);
			}
		}
		else
		{
			System.out.println("Opção Invalida!!!");
		}
		
		in.close();
	}
	
	public static void tabuada1ao10() {
		
		Scanner in = new Scanner(System.in);
		byte ordem;
		
		
		System.out.println("Escolha uma opção de visualização:\n1 - Crescente\n2 - Decrescente");
		ordem=in.nextByte();
		
		if(ordem==1) 
		{
			for(int t=1;t<=10;t++)
			{
				for(int m=1;m<=10;m++)
				{
					System.out.println(m+" X "+t+" = "+m*t);
				}
				System.out.println("\n");
			}
			
		}
		else if(ordem==2) 
		{
			for(int t=1;t<=10;t++)
			{
				for(int m=10;m>=1;m--)
				{
					System.out.println(m+" X "+t+" = "+m*t);
				}
				System.out.println("\n");
			}			
		}
		else
		{
			System.out.println("Opção Invalida!!!");
		}
		
		in.close();
	}
		
	
}





























