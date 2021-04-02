package optional;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * a panel that allows users to select which shape should be drawn and determines the action (delete or draw)
 */
public class SelectShapePanel extends JPanel {
    final MainFrame frame;
    ButtonGroup bGroup;
    ButtonGroup drawAndDelete;
    /**
     * using radio buttons because only one at a time can be selected
     */
    JRadioButton draw;
    JRadioButton del;
    JRadioButton RegularPolygon;
    JRadioButton Circle;
    JRadioButton drawL;

    public SelectShapePanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        bGroup = new ButtonGroup();
        RegularPolygon = new JRadioButton("Regular Polygon");
        Circle = new JRadioButton("Circle");
        bGroup.add(RegularPolygon);
        bGroup.add(Circle);

        drawAndDelete = new ButtonGroup();
        draw = new JRadioButton("Draw");
        del = new JRadioButton("Delete");
        drawL = new JRadioButton("DrawLine");
        drawAndDelete.add(draw);
        drawAndDelete.add(del);
        drawAndDelete.add(drawL);
        draw.setSelected(true); //default selected button

        RegularPolygon.setSelected(true); //default selected button
        RegularPolygon.addActionListener(this::RegularPolygon);
        Circle.addActionListener(this::Circle);

        setLayout(new GridLayout(5, 1));
        add(RegularPolygon);
        add(Circle);
        add(draw);
        add(del);
        add(drawL);
    }

    /**
     * the following 2 methods reconfigure the ConfigPanel based on what shape is chosen (polygon or circle)
     */
    private void RegularPolygon(ActionEvent e) {
        frame.configPanel.removeAll();
        frame.configPanel.add(frame.configPanel.label1);
        frame.configPanel.add(frame.configPanel.sidesField);
        frame.configPanel.add(frame.configPanel.label2);
        frame.configPanel.add(frame.configPanel.colorCombo);
        frame.configPanel.add(frame.configPanel.label3);
        frame.configPanel.add(frame.configPanel.sizeField);
        frame.configPanel.add(frame.configPanel.randSizeCheck);
        frame.configPanel.updateUI();
    }

    private void Circle(ActionEvent e) {
        frame.configPanel.removeAll();
        frame.configPanel.add(frame.configPanel.labelc1);
        frame.configPanel.add(frame.configPanel.colorCombo);
        frame.configPanel.add(frame.configPanel.labelc2);
        frame.configPanel.add(frame.configPanel.radiusField);
        frame.configPanel.add(frame.configPanel.randSizeCheck);
        frame.configPanel.updateUI();
    }


}
