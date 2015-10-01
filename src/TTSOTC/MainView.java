package TTSOTC;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 12.09.2015.
 */
public class MainView {
    private JFrame mainFrame;
    private PanelMap panelMap;
    private PanelTools panelTools;

    public MainView() {
        mainFrame = new JFrame("Map");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.panelMap = new PanelMap();
        this.panelTools = new PanelTools();
        mainFrame.add(panelMap.getDrawingArea(), BorderLayout.WEST);
        mainFrame.add(panelTools.getPanelTools(), BorderLayout.EAST);
        mainFrame.pack();
        mainFrame.setVisible(true);
        mainFrame.setLayout(null);
        mainFrame.setLocationRelativeTo(null);
    }

    public PanelTools getPanelTools() {
        return panelTools;
    }

    public PanelMap getPanelMap() {
        return panelMap;
    }

    public void setPanelTools(PanelTools panelTools) {
        this.panelTools = panelTools;
    }
}
