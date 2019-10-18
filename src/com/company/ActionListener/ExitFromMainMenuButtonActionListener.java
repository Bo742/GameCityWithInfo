package com.company.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitFromMainMenuButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(1);
    }
}
