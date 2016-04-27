import de.rwth.hci.Graphics.GraphicsEventSystem; 
import java.awt.Color;

public class WindowSystem extends GraphicsEventSystem{
	
	public WindowSystem(int i, int j){
		super(i, j);
		handlePaint();
	}

	public static void main(String[] args){
		WindowSystem windowSystem = new WindowSystem(500, 500);
	}

	protected void handlePaint(){
		System.out.println("Drawing with Handle Paint");
		drawLine(0.5,0.5,0.8,0.8);
	}
	
	private void drawLine(float StartX, float StartY, float EndX, float EndY){
		System.out.println("Draw line " + StartX + StartY + EndX + EndY);
		super.drawLine(StartX, StartY, EndX, EndY);
	}
	 
	public void setColor(Color inColor){
		
	}
}