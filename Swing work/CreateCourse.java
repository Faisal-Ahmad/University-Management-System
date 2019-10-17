import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;

class CreateCourse
{
	public CreateCourse()
	{
	JFrame frame=new JFrame("American International University");
	
    JLabel l1 = new JLabel("Name : ");
	l1.setBounds(10,30,150,20);
	frame.add(l1);
	
	JTextField name=new JTextField();
	name.setBounds(200,30,200,20);
	frame.add(name);
	
	 JLabel l2 = new JLabel("ID : ");
	l2.setBounds(10,90,150,20);
	frame.add(l2);
	
	JTextField email=new JTextField();
	email.setBounds(200,90,200,20);
	frame.add(email);
	
	JLabel l3 = new JLabel("Department :");
	l3.setBounds(10,150,150,20);
	frame.add(l3);
	
	
	String [] s1 = {"Science &Information Tecnology","Business Administrator","Engineering","Art & Social Science"};
	JComboBox <String>jc1 = new JComboBox <> (s1);
	jc1.setEditable(true);
	jc1.setBounds(200,150,220,20);
	frame.add(jc1);
	
	JLabel l4 = new JLabel("Course Type :");
	l4.setBounds(10,210,150,20);
	frame.add(l4);
	
	
	String [] s2 = {"  Theory  ","  CS_Theory  ","  Lab  "};
	JComboBox <String>jc2 = new JComboBox <> (s2);
	jc2.setEditable(true);
	jc2.setBounds(200,210,220,20);
	frame.add(jc2);
	
	JButton confirm=new JButton("Confirm");
	confirm.setBounds(100,300,120,70);
	frame.add(confirm);
	confirm.addActionListener(e -> {
		frame.setVisible(false);
		new AdminPanel();
	});
	
	JButton cancel=new JButton("Cancel");
	cancel.setBounds(270,300,100,70);
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
		new CreateCourse();
	}
}