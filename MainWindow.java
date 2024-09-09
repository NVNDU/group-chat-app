import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;

public class MainWindow extends JFrame{
    private JTextField textField;
    private JButton joinBtn;
    private JPanel topPanel,centerPanel,bottomPanel;
    private JLabel label;
    private PublicChat publicChat;

    public MainWindow(PublicChat publicChat){
        this.publicChat = publicChat;
        initComponent();
    }

    private void initComponent() {
        setSize(300,200);
        setTitle("ChatApp 1.0");
        setDefaultCloseOperation(2);
        setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("./assets/chat_9838062.png");
        setIconImage(icon.getImage());

        label = new JLabel("Enter ur name :");
        label.setFont(new Font("",1,20));
        add(label,BorderLayout.PAGE_START);
        topPanel = new JPanel();
        topPanel.add(label);
        add(topPanel,BorderLayout.PAGE_START);

        textField = new JTextField(15);
        textField.setLayout(new FlowLayout());
        textField.setFont(new FontUIResource("",1,20));

        centerPanel = new JPanel();
        centerPanel.add(textField);
        add(centerPanel,BorderLayout.CENTER);

        joinBtn = new JButton("JOIN");
        joinBtn.setFont(new Font("",1,20));
        
        bottomPanel = new JPanel();
        bottomPanel.add(joinBtn);
        add(bottomPanel,BorderLayout.PAGE_END);

        textField.addActionListener((e)->{
            joinBtn.doClick();
        });

        joinBtn.addActionListener((e)->{
            String chatName = textField.getText();
            new ChatRoom(chatName,publicChat);

            textField.setText("");
        });

        setVisible(true);
    }
}