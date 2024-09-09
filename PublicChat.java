import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.Timestamp;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PublicChat extends JFrame{
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public PublicChat(){
        initComponent();
    }

    public JTextArea getTextArea(){
        return textArea;
    }

    private void initComponent() {
        setSize(400,400);
        setDefaultCloseOperation(2);
        setTitle("IEEE 2023 Official Group");
        setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("./assets/group.png");
        setIconImage(icon.getImage());

        // Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());

        textArea = new JTextArea();
        textArea.setFont(new Font("",1,20));
        textArea.setFocusable(false);
        textArea.setForeground(Color.WHITE);
        textArea.setBackground(Color.GRAY);
        // textArea.setText(currentTimestamp.toString()+"\n");
        
        scrollPane = new JScrollPane(textArea);
        add(scrollPane,BorderLayout.CENTER);
    }
    
}