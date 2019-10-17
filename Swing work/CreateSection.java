import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;

class CreateSection
{
	public CreateSection()
	{
		JFrame frame=new JFrame("American International University");
	
   JLabel l1 = new JLabel("Department :");
	l1.setBounds(10,40,80,20);
	frame.add(l1);
	
	
	String [] s1 = {"Science &Information Tecnology","Business Administrator","Engineering","Art & Social Science"};
	JComboBox <String>jc1 = new JComboBox <> (s1);
	jc1.setEditable(true);
	jc1.setBounds(200,40,220,20);
	frame.add(jc1);
	
	JLabel l2 = new JLabel("Course Name : ");
	l2.setBounds(10,100,150,20);
	frame.add(l2);
	
	/*for(int i=0;i<totalcourse;i++)
	{
		String courses [] = Course[i].courseName;
	}
	JComboBox <String>jc1 = new JComboBox <> (courses);
	*/
	String [] s2 ={"Course Name"};
	JComboBox <String>jc2 = new JComboBox <> (s2);
	jc2.setEditable(true);
	jc2.setBounds(200,100,150,20);
	frame.add(jc2);
	
	JLabel l3 = new JLabel("Section Name:");
	l3.setBounds(10,160,150,20);
	frame.add(l3);
	
	
	JTextField name=new JTextField();
	name.setBounds(200,160,200,20);
	frame.add(name);
	
	JButton confirm=new JButton("Confirm");
	confirm.setBounds(100,250,120,70);
	frame.add(confirm);
	confirm.addActionListener(e -> {
		frame.setVisible(false);
		new AdminPanel();
	});
	
	JButton cancel=new JButton("Cancel");
	cancel.setBounds(270,250,100,70);
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
		new CreateSection();
	}
}