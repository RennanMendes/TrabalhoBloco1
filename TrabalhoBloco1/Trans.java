package TrabalhoBloco1;

public class Trans extends Pessoas {

	private boolean hormonio;
	private int bin;
	private String confirmacao;

	public Trans(String nome, String email, int idade, boolean cis, boolean genital, boolean hormonio) {
		super(nome, email, idade, cis, genital);

		this.hormonio = hormonio;

	}
	
	public void confirmacao(int bin) {
		if (bin==0)
			System.out.println("Você não é trans, SOME!!!");
		else if(bin==1)
			System.out.println("Você é trans, LACROU!!!");
		else
			System.out.println("Número inválido");	
	}
	
	public void confirmacao(String confirmacao) {
		if (confirmacao=="Não")
			System.out.println("Você não é trans, SOME!!!");
		else if(confirmacao=="Sim")
			System.out.println("Você é trans, LACROU!!!");
		else
			System.out.println("Número inválido");	
	}

	

	public void saudeTrans() {

		if (hormonio == true && getGenital()) {
			System.out.println("Você receberá informações sobre sua saúde no e-mail cadastrado:\n" + getEmail());
		} else if (hormonio == true && !getGenital()) {
			System.out.println("Você receberá informações sobre sua saúde no e-mail cadastrado:\n" + getEmail());
		} else if (hormonio == false && getGenital()) {
			System.out.println("Você receberá informações sobre sua saúde no e-mail cadastrado:\n" + getEmail());
		} else if (hormonio == false && !getGenital()) {
			System.out.println("Você receberá informações sobre sua saúde no e-mail cadastrado:\n" + getEmail());
		}

	}

	public void informativoGenitalia() {

		if (this.getGenital()) {

			System.out.println(
					"Você receberá no e-mail " + getEmail() + " um informativo sobre saúde para pessoas com pênis");
		} else {
			System.out.println(
					"Você receberá no e-mail " + getEmail() + " um informativo sobre saúde para pessoas com vagina");

		}

	}

	public boolean getHormonio() {
		return hormonio;
	}

	public void setHormonio(boolean hormonio) {
		this.hormonio = hormonio;
	}

	public String toString() {

		String c, g, h;
		if (getCis())
			c = "Cis";
		else
			c = "Trans";

		if (getGenital())
			g = "Pênis";
		else
			g = "Vagina";

		if (hormonio == true)
			h = "Faz tratamento hormonal";
		else
			h = "Não faz tratamento hormonal";

		return getNome() + ", " + getIdade() + ", " + getEmail() + ", " + c + ", " + g + ", " + h+";";

	}
	

}
