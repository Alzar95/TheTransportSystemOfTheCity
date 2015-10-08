package TTSOTC;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.*;
import java.util.Timer;

/**
 * Created by user on 14.09.2015.
 */
public class PanelTools extends JLabel {
    private JPanel panelTools;
    private Border borderTools;
    private JComboBox comboBox;
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane tablePane;
    private JButton button;
    private JLabel pT;
    private volatile int time, t1, t2, t3, t4, t5;

    public PanelTools() {
        panelTools = new JPanel();
        model = new DefaultTableModel();
        table = new JTable(model);
        tablePane = new JScrollPane(table);
        borderTools = BorderFactory.createTitledBorder("Tools");
        comboBox = new JComboBox();
        time = -1;
        t1 = 0;
        t2 = 5;
        t3 = 10;
        t4 = 15;
        t5 = 20;
        button = new JButton("OK");
        panelTools.setBorder(borderTools);
        panelTools.add(comboBox);
        panelTools.add(button);
        panelTools.add(tablePane, BorderLayout.NORTH);
        pT = new PanelTools(new Timer());
        pT.setFont(new Font(pT.getFont().getFontName(), pT.getFont().getStyle(), 36));
        panelTools.add(pT);
        model.addColumn("Остановка");
        model.addColumn("Отправление");
        model.addColumn("Прибытие");

        tablePane.setPreferredSize(new Dimension(250, 103));
        panelTools.setPreferredSize(new Dimension(300, 600));
    }

    public PanelTools(java.util.Timer timer)
    {
        timer.scheduleAtFixedRate(timerTask, 0, 1000);
    }

    private TimerTask timerTask = new TimerTask()
    {
       // private volatile int time = -1;

        private Runnable refresher = new Runnable()
        {
            @Override
            public void run ()
            {
                int t = time;
                PanelTools.this.setText(String.format("%02d:%02d", t / 60, t % 60));
            }
        };

        @Override
        public void run ()
        {
            time++;
            SwingUtilities.invokeLater(refresher);
        }
    };

    public int getT1() {
        return t1;
    }

    public int getT2() {
        return t2;
    }

    public JLabel getpT() {
        return pT;
    }

    public DefaultTableModel getModel() {
        return model;
    }


    public int getTime() {
        return time;
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
