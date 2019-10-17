import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;

class CreateSamester
{
	public CreateSamester()
	{
		JFrame frame=new JFrame("American International University");
	
    JLabel l1 = new JLabel("Enter New Samester Name : ");
	l1.setBounds(50,50,200,20);
	frame.add(l1);
	
	JTextField name=new JTextField();
	name.setBounds(50,100,200,20);
	frame.add(name);
	
	
	JButton confirm=new JButton("Confirm");
	confirm.setBounds(100,200,120,70);
	frame.add(confirm);
	confirm.addActionListener(e -> {
		frame.setVisible(false);
		new AdminPanel();
	});
	
	JButton cancel=new JButton("Cancel");
	cancel.setBounds(270,200,100,70);
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
		new CreateSamester();
	}
}