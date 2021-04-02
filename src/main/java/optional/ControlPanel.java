package optional;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

/**
 * a class that defines elements like buttons and their functions and action events
 */
public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton saveBtn = new JButton("Save");
    JButton loadBtn = new JButton("Load");
    JButton resetBtn = new JButton("Reset");
    JButton exitBtn = new JButton("Exit");
    JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        fileChooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG and JPG images", "png", "jpg");
        fileChooser.addChoosableFileFilter(filter);
        add(saveBtn);
        add(loadBtn);
        add(resetBtn);
        add(exitBtn);
        saveBtn.addActionListener(this::save);
        loadBtn.addActionListener(this::load);
        resetBtn.addActionListener(this::reset);
        exitBtn.addActionListener(this::exit);
    }

    private void save(ActionEvent e) {
        try {
            fileChooser.setDialogTitle("Specify where to save and the name:");
            int userSelection = fileChooser.showSaveDialog(frame);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                ImageIO.write(frame.canvas.image, "PNG", fileChooser.getSelectedFile());
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void load(ActionEvent e) {
        try {
            fileChooser.setDialogTitle("Specify the file you want to load:");
            int userSelection = fileChooser.showSaveDialog(frame);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                frame.canvas.image = ImageIO.read(fileChooser.getSelectedFile());
                frame.canvas.repaint();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void reset(ActionEvent e) {
        frame.canvas.shapes.clear();
        frame.canvas.graphics.setColor(Color.WHITE);
        frame.canvas.graphics.fillRect(0, 0, frame.canvas.W, frame.canvas.H);
        frame.repaint();
    }

    private void exit(ActionEvent e) {
        System.exit(0);
    }
}
