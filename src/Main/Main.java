
package Main;

import Views.MainView;
import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
            MainView mainView = new MainView();
           
            mainView.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
