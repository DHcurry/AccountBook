package entity;

import java.sql.Date;

public class Account {
    public int id;
    public int cid;
    public float amount;
    public String note;
    public Date date;
    public Account(){}

    public Account(int x_id,int x_cid, float x_amount, String x_note, Date x_date){
        id = x_id;
        cid = x_cid;
        amount = x_amount;
        note = x_note;
        date = x_date;
    }
}
