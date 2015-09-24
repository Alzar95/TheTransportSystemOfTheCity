package TTSOTC;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by user on 14.09.2015.
 */
public class PanelTools {
    private JPanel panelTools;
    private Border borderTools;
    private JComboBox comboBox;
    private JButton button;

    public PanelTools() {
        panelTools = new JPanel();
        borderTools = BorderFactory.createTitledBorder("Tools");
        comboBox = new JComboBox();
        button = new JButton("OK");
        panelTools.setBorder(borderTools);
       // comboBox.addItem("f");
        panelTools.add(comboBox);
        panelTools.add(button);
        panelTools.setPreferredSize(new Dimension(300, 600));
    }

    public JPanel getPanelTools() {
        return panelTools;
    }

    public JComboBox getComboBox() {
        return comboBox;
    }
}
