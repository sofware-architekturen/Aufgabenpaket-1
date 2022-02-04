import javax.swing.SwingUtilities;

import com.buchlager.client.ui.BuchlagerView;

public class Main
{

  public static void main(String[] args)
  {
    // Starte der GUI
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        BuchlagerView display = new BuchlagerView();
        display.setSize(800, 600);
        display.setLocationRelativeTo(null);
        display.setVisible(true);
      }
    });
  }

}
