import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloWorldGraphical {

   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel goodDayLabel;
   private JPanel languagePanel;

   public HelloWorldGraphical(){
      prepareGUI();
      prepareEvents();
   }

   public static void main(String[] args){
      HelloWorldGraphical helloWorldGraphical = new HelloWorldGraphical();     
   }
      
   private void prepareGUI(){
      mainFrame = new JFrame("Hello World GUI");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));

      headerLabel = new JLabel("",JLabel.CENTER );
      goodDayLabel = new JLabel("",JLabel.CENTER);        

      goodDayLabel.setSize(350,100);
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
	        System.exit(0);
         }        
      });    
      languagePanel = new JPanel();
      languagePanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(languagePanel);
      mainFrame.add(goodDayLabel);
      mainFrame.setVisible(true);  
   }

   private void prepareEvents(){
      headerLabel.setText("Choose wisely (not like anything would happen anyway)"); 

      JButton deutschButton = new JButton("Deutsch");
      JButton englishButton = new JButton("English");
      JButton francaisButton = new JButton("Francais");

      deutschButton.setActionCommand("Deutsch");
      englishButton.setActionCommand("English");
      francaisButton.setActionCommand("Francais");

      deutschButton.addActionListener(new ButtonClickListener()); 
      englishButton.addActionListener(new ButtonClickListener()); 
      francaisButton.addActionListener(new ButtonClickListener()); 

      languagePanel.add(deutschButton);
      languagePanel.add(englishButton);
      languagePanel.add(francaisButton);       

      mainFrame.setVisible(true);  
   }

   private class ButtonClickListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         String command = e.getActionCommand();  
         if( command.equals( "Deutsch" ))  {
            goodDayLabel.setText("Guten Tag!");
         }
         else if( command.equals( "English" ) )  {
            goodDayLabel.setText("Good Day!"); 
         }else if( command.equals( "Francais" ) )  {
            goodDayLabel.setText("Bon jour!"); 
         }
         else  {
            System.exit(0);
         }  	
      }		
   }
}
