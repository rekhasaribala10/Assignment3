package Assignment3;

public class MainClassForPsyhiatrist {

	public static void main(String[] args) {

		MoodyObject happyObject = new HappyObject();

		PsychiatristObject PO = new PsychiatristObject();
		PO.examine(happyObject);
		happyObject.expressFeelings();
		PO.observe(happyObject);

		MoodyObject sadObject = new SadObject();

		PO.examine(sadObject);
		sadObject.expressFeelings();
		PO.observe(sadObject);

	}

}
