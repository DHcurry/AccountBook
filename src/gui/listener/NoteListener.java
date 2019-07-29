package gui.listener;

import service.Note;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoteListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Note.note();
    }
}
