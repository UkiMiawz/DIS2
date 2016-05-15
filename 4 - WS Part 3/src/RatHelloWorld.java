import java.awt.Color;

public class RatHelloWorld extends RATWidget {

	private String greetingString = "Good Day";
	private RATLabel greetingLabel;
	private RATButton closeButton;

    private SimpleWindow parentWindow;
	private WindowSystem ws;

	private final Color labelColor = Color.BLACK;
	private final Color labelBackground = new Color(0,0,0,0);
	private final Color buttonColor = Color.GRAY;
	private final Color buttonStringColor = Color.WHITE;
	private int buttonWidth = 310;
	private int buttonHeight = 30;

    private String languages[] = {"Deutsch", "English", "Francais"};

	public RatHelloWorld(SimpleWindow parentWindow, WindowSystem ws){
    	//super constructor
    	super(parentWindow);
		this.parentWindow = parentWindow;
		this.ws = ws;

    	//create new label
        greetingLabel = new RATLabel(10, 10, 400, 50, labelBackground);
        greetingLabel.setString(greetingString);
        greetingLabel.setStringPadding(130, 25);
        greetingLabel.setStringColor(labelColor);
        super.addNewLabel(greetingLabel);

        //add 3 buttons Deutsch English Francais
        int lastY = 30;
        for(String language:languages){
            lastY += 50;
            RATButton languageButton = new RATButton(10, lastY, buttonWidth, buttonHeight, buttonColor, language);
            languageButton.setString("Greeting in " + language);
            languageButton.setStringPadding(100, 20);
            languageButton.setStringColor(buttonStringColor);
            languageButton.addListener(new LanguageClickListener());
            super.addNewButton(languageButton);
        }

        //add close button
        closeButton = new RATButton(10, lastY + 70, buttonWidth, buttonHeight, Color.RED, "close");
        closeButton.setString("Close this window");
        closeButton.setStringPadding(100, 20);
        closeButton.setStringColor(buttonStringColor);
        closeButton.addListener(new ExitClickListener());
        super.addNewButton(closeButton);
    }

    private class LanguageClickListener implements RATMouseListener{
      public void mouseClicked(RATButton ratButton) {
        String command = ratButton.getValue();
        System.out.println("RAT Hello World Button clicked!");
        System.out.println(command);
  		if (command.equals("English")){
			greetingLabel.setString("Good day!");
            closeButton.setString("End");
		}
	  	else
		if(command.equals("Deutsch")){
			greetingLabel.setString("Guten Tag!");
            closeButton.setString("Beenden");
		}
	  	else
		if(command.equals("Francais"))	{
			greetingLabel.setString("Bonne journee!");
            closeButton.setString("Terminé");
		}
        else{
           greetingLabel.setString("Invalid input");
           closeButton.setString("Invalid input");
        }

      }
   }

   private class ExitClickListener implements RATMouseListener{
      public void mouseClicked(RATButton e){
        //remove window from window system
        ws.getListWindows().remove(parentWindow);
      }
   }
}