import java.util.ArrayList;
import java.util.List;
/*
* Base class for all widgets
*/
public abstract class RATWidget implements RATMouseListener {

	//RAT components list
    private List<RATButton> ratButtons;
    private List<RATLabel> ratLabels;

    private SimpleWindow parentWindow;

    public RATWidget(SimpleWindow parentWindow){
    	//list initialization
    	ratButtons = new ArrayList<RATButton>();
    	ratLabels = new ArrayList<RATLabel>();
        this.parentWindow = parentWindow;
    }

    public void mouseClicked(SimpleWindow window, RATWidget widget, RATButton button){

    }

    /*
    * The x and y parameters here are relative to parent window position
    */
    public void addNewButton(RATButton ratButton){
        
        recalculatePosition(ratButton);
        ratButtons.add(ratButton);
    }

    public void addNewLabel(RATLabel ratLabel){

        recalculatePosition(ratLabel);
        ratLabels.add(ratLabel);
    }

    /*
    * The x and y parameters here are relative to parent window position
    */
    private void recalculatePosition(RATLabel ratLabel){

        //recalculate x&y to be relative with parent window
        int parentX = parentWindow.getLeftTopX();
        int parentY = parentWindow.getLeftTopY();

        int xCoordinate = parentX + (int)ratLabel.getX();
        int yCoordinate = parentY + (int)ratLabel.getY();
        ratLabel.setLocation(xCoordinate, yCoordinate);
    }

    /*
    * Handle parent window movement
    * Move all components together with widget
    */
    public void moveWidget(int xDifference, int yDifference){
        //move all buttons in widget
        for(RATButton component:ratButtons){
            component.setLocation((int)component.getX() + xDifference, (int)component.getY() + yDifference);
        }

        //move all labels in widget
        for(RATLabel component:ratLabels){
            component.setLocation((int)component.getX() + xDifference, (int)component.getY() + yDifference);
        }
    }

}