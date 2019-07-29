package gui.listener;

import gui.frame.MainFrame;
import gui.panel.CategoryPanel;
import gui.panel.MainPanel;
import gui.panel.NotePanel;
import gui.panel.SpendPanel;
import util.GuiUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        MainPanel mp = MainPanel.getInstance();
        MainFrame mf = MainFrame.getInstance();
        Component[] components = mf.workplace.getComponents();
        for(Component c: components){
            mf.workplace.remove(c);
        }
        JButton b = (JButton)e.getSource();
        if(b == mp.spend){
            mf.workplace.add(SpendPanel.getInstance().spendpanel,BorderLayout.EAST);
            mf.workplace.updateUI();

        }
        if(b == mp.note){
            mf.workplace.add(NotePanel.getInstance().notepanel,BorderLayout.EAST);
            NotePanel notePanel = NotePanel.getInstance();
            notePanel.update();
            mf.workplace.updateUI();
        }

        if(b == mp.cate){
            mf.workplace.add(CategoryPanel.getInstance().categorypanel,BorderLayout.EAST);
            mf.workplace.updateUI();
        }
    }
}
