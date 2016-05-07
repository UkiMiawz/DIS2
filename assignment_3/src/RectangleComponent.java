import java.awt.Rectangle;
import java.awt.Color;


public class RectangleComponent extends Rectangle{
	private Color myColor;
	private String title;
	public Color getColor(){ return myColor; }
	public void setColor(Color value){ myColor = value; }
	public String getString(){return title;}
	public void setString(String value){title = value;}

	public RectangleComponent(int startX, int startY, int width, int height, Color myColor){
		super(startX, startY, width, height);
		this.myColor = myColor;
	}

	public void  drawTitle(String str, int x, int y) {}
}