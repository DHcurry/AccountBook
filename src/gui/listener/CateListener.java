package gui.listener;

import DAO.CateDAO;
import gui.frame.MainFrame;
import gui.model.CateModel;
import gui.panel.CategoryPanel;
import service.Cate;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CateListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        MainFrame mf = MainFrame.getInstance();
        CategoryPanel categoryPanel = CategoryPanel.getInstance();
        CateModel cateModel = CateModel.getInstance();
        JButton b = (JButton)e.getSource();
        int table_row;
        table_row = categoryPanel.table.getSelectedRow();
        
        if(b == categoryPanel.button_add){
            Cate.add();
            cateModel.list = CateDAO.search_all();
            categoryPanel.table.validate();
            categoryPanel.table.updateUI();
        }
        if(b == categoryPanel.button_delete){
            Cate.delete(table_row);
            cateModel.list = CateDAO.search_all();
            categoryPanel.table.validate();
            categoryPanel.table.updateUI();
        }
    }
}
