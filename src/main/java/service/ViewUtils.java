package service;

import javax.swing.*;
import java.awt.*;

public class ViewUtils {

    public static void setButtonProperty(JButton button){
        button.setPreferredSize(new Dimension(200, 200));
        button.setFont(new Font("Arial", Font.PLAIN, 40));
    }

}
