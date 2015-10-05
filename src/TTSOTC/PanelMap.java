package TTSOTC;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 12.09.2015.
 */
public class PanelMap implements Runnable {
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
    private JRadioButton radioButton11;
    private JRadioButton radioButton12;
    private JRadioButton radioButton13;
    private JRadioButton radioButton14;
    private JRadioButton radioButton15;
    private JRadioButton radioButton16;
    private JRadioButton radioButton17;
    private JRadioButton radioButton18;
    private JRadioButton radioButton19;
    private JRadioButton radioButton20;
    private Timer timer;
    private JLabel imageLabel;
    private int x1, x2, y1, y2, xx, yy;

    public PanelMap()  {
        Dimension boardSize = new Dimension(1000, 600);
        borderMap = BorderFactory.createTitledBorder("Map");
        imageLabel = new JLabel(new ImageIcon("bus.png"));
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
        radioButton11 = new JRadioButton("C1");
        radioButton12 = new JRadioButton("C2");
        radioButton13 = new JRadioButton("C3");
        radioButton14 = new JRadioButton("C4");
        radioButton15 = new JRadioButton("C5");
        radioButton16 = new JRadioButton("U1");
        radioButton17 = new JRadioButton("U2");
        radioButton18 = new JRadioButton("U3");
        radioButton19 = new JRadioButton("U4");
        radioButton20 = new JRadioButton("U5");
        x1 = 10;
        x2 = 10;
        y1 = 20;
        y2 = 20;
        xx = 80;
        yy = 117;

        (new Thread(this)).start();

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
                radioButton11.setLocation(181, 66);
                radioButton12.setLocation(351, 66);
                radioButton13.setLocation(511, 66);
                radioButton14.setLocation(661, 66);
                radioButton15.setLocation(831, 66);
                radioButton16.setLocation(831, 421);
                radioButton17.setLocation(651, 421);
                radioButton18.setLocation(511, 501);
                radioButton19.setLocation(491, 386);
                radioButton20.setLocation(491, 261);

                imageLabel.setLocation(xx, yy);
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
               // graphics.drawRect(85, 105, 5, 5);

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
        drawingArea.add(radioButton11);
        drawingArea.add(radioButton12);
        drawingArea.add(radioButton13);
        drawingArea.add(radioButton14);
        drawingArea.add(radioButton15);
        drawingArea.add(radioButton16);
        drawingArea.add(radioButton17);
        drawingArea.add(radioButton18);
        drawingArea.add(radioButton19);
        drawingArea.add(radioButton20);
        //drawingArea.add(imageLabel);
        drawingArea.setBorder(borderMap);
        drawingArea.setPreferredSize(boardSize);
        //radioButton1.setSize(80, 30);
        //radioButton1.setLocation(20, 20);

    }

    public JLabel getImageLabel() {
        return imageLabel;
    }



    public JRadioButton getRadioButton1() {
        return radioButton1;
    }

    public JRadioButton getRadioButton2() {
        return radioButton2;
    }

    public JRadioButton getRadioButton3() {
        return radioButton3;
    }

    public JRadioButton getRadioButton4() {
        return radioButton4;
    }

    public JRadioButton getRadioButton5() {
        return radioButton5;
    }

    public JRadioButton getRadioButton6() {
        return radioButton6;
    }

    public JRadioButton getRadioButton7() {
        return radioButton7;
    }

    public JRadioButton getRadioButton8() {
        return radioButton8;
    }

    public JRadioButton getRadioButton9() {
        return radioButton9;
    }

    public JRadioButton getRadioButton10() {
        return radioButton10;
    }

    public JRadioButton getRadioButton11() {
        return radioButton11;
    }

    public JRadioButton getRadioButton12() {
        return radioButton12;
    }

    public JRadioButton getRadioButton13() {
        return radioButton13;
    }

    public JRadioButton getRadioButton14() {
        return radioButton14;
    }

    public JRadioButton getRadioButton15() {
        return radioButton15;
    }

    public JRadioButton getRadioButton16() {
        return radioButton16;
    }

    public JRadioButton getRadioButton17() {
        return radioButton17;
    }

    public JRadioButton getRadioButton18() {
        return radioButton18;
    }

    public JRadioButton getRadioButton19() {
        return radioButton19;
    }

    public JRadioButton getRadioButton20() {
        return radioButton20;
    }

    public JPanel getDrawingArea() {
        return drawingArea;
    }



    @Override
    public void run() {
                while (true)

                    try {
                        if (xx == 80 && yy > 90) {
                            if (xx == 80 && yy == 117) {
                                Thread.sleep(3000);
                            }
                            imageLabel.setLocation(xx, yy--);
                            Thread.sleep(10);
                        }
                        if (xx < 161 && yy == 90 ) {
                            imageLabel.setLocation(xx++, yy);
                            Thread.sleep(10);
                        }
                        if (xx == 160  && yy < 251) {
                            if (xx == 160 && yy == 234) {
                                Thread.sleep(3000);
                            }
                            imageLabel.setLocation(xx, yy++);
                            Thread.sleep(10);
                        }
                        if (xx < 401 && xx != 80 && yy == 251) {
                            if (xx == 357 && yy == 251) {
                                Thread.sleep(3000);
                            }
                            imageLabel.setLocation(xx++, yy);
                            Thread.sleep(10);
                        }

                        if (xx == 401 && yy < 411) {
                            imageLabel.setLocation(xx, yy++);
                            Thread.sleep(10);
                        }

                        if (xx > 80 && yy == 411) {
                            if (xx == 355 && yy == 411) {
                                Thread.sleep(3000);
                            }
                            if (xx == 175 && yy == 411) {
                                Thread.sleep(3000);
                            }
                            imageLabel.setLocation(xx--, yy);
                            Thread.sleep(10);
                        }

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
    }
}
