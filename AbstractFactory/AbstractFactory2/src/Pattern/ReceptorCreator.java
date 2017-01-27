package Pattern;

public class ReceptorCreator {
	
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	
	public Receptor create(int bandeira) {
		
		if(bandeira == ReceptorCreator.VISA) {
			return new ReceptorVisa();
		} else if(bandeira == ReceptorCreator.MASTERCARD) {
			return new ReceptorMastercard();
		} else {
			throw new IllegalArgumentException("Bandeira não Conhecida");
		}
		
	}

}
