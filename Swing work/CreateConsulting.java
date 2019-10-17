import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;

class CreateConsulting
{
	public CreateConsulting()
	{
		JFrame frame=new JFrame("American International University");
	
    JLabel l1 = new JLabel("Day : ");
	l1.setBounds(10,30,150,20);
	frame.add(l1);
	
	JRadioButton day1= new JRadioButton("Sunday");
	day1.setBounds(100,30,70,20);
	frame.add(day1);
	
	JRadioButton day2= new JRadioButton("Monday");
	day2.setBounds(200,30,70,20);
	frame.add(day2);
	
	JRadioButton day3= new JRadioButton("Tuesday");
	day3.setBounds(300,30,80,20);
	frame.add(day3);
	
	JRadioButton day4= new JRadioButton("Wednesday");
	day4.setBounds(100,60,120,20);
	frame.add(day4);
	
	JRadioButton day5= new JRadioButton("Thusday");
	day5.setBounds(250,60,80,20);
	frame.add(day5);
	
	 JLabel l2 = new JLabel("Consulting Start : ");
	l2.setBounds(10,140,150,20);
	frame.add(l2);
	
	JTextField time=new JTextField();
	time.setBounds(200,140,200,20);
	frame.add(time);
	
	JLabel l3 = new JLabel("Consulting Duration :");
	l3.setBounds(10,200,150,20);
	frame.add(l3);
	
	JTextField duration=new JTextField();
	duration.setBounds(200,200,200,20);
	frame.add(duration);
	
	JButton confirm=new JButton("Confirm");
	confirm.setBounds(100,280,120,70);
	frame.add(confirm);
	confirm.addActionListener(e -> {
		frame.setVisible(false);
		new TeacherPanel();
	});
	
	JButton cancel=new JButton("Cancel");
	cancel.setBounds(270,280,100,70);
	frame.add(cancel);
	cancel.addActionListener(e -> {
		frame.setVisible(false);
		new TeacherPanel();
	});
	
	
	frame.setSize(500,500);
	frame.setLayout(null);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		new CreateConsulting();
	}
}