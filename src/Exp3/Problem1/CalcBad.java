package Exp3.Problem1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Ui_CalcBad {
    public JButton plusBut, minusBut, multBut, divBut, modBut;
    public JTextField lhsEdit, rhsEdit, resEdit;
    
    public void setupUi(JFrame widget) {
        widget.setTitle("Calculator Demo");
        plusBut = new JButton("+");
        minusBut = new JButton("-");
        multBut = new JButton("*");
        divBut = new JButton("/");
        modBut = new JButton("%");
        lhsEdit = new JTextField("0", 20);
        rhsEdit = new JTextField("0", 20);
        resEdit = new JTextField(null, 0);
        resEdit.setEditable(false);

        Container pane = widget.getContentPane();
        pane.setLayout(new GridLayout(6, 2));
        pane.add(new JLabel("Left Oprand"));
        pane.add(lhsEdit);
        pane.add(new JLabel("Right Oprand"));
        pane.add(rhsEdit);
        pane.add(new JLabel("Result"));
        pane.add(resEdit);
        pane.add(plusBut);
        pane.add(minusBut);
        pane.add(multBut);
        pane.add(divBut);
        pane.add(modBut);
    }
}

public class CalcBad extends JFrame implements ActionListener {
    private Ui_CalcBad ui;

    public CalcBad() {
        ui = new Ui_CalcBad();
        ui.setupUi(this);
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ui.plusBut.addActionListener(this);
        ui.minusBut.addActionListener(this);
        ui.multBut.addActionListener(this);
        ui.divBut.addActionListener(this);
        ui.modBut.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double lhs = Double.parseDouble(ui.lhsEdit.getText());
            double rhs = Double.parseDouble(ui.rhsEdit.getText());
            double res = 0;
            Object o = e.getSource();
            if (o == ui.plusBut)
                res = lhs + rhs;
            else if (o == ui.minusBut)
                res = lhs - rhs;
            else if (o == ui.multBut)
                res = lhs * rhs;
            else if (o == ui.divBut)
                res = lhs / rhs;
            else if (o == ui.modBut)
                res = lhs % rhs;
            ui.resEdit.setText(Double.toString(res));
        } catch (NumberFormatException exc) {
            JOptionPane.showMessageDialog(this, "Wrong Input!");
        }
    }

    public static void main(String[] args) {
        new CalcBad().setVisible(true);
    }
}