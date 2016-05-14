public class HelloWorldGraphical{

    private static WindowSystem windowSystem;
    private static WindowManager windowManager;

    /*
     * Main class
     */
    public static void main(String[] args){
        
        //instantiate window system
        windowSystem = new WindowSystem(1024, 768);

        //add windows
        SimpleWindow newWindow = windowSystem.addNewWindow(0.2f, 0.1f, 400, 500, "Hello world and don't panic");
        RatHelloWorld widget = new RatHelloWorld(newWindow);
        widget.test = "pulalala";
        newWindow.setWidget(widget);
        RatHelloWorld testWidget = (RatHelloWorld)newWindow.getWidget();
        System.out.println("banana");
        System.out.println(widget.getTest());
    }
}
