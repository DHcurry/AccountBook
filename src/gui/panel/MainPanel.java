package gui.panel;

import com.sun.tools.javac.Main;
import gui.listener.MenuListener;
import util.GuiUtil;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel{
    public JPanel j = new JPanel();
    public JButton note = new JButton("记一笔");
    public JButton spend = new JButton("消费总览");
    public JButton cate = new JButton("分类管理");
    public JButton month = new JButton("月度统计");
    public JButton config = new JButton("设置");
    public JButton input = new JButton("导入");
    public JButton output = new JButton("导出");

    private  MainPanel(){
        j.setPreferredSize(new Dimension(120,800));
        j.setLayout(new GridLayout(7,1));
        j.add(note);
        j.add(spend);
        j.add(cate);
        j.add(month);
        j.add(config);
        j.add(input);
        j.add(output);
        addListener();
    }
    private void addListener(){
        MenuListener listener = new MenuListener();
        note.addActionListener(listener);
        spend.addActionListener(listener);
        cate.addActionListener(listener);
    }
    private static MainPanel instance = new MainPanel();
    public  static MainPanel getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,800,800);
        frame.setLayout(new BorderLayout());
        MainPanel mp = MainPanel.getInstance();
        mp.setPreferredSize(new Dimension(150,800));
        frame.add(mp.j,BorderLayout.WEST);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
