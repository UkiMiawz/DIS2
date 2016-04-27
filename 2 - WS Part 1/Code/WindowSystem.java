import de.rwth.hci.Graphics.GraphicsEventSystem; 
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class WindowSystem extends GraphicsEventSystem{
	
	private int windowWidth;
	private int windowHeight;
	private List<SimpleWindow> simpleWindows;
	
	private float startX;
	private float startY;
	private float endX;
	private float endY;
	
	private int startWindowX;
	private int startWindowY;
	private int endWindowX;
	private int endWindowY;
	
	/*
	 * Constructor
	 */
	public WindowSystem(int width, int height){
		//save window width and height
		super(width, height);
		windowWidth = width;
		windowHeight = height;
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
		startWindowX = (int)(windowWidth * startX);
		startWindowY = (int)(windowHeight * startY);
		endWindowX = (int)(windowWidth * endX);
		endWindowY = (int)(windowHeight * endY);
	}
	
	public void AddNewWindow(){
		simpleWindows.add(new SimpleWindow());
	}
}