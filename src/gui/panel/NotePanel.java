package gui.panel;

import DAO.CateDAO;
import entity.Category;
import gui.listener.NoteListener;

import javax.swing.*;
import java.awt.*;

public class NotePanel {
    public JPanel notepanel = new JPanel();
    public JPanel northofpanel = new JPanel();
    public JPanel southofpanel = new JPanel();
    public JPanel northofpanel_left = new JPanel();
    public JPanel northofpanel_rigth = new JPanel();
    public JLabel spendtext = new JLabel("花费");
    public JTextField spend = new JTextField();
    public JLabel catetext = new JLabel("分类");
    public String[] box_content = {};
    public JComboBox cate = new JComboBox(box_content);
    public JLabel notetext = new JLabel("备注");
    public JTextField note = new JTextField();
    public JLabel datetext = new JLabel("日期");
    public JButton get = new JButton("记一笔");

    private NotePanel(){
//        设置各个框架的大小
        notepanel.setBounds(150,0,650,800);
        notepanel.setLayout(new BorderLayout());

        northofpanel.setPreferredSize(new Dimension(650,700));
        northofpanel.setLayout(new BorderLayout());
        southofpanel.setPreferredSize(new Dimension(650,100));

        southofpanel.add(get);
        get.addActionListener(new NoteListener());

        northofpanel_left.setLayout(new GridLayout(4,1));
        northofpanel_left.setPreferredSize(new Dimension(150,700));
        northofpanel_left.add(spendtext);
        northofpanel_left.add(catetext);
        northofpanel_left.add(notetext);
        northofpanel_left.add(datetext);

        northofpanel_rigth.setLayout(new GridLayout(4,1));
        northofpanel_rigth.setPreferredSize(new Dimension(500,700));
        northofpanel_rigth.add(spend);
        northofpanel_rigth.add(cate);
        northofpanel_rigth.add(note);

        northofpanel.add(northofpanel_left,BorderLayout.WEST);
        northofpanel.add(northofpanel_rigth,BorderLayout.EAST);

        notepanel.add(northofpanel,BorderLayout.NORTH);
        notepanel.add(southofpanel,BorderLayout.CENTER);
    }
    private  static  NotePanel instance = new NotePanel();
    public static NotePanel getInstance(){
        return instance;
    }

}
