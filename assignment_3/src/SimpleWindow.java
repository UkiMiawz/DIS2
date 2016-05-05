import java.util.UUID;
public class SimpleWindow{

    //index of window in the list, also determine which is on top, biggest index means window is on top
    private UUID id;
    private int indexValue;
    
    private int leftTopX;
    private int leftTopY;

    private int height;
    private int width;

    private String title;

    public SimpleWindow(int leftTopX, int leftTopY, int width, int height, String title){
        
        this.leftTopX = leftTopX;
        this.leftTopY = leftTopY;
        this.height = height;
        this.width = width;
        this.title = title;

        this.id = UUID.randomUUID();
    }

    //getter
    public int getIndex(){ return indexValue;}
    public UUID getId(){return id;}
    public int getLeftTopX(){ return leftTopX; }
    public int getLeftTopY(){ return leftTopY; }
    public int getRightBottomX(){ return leftTopX + width; }
    public int getRightBottomY(){ return leftTopY + height; }
    public int getHeight(){ return height; }
    public int getWidth(){ return width; }
    public String getTitle(){ return title; }

    //setter
    public void setIndex(int value){ indexValue = value; }
    public void setLeftTopX(int value){ leftTopX = value; }
    public void setLeftTopY(int value){ leftTopY = value; }
    public void setHeight(int value){ height = value; }
    public void setWidth(int value){ width = value; }
}
