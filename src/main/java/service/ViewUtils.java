package service;

import javax.swing.*;
import java.awt.*;

public class ViewUtils {
    private static Color actualColor = Color.GRAY;

    public static void setPanelProperty(JPanel panel){
        panel.setBackground(actualColor);
    }

    public static void setPanelWinnerColor(JPanel panel){
        actualColor = Color.GREEN;
        panel.setBackground(actualColor);
    }

    public static void setButtonProperty(JButton button){
        button.setPreferredSize(new Dimension(200, 200));
        button.setFont(new Font("Arial", Font.PLAIN, 40));
    }

    public static Color getActualColor() {
        return actualColor;
    }


}
