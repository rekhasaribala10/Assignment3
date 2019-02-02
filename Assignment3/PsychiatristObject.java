package Assignment3;

public class PsychiatristObject {
	
	public void examine(MoodyObject moodyObject)
	{
		System.out.println("How are you feeling today?");
		System.out.println(moodyObject.getMoody());
	
	}
	
	public void observe(MoodyObject moodyObject)
	{
		System.out.println("Observation: " +moodyObject.toString() );
	}
	
	
}
