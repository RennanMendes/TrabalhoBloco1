package LIP;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		byte escolha=0;
		
		System.out.println("Escolha uma das opções abaixo:\n1 - Fibonacci\n2 - Progressão aritmética\n3 - Progressão Geometrica\n4 - Triangulo");
		escolha = in.nextByte();
		
		switch(escolha) 
		{
			case 1:
			{
				fibonacci();
				break;
			}
			case 2:
			{
				progressaoAritimetica();
				break;
			}
			case 3:
			{
				progressaoGeometrica();
				break;
			}
			case 4:
			{
				triangulo();
				break;
			}
			default:
			{
				System.out.println("Opção Invalida!!!");
			}
		}
		
		System.out.println("Programa finalizado!!!");
		in.close();
	}
	
	
	public static void fibonacci() {
		
		Scanner in = new Scanner(System.in);
		double num=0, res=0, ant1=1, ant2=0;
		
		System.out.print("Escreva um número: ");
		num = in.nextDouble();
		
		while(res<=num)
		{
			System.out.println(res+"\t");
			res=ant1+ant2;
			ant2=ant1;
			ant1=res;
		}
		
		in.close();
		
	}
	
	public static void progressaoAritimetica() {
		
		Scanner in = new Scanner (System.in);
		
		int inicio=0, razao=0, finalizacao=0,x=0;
		
		
		System.out.println("Informe o número de inicio: ");
		inicio= in.nextInt();
		System.out.println("Informe a razão: ");
		razao= in.nextInt();
			
			do
			{
			System.out.println("Informe a finalização: ");
			finalizacao= in.nextInt();
			
			if (inicio+razao<=finalizacao)
			{
				x=1;
			}
			else
			{
				System.out.println("ERRO: Valor de finalização invalido! Favor informar outro número: ");
			}
			
		}while(x==0);
		
		for (int c=inicio;c<=finalizacao;c+=razao)
		{
			System.out.println(c+"\t");
		}
		
		in.close();
	}

	public static void progressaoGeometrica() {
		
		Scanner in = new Scanner (System.in);
		
		int inicio=0, razao=0, finalizacao=0,x=0;
		
		
		System.out.println("Informe o número de inicio: ");
		inicio= in.nextInt();
		System.out.println("Informe a razão: ");
		razao= in.nextInt();
			
			do
			{
			System.out.println("Informe a finalização: ");
			finalizacao= in.nextInt();
			
			if (inicio+razao<=finalizacao)
			{
				x=1;
			}
			else
			{
				System.out.println("ERRO: Valor de finalização invalido! Favor informar outro número: ");
			}
			
		}while(x==0);
		
		for (int c=inicio;c<=finalizacao;c=c*razao)
		{
			System.out.println(c+"\t");
			if (c==0)
			{
				c=razao;
				System.out.println(c+"\t");
			}
		}
		
		in.close();
	}
	
	public static void triangulo() {
		
		Scanner in = new Scanner(System.in);
		int lados[]=new int[3];
		boolean isoceles=false, formaTriangulo=true;
		
		for(int c=0;c<=2;c++)
		{
			System.out.print("Digite o valor do "+(c+1)+"° lados do triangulo: ");
			 lados[c] = in.nextInt();			
		}
		
		for(int x=0;x<=2;x++)
		{
			for (int y=0;y<=0;y++)
			{
				if(x!=y) 
				{
					if(lados[x]==lados[y])
					{
						isoceles=true;
					}	
				}
				
			}	
		}
		
		for(int x=0;x<=2;x++)
		{
			for (int y=0;y<=2;y++)
			{
				for (int z=0;z<=2;z++)
				{
					if(x!=y && x!=z && y!=z) 
					{
						if(lados[x]+lados[y]<lados[z])
						{
							formaTriangulo=false;
						}	
					}
				
				}	
			}
		}
		
		
		if(lados[0]==lados[1]&&lados[1]==lados[2])
		{
			System.out.println("Os valores digitados formam um triângulo equilátero");
		}
		else if (isoceles && formaTriangulo)
		{
			System.out.println("Os valores digitados formam um triângulo isósceles");
		}
		else if (formaTriangulo)
		{
			System.out.println("Os valores digitados formam um triângulo escaleno");
		}
		else
		{
			System.out.println("Os valores digitados não formam um triângulo");
		}
		
		in.close();
		
	}
	
	
	
	
	
}
