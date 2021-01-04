package Complete_Ones;

import javax.swing.*;
import java.awt.*;

public class J_label {
    public static void main(String[] args) {
        JLabel jLabel = new JLabel("PROGRAMMING IS FUN");
        jLabel.setFont(new Font("Arial", Font.ROMAN_BASELINE, 45));
        UIManager.put("OptionPane.minimumSize", new Dimension(300, 300));
        JOptionPane.showMessageDialog(null, jLabel, "Lottery Game", JOptionPane.DEFAULT_OPTION);
        jLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel.setCursor(Cursor.getDefaultCursor());





    }
}
