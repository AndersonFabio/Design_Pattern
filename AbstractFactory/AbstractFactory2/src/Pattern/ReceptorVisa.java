package Pattern;

public class ReceptorVisa implements Receptor {

	@Override
	public String recebe() {
		String mensagem = "Receptor";
		System.out.println("Mensagem Visa");
		return mensagem;
	}
}
