import java.awt.Color;
/*
* Base class for widget's buttons
* Extends rectangle component, add abstract methods for button click handling
*/
public class RATButton extends RATLabel {

	private String value;
	public String getValue(){ return value; }
	private RATMouseListener mouseListener;

	public RATButton(int startX, int startY, int width, int height, Color myColor, String buttonValue){
		super(startX, startY, width, height, myColor);
		value = buttonValue;
	}

	public void addListener(RATMouseListener mouseListener){
		System.out.println("Assign a mouse listener");
		this.mouseListener = mouseListener;
	}

	public void triggerListener(){
		System.out.println("Trigger Button Listener");
		if(this.mouseListener != null){
			this.mouseListener.mouseClicked(this);
		}
		else
			System.out.println("Mouse listener null");
		
	}

}