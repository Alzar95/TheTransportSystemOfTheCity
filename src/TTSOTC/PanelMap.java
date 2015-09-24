package TTSOTC;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by user on 12.09.2015.
 */
public class PanelMap {
    private JPanel drawingArea;
    private Border borderMap;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;
    private JRadioButton radioButton6;
    private JRadioButton radioButton7;
    private JRadioButton radioButton8;
    private JRadioButton radioButton9;
    private JRadioButton radioButton10;
    private int x1, x2, y1, y2;

    public PanelMap() {
        Dimension boardSize = new Dimension(1000, 600);
        borderMap = BorderFactory.createTitledBorder("Map");
        radioButton1 = new JRadioButton("A1");
        radioButton2 = new JRadioButton("A2");
        radioButton3 = new JRadioButton("A3");
        radioButton4 = new JRadioButton("A4");
        radioButton5 = new JRadioButton("A5");
        radioButton6 = new JRadioButton("B1");
        radioButton7 = new JRadioButton("B2");
        radioButton8 = new JRadioButton("B3");
        radioButton9 = new JRadioButton("B4");
        radioButton10 = new JRadioButton("B5");
        x1 = 10;
        x2 = 10;
        y1 = 20;
        y2 = 20;



        drawingArea = new JPanel() {
            public void paint(Graphics graphics) {
                radioButton1.setLocation(91, 110);
                radioButton2.setLocation(171, 226);
                radioButton3.setLocation(351, 226);
                radioButton4.setLocation(351, 386);
                radioButton5.setLocation(171, 386);
                radioButton6.setLocation(831, 181);
                radioButton7.setLocation(831, 306);
                radioButton8.setLocation(731, 306);
                radioButton9.setLocation(651, 291);
                radioButton10.setLocation(651, 201);
                super.paint(graphics);

                int h = 0, xx1 = 0, xx2 = 0, d = 0;
                for (int j = 0; j < 24; j++) {
                    if (j != 0 && j % 2 == 0) {
                        d += 60;
                    }
                    for (int i = 0; i < 7; i++) {

                        graphics.drawLine(x1 + xx1 - d, y1 + h, x2 + xx2 - d, y2 + h + 70);
                        h += 80;
                    }
                    xx1 += 70;
                    xx2 += 70;
                    h = 0;
                }

                int l = 0, yy1 =0, yy2 = 0, w = 0;
                for (int e = 0; e < 14; e++) {
                    if (e != 0 && e % 2 == 0) {
                        w += 60;
                    }
                    for (int u = 0; u < 12; u++) {
                        graphics.drawLine(x1 + l, y1 + yy1 - w, x2 + l + 70, y2 + yy2 - w);
                        l += 80;
                    }
                    yy1 += 70;
                    yy2 += 70;
                    l = 0;
               }


            }
        };


        drawingArea.add(radioButton1);
        drawingArea.add(radioButton2);
        drawingArea.add(radioButton3);
        drawingArea.add(radioButton4);
        drawingArea.add(radioButton5);
        drawingArea.add(radioButton6);
        drawingArea.add(radioButton7);
        drawingArea.add(radioButton8);
        drawingArea.add(radioButton9);
        drawingArea.add(radioButton10);
        drawingArea.setBorder(borderMap);
        drawingArea.setPreferredSize(boardSize);
        //radioButton1.setSize(80, 30);
        //radioButton1.setLocation(20, 20);

    }

    public JPanel getDrawingArea() {
        return drawingArea;
    }
}
