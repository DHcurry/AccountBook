package service;

import DAO.AccountDAO;
import entity.Account;
import gui.panel.NotePanel;

import java.sql.Date;

public class Note {
    public static void note(){
        long d = 24*60*60*1000L;
        NotePanel notePanel = NotePanel.getInstance();
        AccountDAO accountDAO = new AccountDAO();
        Account account = new Account();
        account.amount = Integer.valueOf(notePanel.spend.getText());
        account.cid = notePanel.getSelectedCategory().id;
        account.note = notePanel.note.getText();
        account.date = new Date(notePanel.datePicker.getDate().getTime()+d);
        accountDAO.add(account);
    }
}
