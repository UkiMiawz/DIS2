import java.io.Console;

public class HelloWorldConsole {

    public static void main(String[] args) {
        Console cnsl = System.console();
        String input = null;
        Boolean running = true;
        while (running) {
            
            System.out.println("Select one of the following:");
            System.out.println("\t[D]eutsch");
            System.out.println("\t[E]nglish");
            System.out.println("\t[F]rancais");
            System.out.println("[Q]uit");
            
            try {
                if (cnsl != null){
                    input = cnsl.readLine().toLowerCase();

                    if (input.equals("d") ) {System.out.println("Guten Tag!\n");}
                    else if(input.equals("e")) {System.out.println("Good day!\n");}
                    else if(input.equals("f")) {System.out.println("bonne journée!\n");}
                    else if(input.equals("q")){running = false; System.out.println("Quitting...");}
                    else {System.out.println("Please use correct input. Use either D or E or F or Q (it is case insensitive)\n");}
                }
            } catch (Exception ex) {
                ex.printStackTrace();

            }

        }
    }
}