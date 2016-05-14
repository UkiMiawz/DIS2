import java.util.ArrayList;
import java.util.List;
/*
* Base class for all widgets
*/
public abstract class RATWidget implements RATMouseListener {

	//RAT components list
    private List<RATButton> buttons;
    private List<RATLabel> labels;

    public RATWidget(){
    	//list initialization
    	buttons = new ArrayList<RATButton>();
    	labels = new ArrayList<RATLabel>();
    }

    public void mouseClicked(SimpleWindow window, RATWidget widget, RATButton button){

    }

}