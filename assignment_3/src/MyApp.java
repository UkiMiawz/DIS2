public class MyApp{

    private static WindowSystem windowSystem;

    /*
     * Main class
     */
    public static void main(String[] args){
        windowSystem = new WindowSystem(1024, 768);


        //windowSystem.AddNewWindow(50,50,50.0f,50.0f,20.0f,20.0f);
        //DON'T UNCOMMENT THIS SHIT THIS IS THE SOURCE OF EXCEPTION
        //windowSystem.handlePaint();
    }
}
