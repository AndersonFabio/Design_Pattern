package Pattern;

public class ReceptorVisa implements Receptor {

	public String recebe() {
		System.out.println("Recebendo Mensagem da Visa");
		String mensagem = "Mensagem da Visa";
		return mensagem;
	}
}
