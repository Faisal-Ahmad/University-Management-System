import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;

class ChangePassword
{
	public ChangePassword()
	{
		JFrame frame=new JFrame("American International University");
	
    JLabel l1 = new JLabel("Enter Your Id:");
	l1.setBounds(10,50,150,20);
	frame.add(l1);
	
	JTextField id=new JTextField();
	id.setBounds(200,50,200,20);
	frame.add(id);
	
	 JLabel l2 = new JLabel("Enter Old Password:");
	l2.setBounds(10,120,150,20);
	frame.add(l2);
	
	JPasswordField oldpass=new JPasswordField();
	oldpass.setBounds(200,120,200,20);
	frame.add(oldpass);
	
	 JLabel l3 = new JLabel("Enter New Password:");
	l3.setBounds(10,190,150,20);
	frame.add(l3);
	
	JPasswordField passwd1=new JPasswordField();
	passwd1.setBounds(200,190,200,20);
	frame.add(passwd1);
	
	 JLabel l4 = new JLabel("Confirm New Password:");
	l4.setBounds(10,260,150,20);
	frame.add(l4);
	
	JPasswordField passwd2=new JPasswordField();
	passwd2.setBounds(200,260,200,20);
	frame.add(passwd2);
	
	JButton confirm=new JButton("Confirm");
	confirm.setBounds(100,350,120,70);
	frame.add(confirm);
	confirm.addActionListener(e -> {
		frame.setVisible(false);
		new AdminPanel();
	});
	
	JButton cancel=new JButton("Cancel");
	cancel.setBounds(270,350,100,70);
	frame.add(cancel);
	cancel.addActionListener(e -> {
		frame.setVisible(false);
		new AdminPanel();
	});
	
	
	frame.setSize(500,500);
	frame.setLayout(null);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		new ChangePassword();
	}
}