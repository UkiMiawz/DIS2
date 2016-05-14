import java.awt.Color;
/*
* Base class for widget's buttons
* Extends rectangle component, add abstract methods for button click handling
*/
public class RATButton extends RATLabel {

	public RATButton(int startX, int startY, int width, int height, Color myColor){
		super(startX, startY, width, height, myColor);
	}

}