import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;

class StudentPanel
{
	public StudentPanel()
	{
	JFrame frame=new JFrame("American International University");
	
	JMenuBar jb=new JMenuBar();
	JMenu jm =new JMenu("Change Password");
	jb.add(jm);
	frame.setJMenuBar(jb);
	
	JLabel l1 = new JLabel("Select Department :");
	l1.setBounds(10,30,150,20);
	frame.add(l1);
	
	String [] s1 = {"Science &Information Tecnology","Business Administrator","Engineering","Art & Social Science"};
	JComboBox <String>jc = new JComboBox <> (s1);
	jc.setEditable(true);
	jc.setBounds(220,30,220,20);
	frame.add(jc);
	
	 JLabel l2 = new JLabel("Select Teacher Name :");
	l2.setBounds(10,80,150,20);
	frame.add(l2);
	/*String tname for selected depatment all teacher name will sore here
	for(int i=0;i<totalcourse;i++)
	{
		if(selected department == department)
		{
			string tname [] = teachername;
		}
		
	}*/
	String [] s2 = {"Teacher Name"};
	JComboBox <String>jc2 = new JComboBox <> (s2);
	jc2.setEditable(true);
	jc2.setBounds(220,80,220,20);
	frame.add(jc2);
	
	 JButton show=new JButton("Show TSF");
	show.setBounds(180,130,150,40);
	frame.add(show);
	
	JButton info=new JButton("Teacher Info.");
	info.setBounds(180,200,150,40);
	frame.add(info);
	
	JButton status=new JButton("Current Status");
	status.setBounds(180,270,150,40);
	frame.add(status);
	
	JButton logout=new JButton("Log Out");
	logout.setBounds(170,340,170,50);
	frame.add(logout);
	logout.addActionListener(e->{
    frame.setVisible(false);
		new Login();
	});
	
	frame.setSize(500,500);
	frame.setLayout(null);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String []args)
	{
		new StudentPanel();
	}
	
}