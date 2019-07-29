package gui.panel;

import DAO.CateDAO;
import entity.Category;
import gui.listener.NoteListener;
import gui.model.CateBox_Model;
import org.jdesktop.swingx.JXDatePicker;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class NotePanel {
    public JPanel notepanel = new JPanel();
    public JPanel northofpanel = new JPanel();
    public JPanel southofpanel = new JPanel();
    public JPanel northofpanel_left = new JPanel();
    public JPanel northofpanel_rigth = new JPanel();
    public JLabel spendtext = new JLabel("花费");
    public JTextField spend = new JTextField();
    public JLabel catetext = new JLabel("分类");
    public CateBox_Model box = CateBox_Model.getInstance();
    public JComboBox<Category> cate = new JComboBox<>(box);
    public JLabel notetext = new JLabel("备注");
    public JTextField note = new JTextField();
    public JLabel datetext = new JLabel("日期");
    public JButton get = new JButton("记一笔");
    public JXDatePicker datePicker = new JXDatePicker(new Date());

    private NotePanel(){
//        设置各个框架的大小
        notepanel.setBounds(150,0,650,800);
        notepanel.setLayout(new BorderLayout());

        northofpanel.setPreferredSize(new Dimension(650,700));
        northofpanel.setLayout(new BorderLayout());
        southofpanel.setPreferredSize(new Dimension(650,100));

        southofpanel.add(get);

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
        northofpanel_rigth.add(datePicker);

        northofpanel.add(northofpanel_left,BorderLayout.WEST);
        northofpanel.add(northofpanel_rigth,BorderLayout.EAST);

        notepanel.add(northofpanel,BorderLayout.NORTH);
        notepanel.add(southofpanel,BorderLayout.CENTER);
        addListener();
    }
    private  static  NotePanel instance = new NotePanel();
    public static NotePanel getInstance(){
        return instance;
    }
    public void addListener(){
        NoteListener listener = new NoteListener();
        get.addActionListener(listener);
    }
    public Category getSelectedCategory(){
        return (Category) cate.getSelectedItem();
    }
    public void update(){
        box.list = CateDAO.search_all();
        cate.updateUI();
    }
}
