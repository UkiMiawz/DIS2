import java.awt.Color;

public class RatHelloWorld extends RATWidget {

	private String greetingString = "Good Day";
	private final Color labelColor = Color.BLACK;
	private final Color labelBackground = new Color(0,0,0,0);
	private final Color buttonColor = Color.GRAY;
	private final Color buttonStringColor = Color.WHITE;
	private int buttonWidth = 310;
	private int buttonHeight = 30;

	public RatHelloWorld(SimpleWindow parentWindow){
    	//super constructor
    	super(parentWindow);

    	//create new label
    	RATLabel greetingLabel = new RATLabel(10, 10, 400, 50, labelBackground);
    	greetingLabel.setString(greetingString);
    	greetingLabel.setStringPadding(130, 25);
    	greetingLabel.setStringColor(labelColor);
    	super.addNewLabel(greetingLabel);

    	//add 3 buttons Deutsch English Francais
    	RATButton deutschButton = new RATButton(10, 80, buttonWidth, buttonHeight, buttonColor, "deutsch");
    	deutschButton.setString("Greeting in Deutsch");
    	deutschButton.setStringPadding(100, 20);
    	deutschButton.setStringColor(buttonStringColor);
    	super.addNewButton(deutschButton);

    	RATButton englishButton = new RATButton(10, 130, buttonWidth, buttonHeight, buttonColor, "english");
    	englishButton.setString("Greeting in English");
    	englishButton.setStringPadding(100, 20);
    	englishButton.setStringColor(buttonStringColor);
    	super.addNewButton(englishButton);

    	RATButton francaisButton = new RATButton(10, 180, buttonWidth, buttonHeight, buttonColor, "francais");
    	francaisButton.setString("Greeting in Francais");
    	francaisButton.setStringPadding(100, 20);
    	francaisButton.setStringColor(buttonStringColor);
    	super.addNewButton(francaisButton);

    	//add close button
    	RATButton closeButton = new RATButton(10, 250, buttonWidth, buttonHeight, Color.RED, "close");
    	closeButton.setString("Close this window");
    	closeButton.setStringPadding(100, 20);
    	closeButton.setStringColor(buttonStringColor);
    	super.addNewButton(closeButton);
    }

    public int getTest(){ return super.getRatLabels().size(); }
}