package optional;

import javax.swing.*;
import java.awt.*;
/**
 * a class that defines the main frame which contains the other panels
 */
public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    public DrawingPanel canvas;
    SelectShapePanel selectShapePanel;

    public MainFrame() {
        super("My drawing");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        canvas = new DrawingPanel(this);
        configPanel = new ConfigPanel(this);
        controlPanel = new ControlPanel(this);
        selectShapePanel = new SelectShapePanel(this);
        add(canvas, BorderLayout.CENTER);
        add(configPanel, BorderLayout.NORTH);
        add(controlPanel, BorderLayout.SOUTH);
        add(selectShapePanel, BorderLayout.WEST);
        pack();
    }

}