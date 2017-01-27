package Pattern;

public class ReceptorMastercard implements Receptor {

	@Override
	public String recebe() {
		String mensagem = "Receptor";
		System.out.println("Mensagem Mastercard");
		return mensagem;
	}
}
