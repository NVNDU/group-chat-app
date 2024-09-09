import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatRoom extends JFrame{
    JTextArea textArea;
    JScrollPane scrollPane;
    JPanel panel1, panel2;
    JTextField textField;
    private String chatName;
    private PublicChat publicChat;

    public ChatRoom(String chatName,PublicChat publicChat){
        this.publicChat = publicChat;
        this.chatName = chatName;
        chatRoomComponent();
    }

    private void chatRoomComponent() {
       setSize(400,400);
       setDefaultCloseOperation(2);
       setTitle(chatName+"'s phone");
       setLocationRelativeTo(null);

       textArea = new JTextArea();
       textArea.setFont(new Font("",1,20));

       scrollPane = new JScrollPane(textArea);
       add(scrollPane,BorderLayout.CENTER);

       textField = new  JTextField(20);
       textField.setFont(new Font("",1,20));

       panel2 = new JPanel();
       panel2.add(textField);
       add(panel2,BorderLayout.PAGE_END);

       textField.addActionListener((e)->{
        String msg = textField.getText();
        textArea.append("Me: "+msg+"\n");
        publicChat.setVisible(true);
        publicChat.textArea.append(chatName+": " + msg+"\n");
        textField.setText("");
       });

       setVisible(true);
    }
    
}
