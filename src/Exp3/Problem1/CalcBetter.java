package Exp3.Problem1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Ui_CalcBetter {
    public JButton oprandBut[];
    public JTextField lhsEdit, rhsEdit, resEdit;
    public static final String opText[] = {
        "+", "-", "*", "/", "%"
    };
    public static ArrayList<BiFunction<Double,Double,Double> > opFunc;

    public void setupUi(JFrame widget) {
        widget.setTitle("Calculator Demo");
        oprandBut = new JButton[5];
        
        for (int i = 0; i < 5; i++)
            oprandBut[i] = new JButton(opText[i]);
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
        for (int i = 0; i < 5; i++)
            pane.add(oprandBut[i]);

        if (opFunc != null) return;
        opFunc = new ArrayList<BiFunction<Double,Double,Double> >();
        opFunc.add((Double a, Double b)->a + b);
        opFunc.add((Double a, Double b)->a - b);
        opFunc.add((Double a, Double b)->a * b);
        opFunc.add((Double a, Double b)->a / b);
        opFunc.add((Double a, Double b)->a % b);
    }
}

public class CalcBetter extends JFrame implements ActionListener {
    private Ui_CalcBetter ui;

    public CalcBetter() {
        ui = new Ui_CalcBetter();
        ui.setupUi(this);
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        for (int i = 0; i < 5; i++)
            ui.oprandBut[i].addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double lhs = Double.parseDouble(ui.lhsEdit.getText());
            double rhs = Double.parseDouble(ui.rhsEdit.getText());
            double res = 0;
            Object o = e.getSource();
            for (int i = 0; i < 5; i++)
                if (o == ui.oprandBut[i])
                    res = Ui_CalcBetter.opFunc.get(i).apply(lhs, rhs);
            ui.resEdit.setText(Double.toString(res));
        } catch (NumberFormatException exc) {
            JOptionPane.showMessageDialog(this, "Wrong Input!");
        }
    }

    public static void main(String[] args) {
        new CalcBetter().setVisible(true);
    }
}