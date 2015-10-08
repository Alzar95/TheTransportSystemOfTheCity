package TTSOTC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimerTask;

/**
 * Created by user on 25.09.2015.
 */
public class MainController {
    private MainView mainView;
    private MainModel mainModel;
    private JLabel imageLabel;
    private Date now;
    private String[] RB;
    private String t1, t2, t3, t4, t5;

    public MainController( MainModel mainModel, MainView mainView) {
        this.mainView = mainView;
        this.mainModel = mainModel;
        now = new Date();
        t1 = "+0";
        t2 = "+5";
        t3 = "+10";
        t4 = "+15";
        t5 = "+20";
        imageLabel = new JLabel(new ImageIcon("bus.png"));
        mainModel.getListRB().add(mainView.getPanelMap().getRadioButton1().getText());
        mainModel.getListRB().add(mainView.getPanelMap().getRadioButton2().getText());
        mainModel.getListRB().add(mainView.getPanelMap().getRadioButton3().getText());
        mainModel.getListRB().add(mainView.getPanelMap().getRadioButton4().getText());
        mainModel.getListRB().add(mainView.getPanelMap().getRadioButton5().getText());

        for (int i = 0; i < mainModel.getTransportList().size(); i++)
        mainView.getPanelTools().getComboBox().addItem(mainModel.getTransportList().get(i));
        mainView.getPanelTools().getButton().addActionListener(new HighlightAction());
    }


    class HighlightAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mainModel.getListTime().add(mainView.getPanelTools().getpT().getText() + t1);
            mainModel.getListTime().add(mainView.getPanelTools().getpT().getText() + t2);
            mainModel.getListTime().add(mainView.getPanelTools().getpT().getText() + t3);
            mainModel.getListTime().add(mainView.getPanelTools().getpT().getText() + t4);
            mainModel.getListTime().add(mainView.getPanelTools().getpT().getText() + t5);
            if (mainView.getPanelTools().getComboBox().getSelectedItem() == mainModel.getTransportList().get(0)) {
                if (mainView.getPanelMap().getRadioButton1().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton2().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton3().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton4().isSelected() == false &&
                        mainView.getPanelMap().getRadioButton5().isSelected() == false)
            {
                for (int i = 0; i < mainModel.getListRB().size(); i++) {
                mainView.getPanelTools().getModel().addRow(new Object[] {
                        mainModel.getListRB().get(i),
                       // mainView.getPanelMap().getTime(),
                       // mainView.getPanelTools().getpT().getText()
                        mainModel.getListTime().get(i)
                });
                   // mainView.getPanelTools().getTime()+=5;
                }
                mainView.getPanelMap().getDrawingArea().add(mainView.getPanelMap().getImageLabel());
                mainView.getPanelMap().getDrawingArea().revalidate();
                mainView.getPanelMap().getRadioButton1().setSelected(true);
                mainView.getPanelMap().getRadioButton2().setSelected(true);
                mainView.getPanelMap().getRadioButton3().setSelected(true);
                mainView.getPanelMap().getRadioButton4().setSelected(true);
                mainView.getPanelMap().getRadioButton5().setSelected(true);
                return;
            } else {
                    mainView.getPanelMap().getDrawingArea().remove(mainView.getPanelMap().getImageLabel());
                    mainView.getPanelMap().getDrawingArea().revalidate();
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
                    mainView.getPanelMap().getDrawingArea().add(mainView.getPanelMap().getImageBusB());
                    mainView.getPanelMap().getDrawingArea().revalidate();
                    mainView.getPanelMap().getRadioButton6().setSelected(true);
                    mainView.getPanelMap().getRadioButton7().setSelected(true);
                    mainView.getPanelMap().getRadioButton8().setSelected(true);
                    mainView.getPanelMap().getRadioButton9().setSelected(true);
                    mainView.getPanelMap().getRadioButton10().setSelected(true);
                    return;
                } else {
                    mainView.getPanelMap().getDrawingArea().remove(mainView.getPanelMap().getImageBusB());
                    mainView.getPanelMap().getDrawingArea().revalidate();
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
                    mainView.getPanelMap().getDrawingArea().add(mainView.getPanelMap().getImageBusC());
                    mainView.getPanelMap().getDrawingArea().revalidate();
                    mainView.getPanelMap().getRadioButton11().setSelected(true);
                    mainView.getPanelMap().getRadioButton12().setSelected(true);
                    mainView.getPanelMap().getRadioButton13().setSelected(true);
                    mainView.getPanelMap().getRadioButton14().setSelected(true);
                    mainView.getPanelMap().getRadioButton15().setSelected(true);
                    return;
                } else {
                    mainView.getPanelMap().getDrawingArea().remove(mainView.getPanelMap().getImageBusC());
                    mainView.getPanelMap().getDrawingArea().revalidate();
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
                    mainView.getPanelMap().getDrawingArea().add(mainView.getPanelMap().getImageBusD());
                    mainView.getPanelMap().getDrawingArea().revalidate();
                    mainView.getPanelMap().getRadioButton16().setSelected(true);
                    mainView.getPanelMap().getRadioButton17().setSelected(true);
                    mainView.getPanelMap().getRadioButton18().setSelected(true);
                    mainView.getPanelMap().getRadioButton19().setSelected(true);
                    mainView.getPanelMap().getRadioButton20().setSelected(true);
                    return;
                } else {
                    mainView.getPanelMap().getDrawingArea().remove(mainView.getPanelMap().getImageBusD());
                    mainView.getPanelMap().getDrawingArea().revalidate();
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

