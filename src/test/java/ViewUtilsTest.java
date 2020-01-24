import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import service.ViewUtils;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;


public class ViewUtilsTest {

    @Tag("front")
    @Test
    @DisplayName("Button property test1")
    public void checkButtonProperties1(){
        JButton button = new JButton("");
        ViewUtils.setButtonProperty(button);
        assertEquals("", button.getText());
    }

    @Tag("front")
    @Test
    @DisplayName("Button property test2")
    public void checkButtonProperties2(){
        JButton button = new JButton("");
        ViewUtils.setButtonProperty(button);
        Dimension expectedD = new Dimension(200, 200);
        Dimension actualD =  button.getPreferredSize();
        assertEquals(expectedD, actualD);
    }

    @Tag("front")
    @Test
    @DisplayName("Button property test3")
    public void checkButtonProperties3(){
        JButton button = new JButton("");
        ViewUtils.setButtonProperty(button);
        Font expectedF = new Font("Arial", Font.PLAIN, 40);
        Font actualF = button.getFont();
        assertEquals(expectedF, actualF);
    }

}
