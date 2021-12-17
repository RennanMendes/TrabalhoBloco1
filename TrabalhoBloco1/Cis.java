package TrabalhoBloco1;

public class Cis extends Pessoas {
	
	
	public Cis(String nome, String email, int idade, boolean cis, boolean genital) {
		super(nome, email, idade, cis, genital);
			
	}
	


	public void informativoTrans() {
		
		System.out.println("Você receberá um informativo sobre pessoas trans no e-mail cadastrado!");	
	
	}

	public void informativoGenitalia() {
		
		if (this.getGenital()) {
			
			System.out.println("Você receberá no e-mail "+getEmail()+" um informativo sobre saúde para pessoas com pênis");
		}
		else
		{
			System.out.println("Você receberá no e-mail "+getEmail()+" um informativo sobre saúde para pessoas com vagina");

		}
		
	}
	
	
	public String toString() {
		
		String c, g;
		if(getCis())
			c="Cis";
		else
			c="Trans";
		
		if(getGenital())
			g="Pênis";
		else
			g="Vagina";
		
		return getNome () + ", " +  getIdade()+ ", "  +  getEmail()+", "+  c + ", "+  g+";";
	}
	
	
}
