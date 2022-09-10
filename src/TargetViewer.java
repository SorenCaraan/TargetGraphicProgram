// @author Soren Caraan

import javax.swing.JFrame;

public class TargetViewer
{
   public static void main (String[] args)
   {
       JFrame targFrame = new JFrame();

       targFrame.setSize(300,300);
       targFrame.setTitle("Target Drawing");
       targFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       TargetComponent component = new TargetComponent();
       targFrame.add(component);

       targFrame.setVisible(true);
   }
}