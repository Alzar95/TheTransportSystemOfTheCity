package TTSOTC;

import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by user on 25.09.2015.
 */
public class MainController {
    private MainView mainView;
    private MainModel mainModel;

    public MainController( MainModel mainModel, MainView mainView) {
        this.mainView = mainView;
        this.mainModel = mainModel;
        //mainView.getPanelTools().getComboBox().addItem(mainModel.getTransportList().getTransport().get(2));
    }
}
