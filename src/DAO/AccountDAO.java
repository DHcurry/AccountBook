package DAO;

import entity.Account;
import util.DBUtil;
import util.GuiUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class AccountDAO {
    public int getTotal(){
        Connection connection = DBUtil.getConnection();
        int count = 0;
        String sql = "SELECT count(*) FROM account";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            count = rs.getInt(1);
        }catch (SQLException e ){
            e.printStackTrace();
        }
        return count;
    }

    public static void add(Account account){
        Connection connection = DBUtil.getConnection();
        String sql = "INSERT INTO account (cid,amount,note,use_date) VALUES(?,?,?,?)";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1, account.cid);
            ps.setFloat(2, account.amount);
            ps.setString(3, account.note);
            ps.setDate(4, account.date);
            ps.execute();
        }catch (SQLException e ){
            e.printStackTrace();
        }
    }

    public static void delete(Account account){
        Connection connection = DBUtil.getConnection();
        String sql = "REMOVE FROM account WHERE id=?";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1, account.id);
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void update(Account account){
        Connection connection = DBUtil.getConnection();
        String sql = "UPDATE account SET ";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1, account.id);
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Account> search_all(){
        Connection connection = DBUtil.getConnection();
        String sql = "SELECT * FROM account";
        ResultSet rs = null;
        ArrayList<Account> list = new ArrayList<>();
        try(Statement s = connection.createStatement();){
            rs = s.executeQuery(sql);
            while(rs.next()){
                Account temp = new Account();
                temp.id = rs.getInt(1);
                temp.cid = rs.getInt(2);
                temp.amount = rs.getFloat(3);
                temp.note = rs.getString(4);
                temp.date = rs.getDate(5);
                list.add(temp);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return  list;
    }
    public int search_day(){
        Connection connection = DBUtil.getConnection();
        String sql =
    }
    public static void main(String[] args) {
//        Account account = new Account(1,1,100,"吃饭",Date.valueOf("2019-07-20"));
        AccountDAO accountDAO = new AccountDAO();
//        accountDAO.add(account.cid,account.amount,account.note,account.date);
        ArrayList<Account> l = new ArrayList<>();
        l = accountDAO.search_all();
        for(Account temp: l){
            System.out.println(temp.id+" "+temp.amount+temp.note);
        }
    }
}
