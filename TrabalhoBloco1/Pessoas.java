package TrabalhoBloco1;

public class Pessoas implements FormularioSaude {

	private String nome, email;
	private int idade;
	private boolean cis, genital;
	

	public Pessoas(String nome, String email, int idade, boolean cis, boolean genital) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.cis = cis;
		this.genital = genital;
	}
	
/*	public Pessoas(String nome,  String email, double idade, boolean cis, boolean genital) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade= idade;
		this.cis = cis;
		this.genital = genital;
	}
*/

	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public boolean getCis() {
		return cis;
	}


	public void setCis(boolean cis) {
		this.cis = cis;
	}


	public boolean getGenital() {
		return genital;
	}


	public void setGenital(boolean genital) {
		this.genital = genital;
	}


	public void status() {
		
		System.out.println("Seu nome é: "+nome);
		System.out.println("Seu e-mail é: "+email);
		System.out.println("Sua idade é: "+idade);
		System.out.println("Cis?: "+cis);
		
		if (this.getGenital()) {
			
			System.out.println("Você é uma pessoa do sexo mascúlino");
		}
		else
		{
			System.out.println("Você é uma pessoa do sexo feminino\n\n");

			}
		
	}




	@Override
	public String nome(String nome) {
		// TODO Auto-generated method stub
		return nome;
	}




	@Override
	public int idade(int idade) {
		// TODO Auto-generated method stub
		return idade;
		
	}




	@Override
	public String email(String email) {
		// TODO Auto-generated method stub
		return email;
	}




	@Override
	public boolean genitalia(boolean genital) {
		// TODO Auto-generated method stub
		return genital;
	}




	@Override
	public boolean cis(boolean cis) {
		// TODO Auto-generated method stub
		return cis;
	}




	

	
	
	
	
}
