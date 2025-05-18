package interfaces.innerintetface;

public class ButtonTest {

	public static void main(String[] args) {
		Button button = new Button();
		
		button.setListener(new CallListener());
		button.touch();
	}

}
