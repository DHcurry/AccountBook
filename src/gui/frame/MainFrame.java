package gui.frame;

import gui.panel.MainPanel;
import gui.panel.NotePanel;
import gui.panel.SpendPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MainFrame extends JFrame{
    public JFrame frame = new JFrame("AccountBook");
    public JPanel menu =  new JPanel();
    public JPanel workplace = new JPanel();
    private MainFrame(){
        frame.setSize(800,800);
        frame.setLocation(50,50);
        frame.setLayout(new BorderLayout());
        menu.setPreferredSize(new Dimension(150,800));
        workplace.setPreferredSize(new Dimension(650,800));
        frame.add(menu,BorderLayout.WEST);
        frame.add(workplace,BorderLayout.EAST);
        menu.add(MainPanel.getInstance().j,BorderLayout.WEST);
    }
    private static MainFrame instance = new MainFrame();

    public static MainFrame getInstance(){
        return instance;
    }

    public static void main(String[] args) {
//        设置窗体
        MainFrame mf = MainFrame.getInstance();
        mf.menu.add(MainPanel.getInstance().j,BorderLayout.WEST);
        mf.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.frame.setVisible(true);
    }
}
