import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PublicChat extends JFrame{
    JTextArea textArea;
    JScrollPane scrollPane;

    public PublicChat(){
        initComponent();
    }

    private void initComponent() {
        setSize(400,400);
        setDefaultCloseOperation(2);
        setTitle("IEEE 2023 Official Group");
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setFont(new Font("",1,20));
        
        textArea.setBackground(Color.GRAY);
        
        scrollPane = new JScrollPane(textArea);
        add(scrollPane,BorderLayout.CENTER);

        // setVisible(true);
    }
    
}