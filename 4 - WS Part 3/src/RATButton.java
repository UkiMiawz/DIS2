import java.awt.Color;
/*
* Base class for widget's buttons
* Extends rectangle component, add abstract methods for button click handling
*/
public class RATButton extends RATLabel {

	public String value;

	public RATButton(int startX, int startY, int width, int height, Color myColor, String buttonValue){
		super(startX, startY, width, height, myColor);
		value = buttonValue;
	}

}