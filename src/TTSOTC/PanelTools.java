package TTSOTC;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Created by user on 14.09.2015.
 */
public class PanelTools {
    private JPanel panelTools;
    private Border borderTools;
    private JComboBox comboBox;
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane tablePane;
    private JButton button;

    public PanelTools() {
        panelTools = new JPanel();
        model = new DefaultTableModel();
        model.addColumn("Остановка");
        model.addColumn("Отправление");
        model.addColumn("Прибытие");
        table = new JTable(model);
        tablePane = new JScrollPane(table);
        borderTools = BorderFactory.createTitledBorder("Tools");
        comboBox = new JComboBox();
        button = new JButton("OK");
        panelTools.setBorder(borderTools);
        panelTools.add(comboBox);
        panelTools.add(button);
        panelTools.add(tablePane, BorderLayout.NORTH);
        tablePane.setPreferredSize(new Dimension(250, 150));
        panelTools.setPreferredSize(new Dimension(300, 600));
    }

    public JButton getButton() {
        return button;
    }

    public JPanel getPanelTools() {
        return panelTools;
    }

    public JComboBox getComboBox() {
        return comboBox;
    }


}
