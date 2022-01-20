package LIP;

import java.util.*;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		byte escolha =0;
		int repete=1;
		
		
		while(repete==1){
			
			System.out.println("Escola uma opção sendo:\n1 - Compara Altura\n2 - Compara peso\n3 - Ordem crescente\n4 - Dias da semana");
			escolha=in.nextByte();
			
			switch(escolha)
			{
				case 1:
				{
					comparaAltura();
					break;
				}
				case 2:
				{
					comparaPeso();
					break;				
				}
				case 3:
				{
					ordemCrescente();
					break;
				}
				case 4:
				{
					diasDaSemana();
					break;
				}
				default:
				{
					System.out.println("Opção Invalida!");
				}
			}
			escolha=0;
			System.out.println("Deseja repetir?\n1 - Sim\n2 - Não");
			repete=in.nextInt();
			
		};
		
		System.out.println("Programa finalizado!!!");
		in.close();	
		
	}
	
	public static void comparaAltura() {
		
		Scanner ler = new Scanner (System.in);
		double alturaA=0, alturaB=0;
		
		System.out.print("Informe a altura da pessoa A: ");
		alturaA= ler.nextFloat();
		System.out.print("Informe a altura da pessoa B: ");
		alturaB= ler.nextFloat();
		
		if(alturaA>alturaB) 
		{
			System.out.println("A é maior que B");
		}
		else
		{
			System.out.println("B é maior que A");
		}
		ler.close();
		
	}
	
	public static void comparaPeso() {
		
		Scanner ler = new Scanner (System.in);
		double pesoA=0, pesoB=0;
		
		System.out.print("Informe a altura da pessoa A: ");
		pesoA= ler.nextFloat();
		System.out.print("Informe a altura da pessoa B: ");
		pesoB= ler.nextFloat();
		
		if(pesoA>pesoB) 
		{
			System.out.println("A é mais pesado que B");
		}
		else if(pesoA<pesoB)
		{
			System.out.println("B é mais pesado que A");
		}
		else
		{
			System.out.println("As duas pessoas têm o mesmo peso");
		}
		ler.close();
	}
	
	public static void ordemCrescente() {
		
		Scanner in = new Scanner(System.in);
		int x=0, y=0,z=0, aux=0;
		
		System.out.print("Informe o valor de X: ");
		x=in.nextInt();
		System.out.print("Informe o valor de Y: ");
		y=in.nextInt();
		System.out.print("Informe o valor de Z: ");
		z=in.nextInt();
			
		if(x>z)
		{
			aux=x;
			x=z;
			z=aux;
		}
		
		if(x>y)
		{
			aux=x;
			x=y;
			y=aux;
		}
		
		if(y>z)
		{
			aux=y;
			y=z;
			z=aux;
		}

		System.out.println("\nOs valores em oredem crscente são: \n"+x+"\n"+y+"\n"+z);
		in.close();
	}
	
	public static void diasDaSemana() {
		
		Scanner in = new Scanner(System.in);
		byte num=0;
		
		System.out.print("Digite um número entre 1 e 7: ");
		num=in.nextByte();
		
		switch(num) 
		{
			case 1:
			{
				System.out.println("Domingo");
				break;
			}
			case 2:
			{
				System.out.println("Segunda-feira");
				break;
			}
			case 3:
			{
				System.out.println("Terça-feira");
				break;
			}
			case 4:
			{
				System.out.println("Quarta-feira");
				break;
			}
			case 5:
			{
				System.out.println("Quinta-feira");
				break;
			}
			case 6:
			{
				System.out.println("Sexta-feira");
				break;
			}
			case 7:
			{
				System.out.println("Sábado");
				break;
			}
			default:
			{
				System.out.println("Número invalido!!!");
			}
		
			in.close();
		}	
	}


}
