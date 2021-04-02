package optional;


import javax.swing.*;
/**
 * A class that defines certain components of the interface, mainly the features that decide which and how shapes are drawn
 */
public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel labelc1;
    JLabel labelc2;
    JSpinner sidesField;
    JSpinner sizeField;
    JSpinner radiusField;
    JComboBox colorCombo;
    JCheckBox randSizeCheck;

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        // Regular Polygon
        label1 = new JLabel("Number of sides:");
        label2 = new JLabel("Color:");
        label3 = new JLabel("Size:");
        sidesField = new JSpinner(new SpinnerNumberModel(3, 3, 10, 1));
        sizeField = new JSpinner(new SpinnerNumberModel(20, 5, 100, 5));
        sidesField.setValue(6);
        String[] colors = {"Random Color", "Green"};
        colorCombo = new JComboBox(colors);
        randSizeCheck = new JCheckBox("Random Size");
        add(label1);
        add(sidesField);
        add(label2);
        add(colorCombo);
        add(label3);
        add(sizeField);
        add(randSizeCheck);

        //  Circle
        labelc1 = new JLabel("Color: ");
        labelc2 = new JLabel("Radius: ");
        radiusField = new JSpinner(new SpinnerNumberModel(40, 10, 125, 5));

    }
}
