package Pattern;

public class EmissorMastercard implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Envio de Mensagem Mastercard");
		System.out.println(mensagem);
	}
	
	

}
