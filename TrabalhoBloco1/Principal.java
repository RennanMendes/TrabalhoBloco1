package TrabalhoBloco1;

import java.util.ArrayList;
import java.util.*;



public class Principal {

	public static void main(String[] args) {
		
		
		Cis pteste = new Cis("\nMurilo", "murilo@generation.com", 27, true, true);
		Cis pteste1 = new Cis("\nRennan", "rennan@generation.com", 23, true, true);
		Cis pteste2 = new Cis("\nGiovanna", "giovanna@generation.com", 24, true, false);
		Cis pteste3 = new Cis("\nTatyana", "tatyana@generation.com", 26, true, false);
		Cis pteste4 = new Cis("\nIsabella", "isabella@generation.com", 29, true, true);
		Trans tteste = new Trans("\nLetícia", "letícia@generation.com",30,false,true,true);
		Trans tteste1 = new Trans("\nAnderson", "anderson@generation.com",45,false,true,false);
		Trans tteste2 = new Trans("\nYuri", "yuri@generation.com",22,false,false,true);
		Trans tteste3 = new Trans("\nLucas", "lucas@generation.com",27,false,false,true);
		
		ArrayList<Pessoas> pessoaCis =new ArrayList<>();
		pessoaCis.add(pteste);
		pessoaCis.add(pteste1);
		pessoaCis.add(pteste2);
		pessoaCis.add(pteste3);
		pessoaCis.add(pteste4);
		pessoaCis.add(tteste);
		pessoaCis.add(tteste1);
		pessoaCis.add(tteste2);
		pessoaCis.add(tteste3);
		
		System.out.println("A lista de pessoas cadastradas é:");
		System.out.println(pessoaCis.toString());
		System.out.println("\nExistem "+pessoaCis.size()+" pessoas cadastradas!");
		System.out.println("\nA 3° pessoa na lista de cadastro é: "+pessoaCis.get(2));
		System.out.println("É trans? ");
		tteste.confirmacao("Não");
		pteste2.informativoTrans();
		pteste2.informativoGenitalia();
		
		System.out.println("\nA 7° pessoa na lista de cadastro é: "+pessoaCis.get(6));
		System.out.println("É trans? ");
		tteste1.confirmacao(1);
		tteste1.saudeTrans();
		tteste1.informativoGenitalia();
		
		
			}		
		
	}
