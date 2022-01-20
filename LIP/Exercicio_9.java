package LIP;

import java.util.Scanner;

public class Exercicio_9 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		byte escolha=0;
		
		System.out.println("Escolha uma das op��es abaixo:\n1 - B�sicas\n2 - Trigonom�tricas\n3 - Logar�tmicas\n4 - Especiais");
		escolha=in.nextByte();
		
		switch(escolha)
		{
			case 1:
			{
				basicas();
				break;
			}
			case 2:
			{
				trigonometricas();
				break;
			}
			case 3:
			{
				log();
				break;
			}
			case 4:
			{
				especiais();
				break;
			}
			default: 
			{
				System.out.println("Op��o invalida!!!");
			}
		}
		
		System.out.println("\nPrograma finalizado!!!");
		in.close();
	}

	public static void basicas() {
		
		Scanner in = new Scanner(System.in);
		byte escolha=0,valido=0; 
		float num1=0, num2=0;
		
		System.out.println("Escolha uma das op��es abaixo:\n1 - Soma\n2 - Subtra��o\n3 - Multiplica��o\n4 - Modulo\n5 - Divis�o");
		escolha=in.nextByte();
		
		switch(escolha)
		{
			case 1:
			{
				System.out.print("Digite o 1� n�mero ");
				num1=in.nextFloat();
				System.out.print("Digite o 2� n�mero ");
				num2=in.nextFloat();
				
				System.out.println("A soma dos n�meros digitados �: "+(num1+num2));
				break;
			}
			case 2:
			{
				System.out.print("Digite o 1� n�mero ");
				num1=in.nextFloat();
				System.out.print("Digite o 2� n�mero ");
				num2=in.nextFloat();
				
				System.out.println("A diferen�a dos n�meros digitados �: "+(num1-num2));
				break;
			}
			case 3:
			{
				System.out.print("Digite o 1� n�mero ");
				num1=in.nextFloat();
				System.out.print("Digite o 2� n�mero ");
				num2=in.nextFloat();
				
				System.out.println("A multiplica��o dos n�meros digitados �: "+num1*num2);
				break;
			}
			case 4:
			{
				System.out.print("Digite o 1� n�mero ");
				num1=in.nextFloat();
				do 
				{
				System.out.print("Digite o 2� n�mero ");
				num2=in.nextFloat();
				
				if(num2!=0)
				{
					valido=1;
				}
				else
				{
					System.out.println("ERRO: Favor informar outro n�mero!");
					
				}
				}while(valido!=1);
				
				System.out.println("O modulo dos n�meros digitados �: "+num1%num2);
				valido=0;
				break;
			}
			case 5:
			{
				System.out.print("Digite o 1� n�mero ");
				num1=in.nextFloat();
				do 
				{
				System.out.print("Digite o 2� n�mero ");
				num2=in.nextFloat();
				
				if(num2!=0)
				{
					valido=1;
				}
				else
				{
					System.out.println("N�o � possivel dividir por 0. Favor informar outro n�mero!");
					
				}
				}while(valido!=1);
				System.out.println("O modulo dos n�meros digitados �: "+num1/num2);
				valido=0;
				break;
			}
			default: 
			{
				System.out.println("Op��o invalida!!!");
			}
		}
		
		in.close();
	}

	public static void trigonometricas() {
		
		Scanner in = new Scanner(System.in);
		byte escolha=0;
		float num=0;
		
		System.out.println("Escolha uma das op��es abaixo:\n1 - Seno\n2 - Cosseno\n3 - Tangente\n4 -  �rea do c�rculo");
		escolha=in.nextByte();
		
		switch(escolha)
		{
			case 1:
			{
				System.out.print("Digite um n�mero: ");
				num=in.nextFloat();
				System.out.print("O seno do n�mero digitado �: "+Math.sin(num));
				break;		
			}
			case 2:
			{
				System.out.print("Digite um n�mero: ");
				num=in.nextFloat();
				System.out.print("O cosseno do n�mero digitado �: "+Math.cos(num));
				break;		
			}
			case 3:
			{
				System.out.print("Digite um n�mero: ");
				num=in.nextFloat();
				System.out.print("A tangente do n�mero digitado �: "+Math.tan(num));
				break;		
			}
			case 4:
			{
				System.out.print("Digite um n�mero: ");
				num=in.nextFloat();
				System.out.print("A �rea do c�rculo �: "+num*Math.PI);
				break;		
			}
			default:
			{
				System.out.println("Op��o invalida!!!");
			}
		}	
		in.close();	
	}

	public static void log() {
		
		Scanner in = new Scanner(System.in);
		byte escolha=0;
		float num=0;
		
		System.out.println("Escolha uma das op��es abaixo:\n1 - Log2\n2 - Log10");
		escolha=in.nextByte();
		
		if(escolha==1)
		{
			System.out.print("Digite um n�mero: ");
			num=in.nextFloat();
			System.out.println("O log2 do n�mero digitado �: "+(Math.log(num) / Math.log(2)));
		}
		else if(escolha==2)
		{
			System.out.print("Digite um n�mero: ");
			num=in.nextFloat();
			System.out.println("O log2 do n�mero digitado �: "+Math.log10(num));
		}
		else
		{
			System.out.println("Op��o Invalida!!!");
		}
		
		in.close();
	}

	public static void especiais() {
		
		Scanner in = new Scanner(System.in);
		byte escolha=0;
		float num=0, num2=0;
		
		System.out.println("Escolha uma das op��es abaixo:\n1 - Elevado ao quadrado\n2 - Elevado ao cubo\n3 - Elevado a y\n4 - Raiz quadrada\n5 - Raiz cubica\n6 - Raiz de y\n7 - Fatorial\n8 - Fibonacci");
		escolha=in.nextByte();
		
		switch(escolha)
		{
			case 1:
			{
				System.out.print("Digite um n�mero: ");
				num=in.nextFloat();
				System.out.println("O n�mero digitado elevado ao quadrado �: "+Math.pow(num, 2));
				break;
			}
			case 2:
			{
				System.out.print("Digite um n�mero: ");
				num=in.nextFloat();
				System.out.println("O n�mero digitado elevado ao cubo �: "+Math.pow(num, 3));
				break;
			}
			case 3:
			{
				System.out.print("Digite um n�mero: ");
				num=in.nextFloat();
				System.out.print("Informe a pot�ncia: ");
				num2=in.nextFloat();
				System.out.println("O n�mero digitado elevado a Y �: "+Math.pow(num, num2));
				break;
			}
			case 4:
			{
				System.out.print("Digite um n�mero: ");
				num=in.nextFloat();
				System.out.println("A raiz quadrada do n�mero digitado �: "+Math.sqrt(num));
				break;
			}
			case 5:
			{
				System.out.print("Digite um n�mero: ");
				num=in.nextFloat();
				num2=3;
				System.out.println("A raiz cubica do n�mero digitado �: "+Math.pow(num, 1/num2));
				break;
			}
			case 6:
			{
				System.out.print("Digite um n�mero: ");
				num=in.nextFloat();
				System.out.print("Digite um expoente ");
				num2=in.nextFloat();
				System.out.println("A raiz de Y do n�mero digitado �: "+Math.pow(num, 1/num2));
				break;
			}
			case 7:
			{
				System.out.print("Digite um n�mero: ");
				num=in.nextFloat();
				num2=0;
				for(int c=(int)num;c>=1;c--)
				{
					if(num2==0)
					{
						num2=c;
					}
					else
					{
						num2=num2*c;
					}
				}
				System.out.println("O fatorial de "+num+" �:"+num2);
				break;
			}
			case 8:
			{
				fibonacci();
				break;
			}
			default: 
			{
				System.out.println("Op��o Invalida!!!");
			}	
		}
		
		in.close();
		
	}
	
	public static void fibonacci() {
		
		Scanner in = new Scanner(System.in);
		double num=0, res=0, ant1=1, ant2=0;
		
		System.out.print("Escreva um n�mero: ");
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
	
}




