package startup;

import gui.frame.MainFrame;

import javax.swing.*;

public class Bootstrap {
    public static void main(String[] args) {
        MainFrame mf = MainFrame.getInstance();
        mf.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.frame.setVisible(true);
    }
}
