import java.util.UUID;
public class SimpleWindow{

    //index of window in the list, also determine which is on top, biggest index means window is on top
    private int indexValue;
    //window height and width
    //private int height;
    //private int width;
    //window x and y position
    private float leftTopX;
    private float leftTopY;
    private float rightBottomX;
    private float rightBottomY;
    private UUID id;

    public SimpleWindow(float leftTopX, float leftTopY, float rightBottomX, float rightBottomY){
        //this.height = height;
        //this.width = width;
        this.leftTopX = leftTopX;
        this.leftTopY = leftTopY;
        this.rightBottomX = rightBottomX;
        this.rightBottomY = rightBottomY;
        this.id = UUID.randomUUID();
    }

    public int getIndex(){ return indexValue;}
    public float getLeftTopX(){ return leftTopX; }
    public float getLeftTopY(){ return leftTopY; }
    public float getRightBottomX(){ return rightBottomX; }
    public float getRightBottomY(){ return rightBottomY; }
    public UUID getID(){return id;}
}
