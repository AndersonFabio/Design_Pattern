package Pattern;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Campanha implements Prototype<Campanha> {

	private String nome;
	private Calendar vencimento;
	private Set<String> palavrasChave;
	
	public Campanha(String nome, Calendar vencimento, Set<String> palavrasChave) {
		this.nome = nome;
		this.vencimento = vencimento;
		this.palavrasChave = palavrasChave;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Calendar getVencimento() {
		return this.vencimento;
	}
	
	public Set<String> getPalavrasChave() {
		return this.palavrasChave;
	}

	
	public Campanha clone() {
		String nome = "C�pia da Campanha: "+this.nome;
		Calendar vencimento = (Calendar) this.vencimento.clone();
		Set<String> palavrasChave = new HashSet<String>(this.palavrasChave);
		Campanha campanha = new Campanha(nome, vencimento, palavrasChave);
		return campanha;
	}
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("-------------------");
		buffer.append("\n");
		buffer.append("Nome da Campanha: ");
		buffer.append(this.nome);
		buffer.append("\n");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String format = sdf.format(this.getVencimento().getTime());
		buffer.append("Vencimento: "+format);
		buffer.append("\n");
		buffer.append("Palavras-Chave: \n");
		for( String palavraChave : this.palavrasChave) {
			buffer.append(" - "+palavraChave);
			buffer.append("\n");
		}
		buffer.append("--------------------");
		buffer.append("\n");
		return buffer.toString();
	}
}
