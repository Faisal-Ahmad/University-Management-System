import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;

class AddTeacher
{
	public AddTeacher()
	{
		JFrame frame=new JFrame("American International University");
	
	JLabel l7 = new JLabel("Select Samester :");
	l7.setBounds(10,10,80,20);
	frame.add(l7);
	
	
	String [] s3 = {"Samester Name "};
	JComboBox <String>jc3 = new JComboBox <> (s3);
	jc3.setEditable(true);
	jc3.setBounds(200,10,220,20);
	frame.add(jc3);
	
	
    JLabel l1 = new JLabel("Day : ");
	l1.setBounds(10,40,150,20);
	frame.add(l1);
	
	JRadioButton day1= new JRadioButton("Sunday");
	day1.setBounds(60,40,70,20);
	frame.add(day1);
	
	JRadioButton day2= new JRadioButton("Monday");
	day2.setBounds(140,40,70,20);
	frame.add(day2);
	
	JRadioButton day3= new JRadioButton("Tuesday");
	day3.setBounds(220,40,80,20);
	frame.add(day3);
	
	JRadioButton day4= new JRadioButton("Wednesday");
	day4.setBounds(310,40,120,20);
	frame.add(day4);
	
	 JLabel l2 = new JLabel("Course Name : ");
	l2.setBounds(10,80,150,20);
	frame.add(l2);
	
	/*for(int i=0;i<totalcourse;i++)
	{
		String courses [] = Course[i].courseName;
	}
	JComboBox <String>jc1 = new JComboBox <> (courses);
	*/
	String [] s1 ={"Course Name"};
	JComboBox <String>jc1 = new JComboBox <> (s1);
	jc1.setEditable(true);
	jc1.setBounds(200,80,150,20);
	frame.add(jc1);
	
	JLabel l8 = new JLabel("Section : ");
	l8.setBounds(10,130,150,20);
	frame.add(l8);
	
	/*for(int i=0;i<totalcourse;i++)
	{
		String courses [] = Course[i].courseName;
	}
	JComboBox <String>jc1 = new JComboBox <> (courses);
	*/
	String [] s4 ={"Section Name :"};
	JComboBox <String>jc4 = new JComboBox <> (s4);
	jc4.setEditable(true);
	jc4.setBounds(200,130,150,20);
	frame.add(jc4);
	
    //if action then it will store course name to a string like (coursedata)
	
	JLabel l3 = new JLabel("Teacher :");
	l3.setBounds(10,180,150,20);
	frame.add(l3);
	//frome above coursedate array will find that department teacher name
	/*for(int j=0;j<totalteacher;j++)
	{
		if(teacher[i].department== coursedate.department)
		{
			String teachers [] = teachername;
		}
	}
	JComboBox <String>teacher = new JComboBox <> (teachers);
	*/
	String [] s2 ={"Teacher name"};
	JComboBox <String>jc2 = new JComboBox <> (s2);
	jc2.setEditable(true);
	jc2.setBounds(200,180,200,20);
	frame.add(jc2);
	
	JLabel l4 = new JLabel("Start Time :");
	l4.setBounds(10,220,150,20);
	frame.add(l4);
	
	
	JTextField time=new JTextField();
	time.setBounds(200,220,200,20);
	frame.add(time);
	
	JLabel l5 = new JLabel("Student Capacity:");
	l5.setBounds(10,270,150,20);
	frame.add(l5);
	
	
	JTextField capacity=new JTextField();
	capacity.setBounds(200,270,200,20);
	frame.add(capacity);
	
	JLabel l6 = new JLabel("Room Number :");
	l6.setBounds(10,320,150,20);
	frame.add(l6);
	
	
	JTextField room=new JTextField();
	room.setBounds(200,320,200,20);
	frame.add(room);
	
	JButton confirm=new JButton("Confirm");
	confirm.setBounds(100,370,120,70);
	frame.add(confirm);
	confirm.addActionListener(e -> {
		frame.setVisible(false);
		new AdminPanel();
	});
	
	JButton cancel=new JButton("Cancel");
	cancel.setBounds(270,370,100,70);
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
		new AddTeacher();
	}
}