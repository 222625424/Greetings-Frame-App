/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author hp
 */
public class GreetingsGUI extends JFrame{
    
    private JPanel headingPanel;
    private JPanel namePanel;
    private JPanel surnamePanel;
    private JPanel greetingPanel;
    private JPanel buttonPanel;
    private JPanel collectivePanel;
    private JPanel mainPanel;
    
    private JLabel headingLabel;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    
    
    private JTextField nameTxf;
    private JTextField surnameTxf;
    
    private JTextArea greetingArea;
    
    private JButton greetButton;
    private JButton clearButton;
    private JButton exitButton;
    

    public GreetingsGUI(){
        
        setTitle("Greeting UI");
        setSize(700, 750);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.yellow);
        
        
        headingPanel = new JPanel(new FlowLayout( FlowLayout.CENTER));
        headingPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        namePanel = new JPanel(new FlowLayout());
        surnamePanel = new JPanel(new FlowLayout());
        
        greetingPanel = new JPanel(new FlowLayout());
        greetingPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Greetings"));
        
        buttonPanel = new JPanel(new FlowLayout());
        
        collectivePanel = new JPanel(new GridLayout(2,1));
        
        mainPanel = new JPanel(new BorderLayout());
        
        // create Labels
        headingLabel = new JLabel("Greetings App");
        nameLabel = new JLabel("Name: ");
        surnameLabel = new JLabel("Surname: ");
        
        // create a TextField
        
        nameTxf = new JTextField(20);
        surnameTxf = new JTextField(20);
        
        // create a TextArea
        
        greetingArea = new JTextArea(20,50);
        greetingArea.setEditable(false);
        greetingArea.setText("hello {Name} {Surname}");
        
        // create the Butons
        greetButton = new JButton("Greet");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");
        
        // add Panels 
        headingPanel.add(headingLabel);
        
        namePanel.add(nameLabel);
        namePanel.add(nameTxf);
        
        surnamePanel.add(surnameLabel);
        surnamePanel.add(surnameTxf);
        
        collectivePanel.add(namePanel);
        collectivePanel.add(surnamePanel);
        
        greetingPanel.add(greetingArea);
        
        buttonPanel.add(greetButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(exitButton);
        
        
        mainPanel.add(collectivePanel, BorderLayout.NORTH);
        mainPanel.add(greetingPanel,BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        add(headingPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
        
        
        
        
        
        
        pack();
        setVisible(true);
        
        
    }
    
    
    
}
