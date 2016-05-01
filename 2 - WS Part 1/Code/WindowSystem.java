import de.rwth.hci.Graphics.GraphicsEventSystem; 
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class WindowSystem extends GraphicsEventSystem{
	
	//window system width and height
	private int windowWidth;
	private int windowHeight;
	//list of Windows in current window system
	private List<SimpleWindow> simpleWindows;
	
	//parameters for drawing line in vector
	private float startX;
	private float startY;
	private float endX;
	private float endY;

	//line x and y start position in coordinates
	private int startLineX;
	private int startLineY;
	//line x and y end position in coordinates
	private int endLineX;
	private int endLineY;
	
	/*
	 * Constructor
	 */
	public WindowSystem(int width, int height){
		//save window width and height
		super(width, height);
		windowWidth = width;
		windowHeight = height;
		//instantiate new list
		simpleWindows = new ArrayList<SimpleWindow>();
	}
	
	//set line parameters in vector
	public void setLineParameters(float startX, float startY, float endX, float endY){
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}

	/*
	 * (non-Javadoc)
	 * override handle paint in parent
	 * Set color and draw line using parent methods
	 */
	@Override
	protected void handlePaint(){
		System.out.println("Drawing with Handle Paint with startx: " + startX + " starty: " + startY + 
				" endx: " + endX + " endy " + endY);
		this.calculateCoordinate(startX, startY, endX, endY);
		System.out.println("Draw line in coordinates: " + startWindowX + 
				" starty: " + startWindowY + " endx: " + endWindowX + " endy " + endWindowY);
		//put set color and draw line here because calling them outside handle paint gives error message
		super.setColor(Color.BLACK);
		super.drawLine(startWindowX, startWindowY, endWindowX, endWindowY);
	}
	
	/*
	 * Translate vector to coordinate
	 */
	void calculateCoordinate(float startX, float startY, float endX, float endY){
		System.out.println("Draw line with startx: " + startX + " starty: " + startY + 
				" endx: " + endX + " endy " + endY);
		startLineX = (int)(windowWidth * startX);
		startLineY = (int)(windowHeight * startY);
		endLineX = (int)(windowWidth * endX);
		endLineY = (int)(windowHeight * endY);
	}
	
	/*
	 * Add new simple window to window system
	 */
	public void AddNewWindow(){
		simpleWindows.add(new SimpleWindow());
	}
}
