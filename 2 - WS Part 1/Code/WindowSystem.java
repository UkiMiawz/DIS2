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
	
	public void setLineParameters(float startX, float startY, float endX, float endY){
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}

	/*
	 * (non-Javadoc)
	 * @see de.rwth.hci.Graphics.GraphicsEventSystem#handlePaint()
	 */
	@Override
	protected void handlePaint(){
		System.out.println("Drawing with Handle Paint with startx: " + startX + " starty: " + startY + 
				" endx: " + endX + " endy " + endY);
		this.drawLine(startX, startY, endX, endY);
		System.out.println("Draw line in coordinates: " + startWindowX + 
				" starty: " + startWindowY + " endx: " + endWindowX + " endy " + endWindowY);
		super.setColor(Color.BLACK);
		super.drawLine(startWindowX, startWindowY, endWindowX, endWindowY);
	}
	
	/*
	 * Translate vector to coordinate
	 * Draw line using parent draw line
	 */
	void drawLine(float startX, float startY, float endX, float endY){
		System.out.println("Draw line with startx: " + startX + " starty: " + startY + 
				" endx: " + endX + " endy " + endY);
		startLineX = (int)(windowWidth * startX);
		startLineY = (int)(windowHeight * startY);
		endLineX = (int)(windowWidth * endX);
		endLineY = (int)(windowHeight * endY);
	}
	
	public void AddNewWindow(){
		simpleWindows.add(new SimpleWindow());
	}
}
