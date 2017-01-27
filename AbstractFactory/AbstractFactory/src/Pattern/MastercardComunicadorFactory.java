package Pattern;

public class MastercardComunicadorFactory implements ComunicadorFactory {
	
	public EmissorCreator emissorCreator = new EmissorCreator();
	public ReceptorCreator receptorCreator = new ReceptorCreator();
	
	public Emissor createEmissor() {
		return emissorCreator.create(EmissorCreator.MASTERCARD);
	}
	
	public Receptor createReceptor() {
		return receptorCreator.create(ReceptorCreator.MASTERCARD);
	}

}
