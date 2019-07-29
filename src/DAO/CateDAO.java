package DAO;

import entity.Category;
import util.DBUtil;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CateDAO {
    public static void add(Category category){
        Connection connection = DBUtil.getConnection();
        String sql = "INSERT INTO category (name) VALUES(?)";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, category.name);
            ps.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void delete(Category category){
        Connection connection = DBUtil.getConnection();
        String sql = "DELETE FROM category WHERE id=?";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1, category.id);
            ps.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void update(Category category){
        Connection connection = DBUtil.getConnection();
        String sql = "UPDATE category SET name=? WHERE id = ?";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1,category.name);
            ps.setInt(2, category.id);
            ps.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Category> search_all(){
        Connection connection = DBUtil.getConnection();
        ArrayList<Category> list = new ArrayList();
        String sql = "SELECT * FROM category";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Category temp = new Category();
                temp.id = rs.getInt(1);
                temp.name = rs.getString(2);
                list.add(temp);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
}
