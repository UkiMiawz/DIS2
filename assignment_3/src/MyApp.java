public class MyApp{

    private static WindowSystem windowSystem;

    /*
     * Main class
     */
    public static void main(String[] args){
        windowSystem = new WindowSystem(800, 600);


        windowSystem.AddNewWindow(50,50,50.0f,50.0f,20.0f,20.0f);

        windowSystem.handlePaint();
    }
}
