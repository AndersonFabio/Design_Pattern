package Pattern;

public class EmissorEmail implements Emissor {
	
	public void envia(String mensagem) {
		System.out.println("Enviando mensagem via email");
		System.out.println(mensagem);
	}

}
