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
			System.out.println("Voc� n�o � trans, SOME!!!");
		else if(bin==1)
			System.out.println("Voc� � trans, LACROU!!!");
		else
			System.out.println("N�mero inv�lido");	
	}
	
	public void confirmacao(String confirmacao) {
		if (confirmacao=="N�o")
			System.out.println("Voc� n�o � trans, SOME!!!");
		else if(confirmacao=="Sim")
			System.out.println("Voc� � trans, LACROU!!!");
		else
			System.out.println("N�mero inv�lido");	
	}

	

	public void saudeTrans() {

		if (hormonio == true && getGenital()) {
			System.out.println("Voc� receber� informa��es sobre sua sa�de no e-mail cadastrado:\n" + getEmail());
		} else if (hormonio == true && !getGenital()) {
			System.out.println("Voc� receber� informa��es sobre sua sa�de no e-mail cadastrado:\n" + getEmail());
		} else if (hormonio == false && getGenital()) {
			System.out.println("Voc� receber� informa��es sobre sua sa�de no e-mail cadastrado:\n" + getEmail());
		} else if (hormonio == false && !getGenital()) {
			System.out.println("Voc� receber� informa��es sobre sua sa�de no e-mail cadastrado:\n" + getEmail());
		}

	}

	public void informativoGenitalia() {

		if (this.getGenital()) {

			System.out.println(
					"Voc� receber� no e-mail " + getEmail() + " um informativo sobre sa�de para pessoas com p�nis");
		} else {
			System.out.println(
					"Voc� receber� no e-mail " + getEmail() + " um informativo sobre sa�de para pessoas com vagina");

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
			g = "P�nis";
		else
			g = "Vagina";

		if (hormonio == true)
			h = "Faz tratamento hormonal";
		else
			h = "N�o faz tratamento hormonal";

		return getNome() + ", " + getIdade() + ", " + getEmail() + ", " + c + ", " + g + ", " + h+";";

	}
	

}
