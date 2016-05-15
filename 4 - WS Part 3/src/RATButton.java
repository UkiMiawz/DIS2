import java.awt.Color;
import java.util.ArrayList;
/*
* Base class for widget's buttons
* Extends rectangle component, add abstract methods for button click handling
*/
public class RATButton extends RATLabel {

	private String value;
	private ArrayList<RATMouseListener> mouseListener;
	public String getValue(){ return value; }


	public RATButton(int startX, int startY, int width, int height, Color myColor, String buttonValue){
		super(startX, startY, width, height, myColor);
		value = buttonValue;
		mouseListener = new ArrayList<RATMouseListener>();
	}

	public void addListener(RATMouseListener mouseListener){
		System.out.println("Assign a mouse listener");
		this.mouseListener.add(mouseListener);
	}

	public  void removeListener(RATMouseListener mouseListener){
		System.out.println("Unregistering from listener");
		this.mouseListener.remove(mouseListener);
	}

	public void fireListeners(RATButton ratButton){
		if (mouseListener.size()!=0){
		for (RATMouseListener mlist:mouseListener) {
			mlist.mouseClicked(ratButton);}
		}
	}



//	public void triggerListener(){
//		System.out.println("Trigger Button Listener");
//		if(this.mouseListener != null){
//			this.mouseListener.mouseClicked(this);
//		}
//		else
//			System.out.println("Mouse listener null");


		
	//}

}