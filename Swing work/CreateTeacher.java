import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;

class CreateTeacher
{
	public CreateTeacher()
	{
		JFrame frame=new JFrame("American International University");
	
    JLabel l1 = new JLabel("Name : ");
	l1.setBounds(10,20,150,20);
	frame.add(l1);
	
	JTextField name=new JTextField();
	name.setBounds(200,20,200,20);
	frame.add(name);
	
	 JLabel l2 = new JLabel("ID : ");
	l2.setBounds(10,70,150,20);
	frame.add(l2);
	
	JTextField Id=new JTextField();
	Id.setBounds(200,70,200,20);
	frame.add(Id);
	
	 JLabel l3 = new JLabel("Phone Number : ");
	l3.setBounds(10,120,150,20);
	frame.add(l3);
	
	JTextField phn=new JTextField();
	phn.setBounds(200,120,200,20);
	frame.add(phn);
	
	 JLabel l4 = new JLabel("Email :");
	l4.setBounds(10,170,150,20);
	frame.add(l4);
	
	JTextField email=new JTextField();
	email.setBounds(200,170,200,20);
	frame.add(email);
	
	JLabel l5 = new JLabel("Department :");
	l5.setBounds(10,220,150,20);
	frame.add(l5);
	
	
	String [] s1 = {"Science &Information Tecnology","Business Administrator","Engineering","Art & Social Science"};
	JComboBox <String>jc = new JComboBox <> (s1);
	jc.setEditable(true);
	jc.setBounds(200,220,220,20);
	frame.add(jc);
	
	JLabel l6 = new JLabel("Position :");
	l6.setBounds(10,270,150,20);
	frame.add(l6);
	
	JTextField posi=new JTextField();
	posi.setBounds(200,270,200,20);
	frame.add(posi);
	
	JLabel l7 = new JLabel("Password :");
	l7.setBounds(10,320,150,20);
	frame.add(l7);
	
	JTextField passwd=new JTextField();
	passwd.setBounds(200,320,200,20);
	frame.add(passwd);
	
	JButton confirm=new JButton("Confirm");
	confirm.setBounds(100,380,120,70);
	frame.add(confirm);
	confirm.addActionListener(e -> {
		frame.setVisible(false);
		new AdminPanel();
	});
	
	JButton cancel=new JButton("Cancel");
	cancel.setBounds(270,380,100,70);
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
		new CreateTeacher();
	}
}