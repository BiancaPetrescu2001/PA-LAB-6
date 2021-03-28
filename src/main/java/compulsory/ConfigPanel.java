package compulsory;

import javax.swing.*;
import java.awt.*;
import java.util.regex.Pattern;

/**
 * A class that defines certain components of the interface, mainly the features that decide which and how shapes are drawn
 */
public class ConfigPanel extends JPanel {
    final MainFrame frame;
    int size = 0;
    int sides = 0;
    Color color;

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 5));
        this.setBorder(BorderFactory.createLineBorder(Color.black));


        JLabel sizeLabel = new JLabel("Size:");
        sizeLabel.setFont(new Font("Arial ", Font.PLAIN, 20));

        JTextField sizeInputField = new JTextField("Enter size here", 10);
        sizeInputField.setBorder(BorderFactory.createLineBorder(Color.black));


        JLabel sidesLabel = new JLabel("Number of sides:");
        sidesLabel.setFont(new Font("Arial ", Font.PLAIN, 20));

        JSpinner sidesField = new JSpinner(new SpinnerNumberModel(3, 1, 10, 1));
        sidesField.setValue(3); //default number of sides
        sidesField.setFont(new Font("Arial", Font.PLAIN, 15));


        JLabel colorLabel = new JLabel("Color of the shape:");
        colorLabel.setFont(new Font("Arial ", Font.PLAIN, 20));

        String[] colors = {"Random", "Black", "Green", "Red"};
        JComboBox<String> colorCombo = new JComboBox<>(colors);
        colorCombo.setSelectedIndex(0);

        JButton saveBtn = new JButton("Start Drawing");
        saveBtn.addActionListener(e -> {
            if (Pattern.matches("[1-9][0-9]?[0-9]?", sizeInputField.getText()))
                frame.configPanel.size = Integer.parseInt(sizeInputField.getText());
            else {
                frame.configPanel.size = 0;
            }

            frame.configPanel.sides = (int) sidesField.getValue();

            Object[] colors1 = colorCombo.getSelectedObjects();

            if (colors1[0].equals("Black")) {
                frame.configPanel.color = Color.black;
            } else {
                frame.configPanel.color = null;
            }
            if (colors1[0].equals("Green")) {
                frame.configPanel.color = Color.green;
            } else {
                frame.configPanel.color = null;
            }
            if (colors1[0].equals("Red")) {
                frame.configPanel.color = Color.red;
            } else {
                frame.configPanel.color = null;
            }
        });


        add(sizeLabel);
        add(sizeInputField);

        add(sidesLabel);
        add(sidesField);

        add(colorLabel);
        add(colorCombo);

        add(saveBtn);
    }
}

