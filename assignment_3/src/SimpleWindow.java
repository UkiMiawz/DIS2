import java.util.UUID;
public class SimpleWindow{

    //index of window in the list, also determine which is on top, biggest index means window is on top
    private int indexValue;
    //window height and width
    //private int height;
    //private int width;
    //window x and y position
    private float LeftTopX;
    private float LeftTopY;
    private float RightBottomX;
    private float RightBottomY;
    private UUID id;

    public SimpleWindow(float LeftTopX ,float LeftTopY,float RightBottomX, float RightBottomY){
        //this.height = height;
        //this.width = width;
        this.LeftTopX = LeftTopX;
        this.LeftTopY = LeftTopY;
        this.RightBottomX = RightBottomX;
        this.RightBottomY = RightBottomY;
        this.id = UUID.randomUUID();



    }

    public int getIndex(){ return indexValue;}
    public float getLeftTopX(){ return LeftTopX; }
    public float getLeftTopY(){ return LeftTopY; }
    public float getRightBottomX(){ return RightBottomX; }
    public float getRightBottomY(){ return RightBottomY; }
    public UUID getID(){return id;}
}
