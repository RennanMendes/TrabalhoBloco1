package LIP;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		byte escolha=0, repete=0;
		
		System.out.println("Escolha uma opção de conversão: ");
		System.out.println("1- Fahrenheit para Celsius");
		System.out.println("2- Celsius para fahrenheit");
		System.out.println("3- Celsius para kelvin");
		System.out.println("4- Kelvin para Celsius");
		System.out.println("5- Fahrenheit para kelvin");
		System.out.println("6- Kelvin para fahrenheit");
		escolha=in.nextByte();
		
		do
		{
			switch(escolha)
			{
				case 1:
				{
					fahrenheitParaCelsius( );
					break;
				}
				case 2:
				{
					celsiusParafahrenheit();
					break;
				}
				case 3:
				{
					celsiusParaKelvin();
					break;
				}
				case 4:
				{
					kelvinParaCelsius();
					break;
				}
				case 5:
				{
					fahrenheitParaKelvin();
					break;
				}
				case 6:
				{
					kelvinParaFahrenheit();
					break;
				}
				default:
				{
					System.out.println("Número Invalido!!!");
					break;
				}
			
			}	
			
			System.out.println("Deseja realizar outra conversão?\n1 - Sim\n2 - Não");
			repete=in.nextByte();
			
		}while(repete==1);
		
			System.out.println("\nPrograma finalizado!!!");
			in.close();	
	}
	
	
	public static int fahrenheitParaCelsius()
	{
		Scanner in = new Scanner(System.in);
		float temperatura=0;
		double celsius=0;
		
		System.out.print("Digite a temperatura: ");
		temperatura=in.nextFloat();
		
		celsius= (temperatura-32)/1.8;
		
		System.out.println("O valor em graus Celsius é: "+celsius);
		
		in.close();		
		
		return 0;
	}
	
	public static int celsiusParafahrenheit()
	{
		Scanner in = new Scanner(System.in);
		float temperatura=0;
		double fahrenheit=0;
		
		System.out.print("Digite a temperatura: ");
		temperatura=in.nextFloat();
		
		fahrenheit= temperatura*1.8+32;
		
		System.out.println("O valor em graus Fahrenheit é: "+fahrenheit);
		
		in.close();		
		
		return 0;
	}
	
	public static int celsiusParaKelvin()
	{
		Scanner in = new Scanner(System.in);
		float temperatura=0;
		double kelvin=0;
		
		System.out.print("Digite a temperatura: ");
		temperatura=in.nextFloat();
		
		kelvin= temperatura+273;
		
		System.out.println("O valor em graus Kelvin é: "+kelvin);
		
		in.close();		
		
		return 0;
	}
	
	public static int kelvinParaCelsius()
	{
		Scanner in = new Scanner(System.in);
		float temperatura=0;
		double celsius=0;
		
		System.out.print("Digite a temperatura: ");
		temperatura=in.nextFloat();
		
		celsius= temperatura-273;
		
		System.out.println("O valor em graus Celsius é: "+celsius);
		
		in.close();		
		
		return 0;
	}
	
	public static int fahrenheitParaKelvin()
	{
		Scanner in = new Scanner(System.in);
		float temperatura=0;
		double kelvin=0;
		
		System.out.print("Digite a temperatura: ");
		temperatura=in.nextFloat();
		
		kelvin= (temperatura-32)*5/9+273;
		
		System.out.println("O valor em graus Kelvin é: "+kelvin);
		
		in.close();		
		
		return 0;
	}
	
	public static int kelvinParaFahrenheit()
	{
		Scanner in = new Scanner(System.in);
		float temperatura=0;
		double fahrenheit=0;
		
		System.out.print("Digite a temperatura: ");
		temperatura=in.nextFloat();
		
		fahrenheit= (temperatura-273)*1.8+32;
		
		System.out.println("O valor em graus Kelvin é: "+fahrenheit);
		
		in.close();		
		
		return 0;
	}
	
}
