package co.edu.uptc.view;

import javax.swing.*;
import java.awt.*;

public class JComboBoxUPTC extends JComboBox<String> {

    public JComboBoxUPTC() {
        setFont(new Font("Arial", Font.PLAIN, 20));
        setForeground(Color.BLACK);
        setPreferredSize(new Dimension(420, 50));
        setUI(new JComboBoxUI());
        setRenderer(new JComboCell());
    }

}
