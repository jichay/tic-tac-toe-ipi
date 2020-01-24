package service;

import javax.swing.*;
import java.awt.*;

public class ViewUtils {

    public static JButton setButtonProperty(){
        JButton button = new JButton("");
        button.setPreferredSize(new Dimension(200, 200));
        button.setFont(new Font("Arial", Font.PLAIN, 40));
        return button;
    }

}
