package service;

import DAO.CateDAO;
import entity.Category;
import gui.model.CateModel;
import gui.panel.CategoryPanel;

public class Cate {
    public static void add(){
        CategoryPanel categoryPanel = CategoryPanel.getInstance();
        Category category = new Category();
        category.name = categoryPanel.jtf.getText();
        CateDAO.add(category);
    }

    public static void delete(int row){
        CategoryPanel categoryPanel = CategoryPanel.getInstance();
        CateModel cateModel = CateModel.getInstance();
        Category category = cateModel.list.get(row);
        CateDAO.delete(category);
    }

    public static void edit(int row){
        Category category = new Category();
        CategoryPanel categoryPanel = CategoryPanel.getInstance();
    }
}
