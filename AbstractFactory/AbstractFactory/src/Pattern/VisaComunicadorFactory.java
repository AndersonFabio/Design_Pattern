package Pattern;

public class VisaComunicadorFactory implements ComunicadorFactory {

	public ReceptorCreator receptorCreator = new ReceptorCreator();
	public EmissorCreator emissorCreator = new EmissorCreator();
	
	public Emissor createEmissor() {
		return emissorCreator.create(EmissorCreator.VISA);
	}
	
	public Receptor createReceptor() {
		return receptorCreator.create(ReceptorCreator.VISA);
	}
}
