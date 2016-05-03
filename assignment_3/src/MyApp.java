public class MyApp{

    private static WindowSystem windowSystem;

    /*
     * Main class
     */
    public static void main(String[] args){
        windowSystem = new WindowSystem(800, 600);
        windowSystem.drawLine(0.2f,0.3f,0.8f,0.7f);
        System.out.print("aaaaa");
        windowSystem.AddNewWindow(50,50,0.2f,0.2f,0.5f,0.5f);

        windowSystem.handlePaint();
    }
}
