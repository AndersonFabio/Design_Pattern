package Pattern;

public class EmissorVisa implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Envio de Mensagem Visa");
		System.out.println(mensagem);
	}
	

}
