import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

class CreateStudent
{
	public CreateStudent()
	{
		JFrame frame=new JFrame("American International University");
	
    JLabel l1 = new JLabel("Name : ");
	l1.setBounds(10,50,150,20);
	frame.add(l1);
	
	JTextField name=new JTextField();
	name.setBounds(200,50,200,20);
	frame.add(name);
	
	 JLabel l2 = new JLabel("ID : ");
	l2.setBounds(10,120,150,20);
	frame.add(l2);
	
	JTextField Id=new JTextField();
	Id.setBounds(200,120,200,20);
	frame.add(Id);
	
	 JLabel l3 = new JLabel("Department : ");
	l3.setBounds(10,190,150,20);
	frame.add(l3);
	
	String [] s1 = {"Science &Information Tecnology","Business Administrator","Engineering","Art & Social Science"};
	JComboBox <String>jc = new JComboBox <> (s1);
	jc.setEditable(true);
	jc.setBounds(200,190,200,20);
	frame.add(jc);
	
	 JLabel l4 = new JLabel("Password :");
	l4.setBounds(10,260,150,20);
	frame.add(l4);
	
	JTextField passwd=new JTextField();
	passwd.setBounds(200,260,200,20);
	frame.add(passwd);
	
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
		new CreateStudent();
	}
}