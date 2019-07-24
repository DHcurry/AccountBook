package gui.panel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SpendPanel extends JPanel{
    public JPanel spendpanel = new JPanel();
    public JPanel north = new JPanel();
    public JPanel south = new JPanel();
    public JPanel northofleft = new JPanel();
    public JPanel northofright = new JPanel();
    public JLabel day = new JLabel("今日消费");
    public JLabel month = new JLabel("本月消费");
    public JLabel average = new JLabel("日均消费");
    public JLabel remain = new JLabel("本月剩余");
    public JLabel dailyuse = new JLabel("日均可用");
    public JLabel day2end = new JLabel("距离月末");

    private  SpendPanel(){
//        主框架
        spendpanel.setBounds(150,0,650,800);
        spendpanel.setLayout(new BorderLayout());
//         上框架中，分为左框架和右框架
        north.setSize(650,400);
        north.setLayout(new BorderLayout());
        northofleft.setLayout(new GridLayout(2,1));
        northofleft.add(day);
        northofleft.add(month);
        northofleft.setBackground(Color.pink);
        northofleft.setPreferredSize(new Dimension(250,500));
        north.add(northofleft,BorderLayout.WEST);
        north.setPreferredSize(new Dimension(650,500));
        northofright.setBackground(Color.yellow);

        south.setLayout(new GridLayout(1,4));
        south.add(average);
        south.add(remain);
        south.add(dailyuse);
        south.add(day2end);
        south.setPreferredSize(new Dimension(650,300));
        south.setBackground(Color.red);

        spendpanel.add(north, BorderLayout.CENTER);
        spendpanel.add(south, BorderLayout.SOUTH);
    }

    private static  SpendPanel instance = new SpendPanel();
    public  static SpendPanel getInstance(){
        return  instance;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,800,800);
        frame.setLayout(null);
        SpendPanel sp = SpendPanel.getInstance();
        frame.add(sp.spendpanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
