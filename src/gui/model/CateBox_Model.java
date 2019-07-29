package gui.model;

import DAO.CateDAO;
import entity.Category;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class CateBox_Model implements ComboBoxModel<Category> {
    public ArrayList<Category> list = CateDAO.search_all();
    public Category category;
    private CateBox_Model(){
        category = list.get(0);
    }
    private static CateBox_Model instance = new CateBox_Model();
    public static CateBox_Model getInstance(){
        return instance;
    }
    @Override
    public void setSelectedItem(Object anItem) {category = (Category)anItem;}

    @Override
    public Object getSelectedItem() {
        if(!list.isEmpty()){
            return category;
        }
        return null;
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public Category getElementAt(int index) {
        return list.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }
    @Override
    public void removeListDataListener(ListDataListener l) {

    }

}
