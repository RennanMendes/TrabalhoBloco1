package LIP;

import java.util.Scanner;

public class Exercicio_9 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		byte escolha=0;
		
		System.out.println("Escolha uma das opções abaixo:\n1 - Básicas\n2 - Trigonométricas\n3 - Logarítmicas\n4 - Especiais");
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
				System.out.println("Opção invalida!!!");
			}
		}
		
		System.out.println("\nPrograma finalizado!!!");
		in.close();
	}

	public static void basicas() {
		
		Scanner in = new Scanner(System.in);
		byte escolha=0,valido=0; 
		float num1=0, num2=0;
		
		System.out.println("Escolha uma das opções abaixo:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Modulo\n5 - Divisão");
		escolha=in.nextByte();
		
		switch(escolha)
		{
			case 1:
			{
				System.out.print("Digite o 1º número ");
				num1=in.nextFloat();
				System.out.print("Digite o 2º número ");
				num2=in.nextFloat();
				
				System.out.println("A soma dos números digitados é: "+(num1+num2));
				break;
			}
			case 2:
			{
				System.out.print("Digite o 1º número ");
				num1=in.nextFloat();
				System.out.print("Digite o 2º número ");
				num2=in.nextFloat();
				
				System.out.println("A diferença dos números digitados é: "+(num1-num2));
				break;
			}
			case 3:
			{
				System.out.print("Digite o 1º número ");
				num1=in.nextFloat();
				System.out.print("Digite o 2º número ");
				num2=in.nextFloat();
				
				System.out.println("A multiplicação dos números digitados é: "+num1*num2);
				break;
			}
			case 4:
			{
				System.out.print("Digite o 1º número ");
				num1=in.nextFloat();
				do 
				{
				System.out.print("Digite o 2º número ");
				num2=in.nextFloat();
				
				if(num2!=0)
				{
					valido=1;
				}
				else
				{
					System.out.println("ERRO: Favor informar outro número!");
					
				}
				}while(valido!=1);
				
				System.out.println("O modulo dos números digitados é: "+num1%num2);
				valido=0;
				break;
			}
			case 5:
			{
				System.out.print("Digite o 1º número ");
				num1=in.nextFloat();
				do 
				{
				System.out.print("Digite o 2º número ");
				num2=in.nextFloat();
				
				if(num2!=0)
				{
					valido=1;
				}
				else
				{
					System.out.println("Não é possivel dividir por 0. Favor informar outro número!");
					
				}
				}while(valido!=1);
				System.out.println("O modulo dos números digitados é: "+num1/num2);
				valido=0;
				break;
			}
			default: 
			{
				System.out.println("Opção invalida!!!");
			}
		}
		
		in.close();
	}

	public static void trigonometricas() {
		
		Scanner in = new Scanner(System.in);
		byte escolha=0;
		float num=0;
		
		System.out.println("Escolha uma das opções abaixo:\n1 - Seno\n2 - Cosseno\n3 - Tangente\n4 -  Área do círculo");
		escolha=in.nextByte();
		
		switch(escolha)
		{
			case 1:
			{
				System.out.print("Digite um número: ");
				num=in.nextFloat();
				System.out.print("O seno do número digitado é: "+Math.sin(num));
				break;		
			}
			case 2:
			{
				System.out.print("Digite um número: ");
				num=in.nextFloat();
				System.out.print("O cosseno do número digitado é: "+Math.cos(num));
				break;		
			}
			case 3:
			{
				System.out.print("Digite um número: ");
				num=in.nextFloat();
				System.out.print("A tangente do número digitado é: "+Math.tan(num));
				break;		
			}
			case 4:
			{
				System.out.print("Digite um número: ");
				num=in.nextFloat();
				System.out.print("A área do círculo é: "+num*Math.PI);
				break;		
			}
			default:
			{
				System.out.println("Opção invalida!!!");
			}
		}	
		in.close();	
	}

	public static void log() {
		
		Scanner in = new Scanner(System.in);
		byte escolha=0;
		float num=0;
		
		System.out.println("Escolha uma das opções abaixo:\n1 - Log2\n2 - Log10");
		escolha=in.nextByte();
		
		if(escolha==1)
		{
			System.out.print("Digite um número: ");
			num=in.nextFloat();
			System.out.println("O log2 do número digitado é: "+(Math.log(num) / Math.log(2)));
		}
		else if(escolha==2)
		{
			System.out.print("Digite um número: ");
			num=in.nextFloat();
			System.out.println("O log2 do número digitado é: "+Math.log10(num));
		}
		else
		{
			System.out.println("Opção Invalida!!!");
		}
		
		in.close();
	}

	public static void especiais() {
		
		Scanner in = new Scanner(System.in);
		byte escolha=0;
		float num=0, num2=0;
		
		System.out.println("Escolha uma das opções abaixo:\n1 - Elevado ao quadrado\n2 - Elevado ao cubo\n3 - Elevado a y\n4 - Raiz quadrada\n5 - Raiz cubica\n6 - Raiz de y\n7 - Fatorial\n8 - Fibonacci");
		escolha=in.nextByte();
		
		switch(escolha)
		{
			case 1:
			{
				System.out.print("Digite um número: ");
				num=in.nextFloat();
				System.out.println("O número digitado elevado ao quadrado é: "+Math.pow(num, 2));
				break;
			}
			case 2:
			{
				System.out.print("Digite um número: ");
				num=in.nextFloat();
				System.out.println("O número digitado elevado ao cubo é: "+Math.pow(num, 3));
				break;
			}
			case 3:
			{
				System.out.print("Digite um número: ");
				num=in.nextFloat();
				System.out.print("Informe a potência: ");
				num2=in.nextFloat();
				System.out.println("O número digitado elevado a Y é: "+Math.pow(num, num2));
				break;
			}
			case 4:
			{
				System.out.print("Digite um número: ");
				num=in.nextFloat();
				System.out.println("A raiz quadrada do número digitado é: "+Math.sqrt(num));
				break;
			}
			case 5:
			{
				System.out.print("Digite um número: ");
				num=in.nextFloat();
				num2=3;
				System.out.println("A raiz cubica do número digitado é: "+Math.pow(num, 1/num2));
				break;
			}
			case 6:
			{
				System.out.print("Digite um número: ");
				num=in.nextFloat();
				System.out.print("Digite um expoente ");
				num2=in.nextFloat();
				System.out.println("A raiz de Y do número digitado é: "+Math.pow(num, 1/num2));
				break;
			}
			case 7:
			{
				System.out.print("Digite um número: ");
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
				System.out.println("O fatorial de "+num+" é:"+num2);
				break;
			}
			case 8:
			{
				fibonacci();
				break;
			}
			default: 
			{
				System.out.println("Opção Invalida!!!");
			}	
		}
		
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
	
}




