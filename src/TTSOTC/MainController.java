package TTSOTC;

import java.awt.*;
import java.awt.event.ActionEvent;
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
        for (int i = 0; i < mainModel.getTransportList().size(); i++)
        mainView.getPanelTools().getComboBox().addItem(mainModel.getTransportList().get(i));
        mainView.getPanelTools().getButton().addActionListener(new HighlightAction());
    }

    class HighlightAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (mainView.getPanelTools().getComboBox().getSelectedItem() == mainModel.getTransportList().get(0)) {
                if (mainView.getPanelMap().getRadioButton1().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton2().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton3().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton4().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton5().isSelected() == false)
            {
                mainView.getPanelMap().getRadioButton1().setSelected(true);
                mainView.getPanelMap().getRadioButton2().setSelected(true);
                mainView.getPanelMap().getRadioButton3().setSelected(true);
                mainView.getPanelMap().getRadioButton4().setSelected(true);
                mainView.getPanelMap().getRadioButton5().setSelected(true);
                return;
            } else {
                    mainView.getPanelMap().getRadioButton1().setSelected(false);
                    mainView.getPanelMap().getRadioButton2().setSelected(false);
                    mainView.getPanelMap().getRadioButton3().setSelected(false);
                    mainView.getPanelMap().getRadioButton4().setSelected(false);
                    mainView.getPanelMap().getRadioButton5().setSelected(false);
                    return;
                }
            }
            if (mainView.getPanelTools().getComboBox().getSelectedItem() == mainModel.getTransportList().get(1)) {
                if (mainView.getPanelMap().getRadioButton6().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton7().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton8().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton9().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton10().isSelected() == false)
                {
                    mainView.getPanelMap().getRadioButton6().setSelected(true);
                    mainView.getPanelMap().getRadioButton7().setSelected(true);
                    mainView.getPanelMap().getRadioButton8().setSelected(true);
                    mainView.getPanelMap().getRadioButton9().setSelected(true);
                    mainView.getPanelMap().getRadioButton10().setSelected(true);
                    return;
                } else {
                    mainView.getPanelMap().getRadioButton6().setSelected(false);
                    mainView.getPanelMap().getRadioButton7().setSelected(false);
                    mainView.getPanelMap().getRadioButton8().setSelected(false);
                    mainView.getPanelMap().getRadioButton9().setSelected(false);
                    mainView.getPanelMap().getRadioButton10().setSelected(false);
                    return;
                }
            }
            if (mainView.getPanelTools().getComboBox().getSelectedItem() == mainModel.getTransportList().get(2)) {
                if (mainView.getPanelMap().getRadioButton11().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton12().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton13().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton14().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton15().isSelected() == false)
                {
                    mainView.getPanelMap().getRadioButton11().setSelected(true);
                    mainView.getPanelMap().getRadioButton12().setSelected(true);
                    mainView.getPanelMap().getRadioButton13().setSelected(true);
                    mainView.getPanelMap().getRadioButton14().setSelected(true);
                    mainView.getPanelMap().getRadioButton15().setSelected(true);
                    return;
                } else {
                    mainView.getPanelMap().getRadioButton11().setSelected(false);
                    mainView.getPanelMap().getRadioButton12().setSelected(false);
                    mainView.getPanelMap().getRadioButton13().setSelected(false);
                    mainView.getPanelMap().getRadioButton14().setSelected(false);
                    mainView.getPanelMap().getRadioButton15().setSelected(false);
                    return;
                }
            }
            if (mainView.getPanelTools().getComboBox().getSelectedItem() == mainModel.getTransportList().get(3)) {
                if (mainView.getPanelMap().getRadioButton16().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton17().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton18().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton19().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton20().isSelected() == false)
                {
                    mainView.getPanelMap().getRadioButton16().setSelected(true);
                    mainView.getPanelMap().getRadioButton17().setSelected(true);
                    mainView.getPanelMap().getRadioButton18().setSelected(true);
                    mainView.getPanelMap().getRadioButton19().setSelected(true);
                    mainView.getPanelMap().getRadioButton20().setSelected(true);
                    return;
                } else {
                    mainView.getPanelMap().getRadioButton16().setSelected(false);
                    mainView.getPanelMap().getRadioButton17().setSelected(false);
                    mainView.getPanelMap().getRadioButton18().setSelected(false);
                    mainView.getPanelMap().getRadioButton19().setSelected(false);
                    mainView.getPanelMap().getRadioButton20().setSelected(false);
                    return;
                }
            }
            if (mainView.getPanelTools().getComboBox().getSelectedItem() == mainModel.getTransportList().get(4)) {
                if (mainView.getPanelMap().getRadioButton2().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton3().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton4().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton5().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton6().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton7().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton8().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton10().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton17().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton19().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton20().isSelected() == false)
                {
                    mainView.getPanelMap().getRadioButton2().setSelected(true);
                    mainView.getPanelMap().getRadioButton3().setSelected(true);
                    mainView.getPanelMap().getRadioButton4().setSelected(true);
                    mainView.getPanelMap().getRadioButton5().setSelected(true);
                    mainView.getPanelMap().getRadioButton6().setSelected(true);
                    mainView.getPanelMap().getRadioButton7().setSelected(true);
                    mainView.getPanelMap().getRadioButton8().setSelected(true);
                    mainView.getPanelMap().getRadioButton10().setSelected(true);
                    mainView.getPanelMap().getRadioButton17().setSelected(true);
                    mainView.getPanelMap().getRadioButton19().setSelected(true);
                    mainView.getPanelMap().getRadioButton20().setSelected(true);
                    return;
                } else {
                    mainView.getPanelMap().getRadioButton2().setSelected(false);
                    mainView.getPanelMap().getRadioButton3().setSelected(false);
                    mainView.getPanelMap().getRadioButton4().setSelected(false);
                    mainView.getPanelMap().getRadioButton5().setSelected(false);
                    mainView.getPanelMap().getRadioButton6().setSelected(false);
                    mainView.getPanelMap().getRadioButton7().setSelected(false);
                    mainView.getPanelMap().getRadioButton8().setSelected(false);
                    mainView.getPanelMap().getRadioButton10().setSelected(false);
                    mainView.getPanelMap().getRadioButton17().setSelected(false);
                    mainView.getPanelMap().getRadioButton19().setSelected(false);
                    mainView.getPanelMap().getRadioButton20().setSelected(false);
                    return;
                }
            }
            if (mainView.getPanelTools().getComboBox().getSelectedItem() == mainModel.getTransportList().get(5)) {
                if (mainView.getPanelMap().getRadioButton9().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton10().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton13().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton14().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton17().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton18().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton19().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton20().isSelected() == false)
                {
                    mainView.getPanelMap().getRadioButton9().setSelected(true);
                    mainView.getPanelMap().getRadioButton10().setSelected(true);
                    mainView.getPanelMap().getRadioButton13().setSelected(true);
                    mainView.getPanelMap().getRadioButton14().setSelected(true);
                    mainView.getPanelMap().getRadioButton17().setSelected(true);
                    mainView.getPanelMap().getRadioButton18().setSelected(true);
                    mainView.getPanelMap().getRadioButton19().setSelected(true);
                    mainView.getPanelMap().getRadioButton20().setSelected(true);
                    return;
                } else {
                    mainView.getPanelMap().getRadioButton9().setSelected(false);
                    mainView.getPanelMap().getRadioButton10().setSelected(false);
                    mainView.getPanelMap().getRadioButton13().setSelected(false);
                    mainView.getPanelMap().getRadioButton14().setSelected(false);
                    mainView.getPanelMap().getRadioButton17().setSelected(false);
                    mainView.getPanelMap().getRadioButton18().setSelected(false);
                    mainView.getPanelMap().getRadioButton19().setSelected(false);
                    mainView.getPanelMap().getRadioButton20().setSelected(false);
                    return;
                }
            }
        }
        }
    }

