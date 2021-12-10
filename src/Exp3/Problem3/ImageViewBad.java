package Exp3.Problem3;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FileDialog;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Ui_ImgViewBad {
    public JLabel _1, displayLbl;
    public JTextField pathEdit;
    public JButton selBut, confirmBut;

    public void setupUi(JFrame widget) {
        _1 = new JLabel("Path:");
        pathEdit = new JTextField(System.getProperty("user.home"));
        displayLbl = new JLabel("Not set");
        selBut = new JButton("Select");
        confirmBut = new JButton("Confirm");
        widget.setTitle("Image Viewer");

        Container pane = widget.getContentPane();
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = c.gridy = 0;
        c.weightx = c.weighty = 1;
        pane.add(_1, c);

        c.gridx = 1; c.weightx = 7;
        pane.add(pathEdit, c);
        c.gridx = 2; c.weightx = 2;
        pane.add(selBut, c);
        c.gridx = 3;
        pane.add(confirmBut, c);

        c.gridx = 0; c.gridy = 1;
        c.gridwidth = 4;
        c.weightx = 0; c.weighty = 5;
        pane.add(displayLbl, c);
    }
}
public class ImageViewBad extends JFrame implements ActionListener{
    private Ui_ImgViewBad ui;
    private ImageIcon img;

    public ImageViewBad() {
        ui = new Ui_ImgViewBad();
        ui.setupUi(this);
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.confirmBut.addActionListener(this);
        ui.selBut.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o == ui.selBut) {
            FileDialog fd = new FileDialog(this, "Choose an Image", FileDialog.LOAD);
            fd.setDirectory(System.getProperty("user.home"));
            fd.setVisible(true);
            if (fd.getFile() != null)
                ui.pathEdit.setText(fd.getDirectory() + fd.getFile());
        } else if (o == ui.confirmBut) {
            img = new ImageIcon(ui.pathEdit.getText());
            setSize(img.getIconWidth() < 200 ? 200 : img.getIconWidth(),
                img.getIconHeight() < 200 ? 260 : img.getIconHeight() + 60);
            ui.displayLbl.setIcon(img);
            ui.displayLbl.setText(ui.pathEdit.getText());
            ui.displayLbl.setVerticalTextPosition(JLabel.BOTTOM);
            ui.displayLbl.setHorizontalTextPosition(JLabel.CENTER);
        } else System.err.println("You Sucks");
    }

    public static void main(String[] args) {
        new ImageViewBad().setVisible(true);
    }
}
