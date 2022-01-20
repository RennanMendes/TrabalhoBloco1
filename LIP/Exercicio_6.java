package LIP;

import java.util.Scanner;

public class Exercicio_6 {
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		byte escolha=0;
		
		System.out.println("Escolha opção abaixo:\n1 - Categoria\n2 - Signo\n3 - Periodo aniversario\n4 - Cálculo IMC");
		escolha = in.nextByte();
		
		switch(escolha)
		{
			case 1:
			{
				categoria();
				break;
			}
			case 2:
			{
				signo();
				break;
			}
			case 3:
			{
				periodoAniversario();
				break;
			}
			case 4:
			{
				calculoIMC();
				break;
			}
			default:
			{
				System.out.println("Opção invalida!!!");
			}
		}
		
		System.out.println("Programa finalizado!!!");
		in.close();
		
	}
	
	public static void categoria() {
		
		Scanner in = new Scanner(System.in);
		int idade =0;
		
		System.out.print("Informe sua idade: ");
		idade = in.nextInt();
		
		if(idade>=18)
			System.out.println("Adulto");
		else if(idade>13)
			System.out.println("Juvenil B");
		else if(idade>10)
			System.out.println("Juvenil A");
		else if(idade>7)
			System.out.println("Infantil B");
		else if(idade>=5)
			System.out.println("Infantil A");
		else
			System.out.println("Idade Invalida");
			
		in.close();	
		
	}
	
	public static void signo() {
		
		Scanner in = new Scanner (System.in);
		int dia=0, mes=0;
		
		System.out.print("Informe o dia em que você nasceu: ");
		dia = in.nextInt();
		System.out.print("Informe o dia em que você nasceu: ");
		mes = in.nextInt();
		
		
		if(mes==3 && dia>=21 || mes==4 && dia<=20)
		{
			System.out.println("Aries");
		}
		else if(mes==4 && dia>=21 || mes==5 && dia<=21)
		{
			System.out.println("Touro");
		}
		else if(mes==5 && dia>=22 || mes==6 && dia<=21)
		{
			System.out.println("Gêmeos");
		}
		else if(mes==6 && dia>=22 || mes==7 && dia<=23)
		{
			System.out.println("Câncer");
		}
		else if(mes==7 && dia>=24 || mes==8 && dia<=23)
		{
			System.out.println("Leão");
		}
		else if(mes==8 && dia>=24 || mes==9 && dia<=23)
		{
			System.out.println("Virgem");
		}
		else if(mes==9 && dia>=24 || mes==10 && dia<=23)
		{
			System.out.println("Libra");
		}
		else if(mes==10 && dia>=24 || mes==11 && dia<=22)
		{
			System.out.println("Escorpião");
		}
		else if(mes==11 && dia>=23 || mes==12 && dia<=21)
		{
			System.out.println("Escorpião");
		}
		else if(mes==12 && dia>=22 || mes==1 && dia<=20)
		{
			System.out.println("Capricórnio");
		}
		else if(mes==1 && dia>=21 || mes==2 && dia<=19)
		{
			System.out.println("Aquário");
		}
		else if(mes==2 && dia>=20 || mes==3 && dia<=20)
		{
			System.out.println("Peixes");
		}
		else
			System.out.println("Data invalida!!!");
		
		in.close();
			
	}
	
	public static void periodoAniversario() {
		
		Scanner in = new Scanner (System.in);
		byte escolha=0;
		
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1 - Aries");
		System.out.println("2 - Touro");
		System.out.println("3 - Gêmeos");
		System.out.println("4 - Câncer");
		System.out.println("5 - Leão");
		System.out.println("6 - Virgem");
		System.out.println("7 - Libra");
		System.out.println("8 - Escorpião");
		System.out.println("9 - Sargitário");
		System.out.println("10 - Capricórnio");
		System.out.println("11 - Aquário");
		System.out.println("12 - Peixes");
		escolha =in.nextByte();
		
		switch(escolha)
		{
			case 1:
			{
				System.out.println("O periodo de nascimento é de 21/03 a 20/4");
				break;
			}
			case 2:
			{
				System.out.println("O periodo de nascimento é de 21/04 a 21/05");
				break;
			}
			case 3:
			{
				System.out.println("O periodo de nascimento é de 22/05 a 21/06");
				break;
			}
			case 4:
			{
				System.out.println("O periodo de nascimento é de 22/06 a 23/07");
				break;
			}
			case 5:
			{
				System.out.println("O periodo de nascimento é de 24/07 a 23/08");
				break;
			}
			case 6:
			{
				System.out.println("O periodo de nascimento é de 24/08 a 23/09");
				break;
			}
			case 7:
			{
				System.out.println("O periodo de nascimento é de 24/09 a 23/10");
				break;
			}
			case 8:
			{
				System.out.println("O periodo de nascimento é de 24/10 a 22/11");
				break;
			}
			case 9:
			{
				System.out.println("O periodo de nascimento é de 23/11 a 21/12");
				break;
			}
			case 10:
			{
				System.out.println("O periodo de nascimento é de 22/12 a 20/01");
				break;
			}
			case 11:
			{
				System.out.println("O periodo de nascimento é de 21/01 a 19/02");
				break;
			}
			case 12:
			{
				System.out.println("O periodo de nascimento é de 20/02 a 20/03");
				break;
			}
			
		}
		
		in.close();		
	}
	
	public static void calculoIMC() {
		
		Scanner in = new Scanner (System.in);
		double peso=0, altura=0, imc=0;
		
		System.out.print("Informe seu peso: ");
		peso = in.nextDouble();
		System.out.print("Informe sua altura: ");
		altura = in.nextDouble();
		
		imc = peso/(altura*2);
		
		if(imc<17)
		{
			System.out.println("Seu IMC é "+imc+"\nVoçê se encontra na categoria: MUITO ABAIXO DO PESO");
		}
		else if(imc>=17 && imc<=18.49)
		{
			System.out.println("Seu IMC é "+imc+"\nVoçê se encontra na categoria: ABAIXO DO PESO");
		}
		else if(imc>=18.5 && imc<=24.99)
		{
			System.out.println("Seu IMC é "+imc+"\nVoçê se encontra na categoria: PESO NORMAL");
		}
		else if(imc>=25 && imc<=29.99)
		{
			System.out.println("Seu IMC é "+imc+"\nVoçê se encontra na categoria: ACIMA DO PESO");
		}
		else if(imc>=30 && imc<=34.99)
		{
			System.out.println("Seu IMC é "+imc+"\nVoçê se encontra na categoria: OBESIDADE I");
		}
		else if(imc>=35 && imc<=39.99)
		{
			System.out.println("Seu IMC é "+imc+"\nVoçê se encontra na categoria: OBESIDADE II (severa)");
		}
		else 
		{
			System.out.println("Seu IMC é "+imc+"\nVoçê se encontra na categoria: OBESIDADE III (mórbida)");
		}
		
		in.close();
		
	}
	
	
}
