import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
	
class TeacherPanel
{
	public TeacherPanel()
	{
		JFrame frame=new JFrame("American International University");
	
	JMenuBar jb=new JMenuBar();
	JMenu jm =new JMenu("Change Password");
	jb.add(jm);
	frame.setJMenuBar(jb);
    	
	JLabel l1 = new JLabel("Make Notice:");
	l1.setBounds(10,10,100,20);
	frame.add(l1);
	
	JTextArea notice = new JTextArea(5,3);
	notice.setBounds(150,10,250,100);
    notice.setEditable(true);
	JScrollPane scrollPane = new JScrollPane(notice);
	frame.add(notice);
	frame.add(scrollPane);
	
	JLabel l2 = new JLabel("Today :");
	l2.setBounds(420,10,50,20);
	frame.add(l2);
		
	JTextField nowdate=new JTextField();
	nowdate.setBounds(420,40,100,20);
	frame.add(nowdate);
	
	LocalDate date = LocalDate.now();  
    String today = date.toString();	
	nowdate.setText(today);
	nowdate.setEditable(false);
		
	/*JLabel l4 = new JLabel("Time :");
	l4.setBounds(420,80,50,20);
	frame.add(l4);
		
	JTextField time=new JTextField();
	time.setBounds(420,110,100,20);
	frame.add(time);
	
	    Calendar cal =Calendar.getInstance();
		SimpleDateFormat sdf =new SimpleDateFormat("hh:mm a");
	    String timenow = sdf.format(cal.getTime());
		time.setText(timenow); */
	
	//message send with Current date
	JButton send=new JButton("Send");
	send.setBounds(170,130,70,30);
	frame.add(send);
	send.addActionListener(e -> {
		notice.setEditable(false);
	} );
	
	JButton edit=new JButton("Edit");
	edit.setBounds(280,130,70,30);
	frame.add(edit);
	edit.addActionListener(e -> {
		notice.setEditable(true);
	} );
	
	JLabel l3 = new JLabel("Send Current Status: ");
	l3.setBounds(10,170,150,20);
	frame.add(l3);
	
	ButtonGroup bg = new ButtonGroup();
	//frame.add(bg);
	
	JRadioButton s1= new JRadioButton("Available");
	s1.setBounds(180,170,80,20);
	frame.add(s1);
	bg.add(s1);
	
	JRadioButton s2= new JRadioButton("Not Available");
	s2.setBounds(280,170,110,20);
	frame.add(s2);
	bg.add(s2);
	
	JRadioButton s3= new JRadioButton("Busy");
	s3.setBounds(385,170,80,20);
	frame.add(s3);
	bg.add(s3);
	
	JRadioButton s4= new JRadioButton("Meeting");
	s4.setBounds(180,210,80,20);
	frame.add(s4);
	bg.add(s4);
	
	JRadioButton s5= new JRadioButton("Break");
	s5.setBounds(260,210,80,20);
	frame.add(s5);
	bg.add(s5);
	
	JButton st=new JButton("Set Consulting");
	st.setBounds(210,250,150,40);
	frame.add(st);
	st.addActionListener(e -> {
		frame.setVisible(false);
		new CreateConsulting();
	});
	
	JButton cs=new JButton("show TSF");
	cs.setBounds(210,300,150,40);
	frame.add(cs);
	
	JButton logout=new JButton("Log Out");
	logout.setBounds(200,360,170,50);
	frame.add(logout);
	logout.addActionListener(e -> {
		frame.setVisible(false);
		new Login();
	});
	
	frame.setSize(600,500);
	frame.setLayout(null);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		new TeacherPanel();
	}
}