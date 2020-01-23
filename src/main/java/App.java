import view.Game;

import javax.swing.*;
import java.awt.*;

public class App {

    public void print(){
        JFrame window = new JFrame("Tic Tac Max");
        window.setMinimumSize(new Dimension(600, 600));
        window.setMaximumSize(new Dimension(600, 600));
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Game().getMainPanel());
        window.pack();
        window.setVisible(true);
    }

}
