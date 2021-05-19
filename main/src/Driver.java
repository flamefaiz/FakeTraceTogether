
import com.boundary.LandingPage;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;

import javax.swing.*;

public class Driver {

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LandingPage lp = new LandingPage();
                lp.setVisible(true);
                lp.pack();
                lp.setLocationRelativeTo(null);
            }
        });
    }

}
