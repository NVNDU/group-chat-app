import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatRoom extends JFrame{
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JPanel panel;
    private JTextField textField;
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
       
       ImageIcon icon = new ImageIcon("./assets/user.png");
       setIconImage(icon.getImage());

       textArea = new JTextArea();
       textArea.setFont(new Font("",1,20));
       textArea.setFocusable(false);

       scrollPane = new JScrollPane(textArea);
       add(scrollPane,BorderLayout.CENTER);

       textField = new  JTextField(20);
       textField.setFont(new Font("",1,20));

       panel = new JPanel();
       panel.add(textField);
       add(panel,BorderLayout.PAGE_END);

       textField.addActionListener((e)->{
        String msg = textField.getText();

        textArea.append("Me: "+msg+"\n");
        publicChat.getTextArea().append(chatName+": " + msg+"\n");
        publicChat.setVisible(true);

        textField.setText("");
       });

       setVisible(true);
    }
    
}
