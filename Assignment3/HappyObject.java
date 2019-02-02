package Assignment3;

public class HappyObject extends MoodyObject{
	
	@Override
	protected String getMoody() {
		
		return "I feel happy today!" ;
	}
	
	public void expressFeelings() {
		
		System.out.println("hehehe...hahahahah.....HAHAHAHAHAHAHA!!!!");
	}
	
	public String toString()
	{
		return "Subject laughs a lot";
		
	}
	

}
