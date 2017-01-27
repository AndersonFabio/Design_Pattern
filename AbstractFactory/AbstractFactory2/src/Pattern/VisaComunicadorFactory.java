package Pattern;

public class VisaComunicadorFactory implements ComunicadorFactory {
	
	EmissorCreator emissorCreator = new EmissorCreator();
	ReceptorCreator receptorCreator = new ReceptorCreator();
	
	@Override
	public Emissor emissor() {
		return emissorCreator.create(EmissorCreator.VISA);
	}
	@Override
	public Receptor receptor() {
		return receptorCreator.create(ReceptorCreator.VISA);
	}
	
	

}
