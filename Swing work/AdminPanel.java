import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;

class AdminPanel
{
	public AdminPanel()
	{
	JFrame frame=new JFrame("American International University");
	
	JMenuBar menubar=new JMenuBar();
	frame.setJMenuBar(menubar);
	
	JMenu menu =new JMenu("Menu");
	menubar.add(menu);
	
	JMenu hlp =new JMenu("Help");
	menubar.add(hlp);
	
	
	JMenuItem pass = new JMenuItem("Change Password");
	menu.add(pass);
	pass.addActionListener(e -> {
		frame.setVisible(false);
		new ChangePassword();
	} );
	
	JMenuItem sami = new JMenuItem("Create Samester");
	menu.add(sami);
	sami.addActionListener(e -> {
		frame.setVisible(false);
		new CreateSamester();
	} );
	
	
	JButton ct=new JButton("Create Teacher");
	ct.setBounds(20,30,170,50);
	frame.add(ct);
	ct.addActionListener(e -> {
		frame.setVisible(false);
		new CreateTeacher();
	} );
	
	JButton st=new JButton("show Teacher");
	st.setBounds(220,30,170,50);
	frame.add(st);
	st.addActionListener(e -> {
		frame.setVisible(false);
		 new ShowTable();
	} );
	
	
	JButton cs=new JButton("Create Student");
	cs.setBounds(20,110,170,50);
	frame.add(cs);
	cs.addActionListener(e -> {
		frame.setVisible(false);
		new CreateStudent();
	} );
	
	JButton ss=new JButton("Show Student");
	ss.setBounds(220,110,170,50);
	frame.add(ss);
	ss.addActionListener(e -> {
		frame.setVisible(false);
		new ShowTable();
	} );
	
	JButton cc=new JButton("Create Courses");
	cc.setBounds(20,190,170,50);
	frame.add(cc);
	cc.addActionListener(e -> {
		frame.setVisible(false);
		new CreateCourse();
	} );
	
	JButton sc=new JButton("Show Courses");
	sc.setBounds(220,190,170,50);
	frame.add(sc);
	sc.addActionListener(e -> {
		frame.setVisible(false);
		new ShowTable();
	} );
	
	JButton cr=new JButton("Add Section");
	cr.setBounds(20,270,170,50);
	frame.add(cr);
	cr.addActionListener(e -> {
		frame.setVisible(false);
		new CreateSection();
	} );
	
	JButton section=new JButton("Add Teacher & Class");
	section.setBounds(220,270,170,50);
	frame.add(section);
	section.addActionListener(e -> {
		frame.setVisible(false);
		new AddTeacher();
	} );
	
	JButton logout=new JButton("Log Out");
	logout.setBounds(100,340,200,50);
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
		new AdminPanel();
	}
	
}