package gui.model;

import DAO.CateDAO;
import entity.Category;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class CateModel extends AbstractTableModel {
    public String[] name = {"id","name"};
    public ArrayList<Category> list = CateDAO.search_all();
    private CateModel(){}
    private static CateModel instance = new CateModel();

    public static CateModel getInstance(){return instance;}
    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Category category = list.get(rowIndex);
        if(columnIndex == 0){
            return category.id;
        }
        if(columnIndex == 1){
            return category.name;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public Category get(int rowIndex){
        Category category = list.get(rowIndex);
        return category;
    }
}
