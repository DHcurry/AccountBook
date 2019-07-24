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

    public void add(int cid, float amount, String note, Date date){
        Connection connection = DBUtil.getConnection();
        String sql = "INSERT INTO account (cid,amount,note,use_date) VALUES(?,?,?,?)";
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1, cid);
            ps.setFloat(2, amount);
            ps.setString(3, note);
            ps.setDate(4, date);
            ps.execute();
        }catch (SQLException e ){
            e.printStackTrace();
        }
    }

    public void delete(){

    }

    public void update(int id,int cid, float amount, String note, Date date){

    }

    public ArrayList<Account> search_all(){
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


//    public float search_Today(){
//        Connection connection = DBUtil.getConnection();
//        String sql = "SELECT amount FROM account WHERE use_date=";
//        try(PreparedStatement s = connection.prepareStatement(sql);){
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
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
