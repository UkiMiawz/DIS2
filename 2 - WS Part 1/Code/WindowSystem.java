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
	}
	
	/*
	 * Translate vector to coordinate
	 * Draw line using parent draw line
	 */
	void drawLine(float startX, float startY, float endX, float endY){
		System.out.println("Draw line with startx: " + startX + " starty: " + startY + 
				" endx: " + endX + " endy " + endY);
		int startWindowX = (int)(windowWidth * startX);
		int startWindowY = (int)(windowHeight * startY);
		int endWindowX = (int)(windowWidth * endX);
		int endWindowY = (int)(windowHeight * endY);
		
		System.out.println("Draw line in coordinates: " + startWindowX + 
				" starty: " + startWindowY + " endx: " + endWindowX + " endy " + endWindowY);
		super.setColor(Color.BLACK);
		super.drawLine(startWindowX, startWindowY, endWindowX, endWindowY);
	}
	
	public void AddNewWindow(){
		simpleWindows.add(new SimpleWindow());
	}
}