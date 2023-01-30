package com.cff.view;

import javax.swing.*;
import java.awt.*;

public abstract class InventoryApp extends JFrame {


    public void start() {
        setMinimumSize(new Dimension(600, 0));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

