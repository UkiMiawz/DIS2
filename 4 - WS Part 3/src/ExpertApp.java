public class ExpertApp{

    private static WindowSystem windowSystem;
    private static WindowManager windowManager;

    /*
     * Main class
     */
    public static void main(String[] args){
        
        //instantiate window system
        windowSystem = new WindowSystem(1024, 768);

        //add windows
        windowSystem.addNewWindow(0.2f, 0.1f, 400, 500, "The Googleplex Star Thinker");
    }
}
