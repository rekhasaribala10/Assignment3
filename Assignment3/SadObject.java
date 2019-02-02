package Assignment3;

public class SadObject extends MoodyObject{
	
	@Override
	protected String getMoody() {
		
		return "I feel sad today!";
	}
	
	public void expressFeelings() {
		
		System.out.println("'wah''boo hoo''weep''sob''weep'");
	}
	
	public String toString() {
		return "Subject cries a lot";
	}

	
	
	}
	
	


