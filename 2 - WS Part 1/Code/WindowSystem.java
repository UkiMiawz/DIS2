import de.rwth.hci.Graphics.GraphicsEventSystem; 
import java.awt.Color;

public class WindowSystem extends GraphicsEventSystem{
	
	private int windowWidth;
	private int windowHeight;
	
	/*
	 * Constructor
	 */
	public WindowSystem(int width, int height){
		//save window width and height
		super(width, height);
		windowWidth = width;
		windowHeight = height;
		handlePaint();
	}

	/*
	 * Main class
	 */
	public static void main(String[] args){
		WindowSystem windowSystem = new WindowSystem(500, 500);
	}

	/*
	 * (non-Javadoc)
	 * @see de.rwth.hci.Graphics.GraphicsEventSystem#handlePaint()
	 */
	protected void handlePaint(){
		System.out.println("Drawing with Handle Paint");
		this.drawLine(0.5f,0.5f,0.8f,0.8f);
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
}