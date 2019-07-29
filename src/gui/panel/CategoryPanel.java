package gui.panel;

import entity.Category;
import gui.listener.CateListener;
import gui.model.CateModel;

import javax.swing.*;
import java.awt.*;

public class CategoryPanel extends JTable{
    public JPanel categorypanel = new JPanel();
    public JPanel panel_down = new JPanel();
    public JPanel panel_up = new JPanel();
    public JTextField jtf = new JTextField("输入分类名");
    public CateModel cateModel = CateModel.getInstance();
    public JTable table = new JTable(cateModel);
    public JScrollPane scrollPane = new JScrollPane(table);
    public JButton button_add = new JButton("添加");
    public JButton button_edit = new JButton("编辑");
    public JButton button_delete = new JButton("删除");

    private CategoryPanel(){
        categorypanel.setLayout(new BorderLayout());
        categorypanel.setPreferredSize(new Dimension(650,800));

        categorypanel.add(panel_down,BorderLayout.SOUTH);
        categorypanel.add(panel_up,BorderLayout.CENTER);

        panel_down.setPreferredSize(new Dimension(650,100));
        panel_down.setLayout(new GridLayout(1,3));
        panel_down.add(button_add);
        panel_down.add(button_delete);
        panel_down.add(button_edit);

        panel_up.setPreferredSize(new Dimension(650,700));
        panel_up.setLayout(new BorderLayout());
        panel_up.add(scrollPane,BorderLayout.CENTER);
        panel_up.add(jtf,BorderLayout.SOUTH);
        addListener();
    }

    private static CategoryPanel instance = new CategoryPanel();
    public static CategoryPanel getInstance(){return instance;}
    public void addListener(){
        CateListener listener = new CateListener();
        button_add.addActionListener(listener);
        button_delete.addActionListener(listener);
        button_edit.addActionListener(listener);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800,800);
        CategoryPanel categoryPanel = CategoryPanel.getInstance();
        frame.add(categoryPanel.categorypanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
