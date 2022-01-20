package LIP;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		byte escolha=0;
		
		System.out.println("Escolha uma das opções abaixo:\n1 - Ordem Crescente\n2 - Maior e menor\n3 - Caracteres");
		escolha = in.nextByte();
		
		switch(escolha)
		{
			case 1:
			{
				ordemCrescente();
				break;
			}
			case 2:
			{
				maiorEMenor();
				break;
			}
			case 3:
			{
				caracter();
				break;
			}
			default:
			{
				System.out.println("Opção Invalida!!!");
			}
		}
		
		System.out.println("\nPrograma Finalizado!!!");
		in.close();
	}
	
	public static void ordemCrescente() {
		
		Scanner in = new Scanner (System.in);
		int vet[]=new int[50], aux=0;
		
		System.out.println("Digite os 50 números: ");
		for(int c=0;c<50;c++)
		{
			vet[c]=in.nextInt();
		}
		
		for(int repete=0;repete<50;repete++)
		{
			for(int ordem=1;ordem<50;ordem++)
			{
				if(vet[ordem]<vet[ordem-1])
				{
					aux=vet[ordem];
					vet[ordem]=vet[ordem-1];
					vet[ordem-1]=aux;
				}
			}
		}
		
		for(int c=0;c<50;c++)
		{
			System.out.print(vet[c]+"\t");
		}
		
		in.close();
		
	}
	
	public static void maiorEMenor() {
		
		Scanner in = new Scanner (System.in);
		int vet[]=new int[10], maior=0, menor=0;
		
		System.out.println("Digite 10 números: ");
		for(int c=0;c<10;c++)
		{
			vet[c]=in.nextInt();
			
			if(menor==0)
			{
				menor=vet[c];
			}
			if(vet[c]<menor)
			{
				menor=vet[c];
			}
			if(vet[c]>maior)
			{
				maior=vet[c];
			}
		}
		
		System.out.print("O maior valor é: "+maior+"\nO menor valor é: "+menor);
		
		in.close();
		
	}

	public static void caracter() {
		
		Scanner in = new Scanner(System.in);
		String vet[]=new String[10];
		char letra;
		int contador=0;
		
		System.out.print("Digite 100 letras: ");
		for(int c=0;c<10;c++)
		{
			vet[c]= in.nextLine();
		}
		do
		{
			System.out.print("Digite um caracter: ");
			letra=in.next().charAt(0);
			
			for(int c=0;c<10;c++)
			{
				if(vet[c].charAt(0)==letra)
				{
					contador++;
				}
			}
			if(contador==0)
			{
				System.out.println("Caracter não encontrado na String, favor digite outro caracter!");
			}
			
		}while(contador==0);
		
		System.out.println("O caracter se repete "+contador+" vezes.");
		in.close();	
		
	}
	

}
