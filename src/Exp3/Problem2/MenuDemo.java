package Exp3.Problem2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

class Ui_MenuDemo {
    public JMenuBar mMenuBar;
    public JTextArea mTextArea;
    public JMenuItem bgItem, fgItem;
    public JMenuItem incSizeItem, decSizeItem;
    public JCheckBoxMenuItem boldItem, itaItem;
    public JMenuItem 中文Item, helloItem;

    public void setupUi(JFrame widget) {
        mTextArea = new JTextArea("文本区域演示");
        mTextArea.setText("你好世界");
        mMenuBar = new JMenuBar();
        JMenu lMenu = new JMenu("Text");
        JMenu rMenu = new JMenu("Format");
        JMenu colorSMenu = new JMenu("Color");
        JMenu fontSMenu = new JMenu("Font");
        incSizeItem = new JMenuItem("Increase Font Size");
        decSizeItem = new JMenuItem("Decrease Font Size");
        itaItem = new JCheckBoxMenuItem("Italic", false);
        boldItem = new JCheckBoxMenuItem("Bold", false);
        bgItem = new JMenuItem("Select Background Color");
        fgItem = new JMenuItem("Select Text Color");
        helloItem = new JMenuItem("Show Hello");
        中文Item = new JMenuItem("Show U8 String");

        mMenuBar.add(lMenu); mMenuBar.add(rMenu);
        lMenu.add(helloItem); lMenu.add(中文Item);
        rMenu.add(colorSMenu); rMenu.add(fontSMenu);
        fontSMenu.add(incSizeItem);
        fontSMenu.add(decSizeItem);
        fontSMenu.addSeparator(); 
        fontSMenu.add(boldItem);
        fontSMenu.add(itaItem);
        colorSMenu.add(bgItem);
        colorSMenu.add(fgItem);
        
        widget.setTitle("菜单演示");
        widget.setJMenuBar(mMenuBar);
        widget.setSize(400, 200);
        Container pane = widget.getContentPane();
        pane.add(mTextArea);
    }
}

public class MenuDemo extends JFrame implements ActionListener {
    private Ui_MenuDemo ui;
    private Font curFont; 

    public MenuDemo() {
        ui = new Ui_MenuDemo();
        ui.setupUi(this);
        curFont = ui.mTextArea.getFont();

        ui.itaItem.addActionListener(this);
        ui.boldItem.addActionListener(this);
        ui.decSizeItem.addActionListener(this);
        ui.incSizeItem.addActionListener(this);
        ui.bgItem.addActionListener(this);
        ui.fgItem.addActionListener(this);
        ui.中文Item.addActionListener(this);
        ui.helloItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o == ui.bgItem || o == ui.fgItem) {
            Color c = JColorChooser.showDialog(this, "Choose a Color",
                new Color(0,0,0));
            if (o == ui.fgItem)
                ui.mTextArea.setForeground(c);
            else ui.mTextArea.setBackground(c);
        } else if (o == ui.中文Item)
            ui.mTextArea.append("你好世界\n");
        else if (o == ui.helloItem)
            ui.mTextArea.append("Hello World\n");
        else if (o == ui.decSizeItem)
            ui.mTextArea.setFont(new Font(curFont.getName(), curFont.getStyle(),
                (int)(curFont.getSize() / 1.5)));
        else if (o == ui.incSizeItem)
            ui.mTextArea.setFont(new Font(curFont.getName(), curFont.getStyle(),
                (int)(curFont.getSize() * 1.5)));
        else if (o == ui.itaItem)
            ui.mTextArea.setFont(new Font(curFont.getName(),
                curFont.getStyle() ^ Font.ITALIC, curFont.getSize()));
        else if (o == ui.boldItem)
            ui.mTextArea.setFont(new Font(curFont.getName(),
                curFont.getStyle() ^ Font.BOLD, curFont.getSize()));

        curFont = ui.mTextArea.getFont();
    }

    public static void main(String[] args) {
        new MenuDemo().setVisible(true);
    }
}