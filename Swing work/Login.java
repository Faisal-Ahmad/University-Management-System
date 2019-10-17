import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

class Login
{
    public Login()
    {
        JFrame j=new JFrame("American International University");
        j.setContentPane(new JLabel(new ImageIcon("picture.jpg")));
        JLabel lf=new JLabel("Welcome To Our University System");
        lf.setBounds(20,20,500,50);
        lf.setForeground(Color.red);
        lf.setFont(new Font("Times new Rooman",Font.PLAIN,30));
        lf.setHorizontalAlignment(SwingConstants.CENTER);



        JLabel l1=new JLabel("UserName :");
        l1.setBounds(20,110,200,20);
        l1.setForeground(Color.white);
        j.add(l1);

        final JTextField text =new JTextField();
        text.setBounds(150,110,200,20);
        j.add(text);



        JLabel l2=new JLabel("Password :");
        l2.setBounds(20,170,100,20);
        l2.setForeground(Color.white);
        j.add(l2);


        final JPasswordField passwd = new JPasswordField();
        passwd.setBounds(150,170,200,20);
        j.add(passwd);

        JCheckBox jc =new JCheckBox("Remember Me");
        jc.setBounds(150,210,200,20);
        j.add(jc);

        JButton login=new JButton("Log In");
        login.setBounds(140,260,100,50);
        j.add(login);
        login.addActionListener(e->
        {
            j.setVisible(false);
            new AdminPanel();

        });

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(280,260,100,50);
        j.add(cancel);
        cancel.addActionListener(e -> System.exit(0));

        j.setSize(600,600);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
    public static void main(String[] args)
    {
        new Login();
    }

}