package com.company;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;


public class GUI extends JFrame {
    public GUI(Application application) {
        super("Complex event demo");
        this.application = application;
        setSize(400, 300);

        menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener((ActionEvent e) ->
                System.exit(0));
        fileMenu.add(quitItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Combo box

        String[] choices = {"First", "Second", "Third"};
        comboBox = new JComboBox<>(choices);
        comboBox.addActionListener((ActionEvent e) ->
                System.out.println(comboBox.getSelectedItem())
        );
        add(comboBox, BorderLayout.CENTER);


        setVisible(true);
    }


    private Application application;
    private JMenuBar menuBar;
    private JComboBox<String> comboBox;

}
