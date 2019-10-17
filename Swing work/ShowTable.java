import javax.swing.JTable;
import javax.swing.JFrame; 
import javax.swing.JScrollPane;
import javax.swing.JButton; 
  
class ShowTable{     
    JFrame frame = new JFrame();
    
   public ShowTable(){       
    String data[][]={ {"Values","Values","Values"},    
                          {"Values","Values","Values"},    
                          {"Values","Values","Values"}};    
    String column[]={"Date_Name","Date_Name","Date_Name"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(0,0,490,400);          
    JScrollPane sp=new JScrollPane(jt);  

   	JButton cancel =new JButton("Back");
	cancel.setBounds(200,420,80,40);
	frame.add(cancel);
	cancel.addActionListener(e -> {
		frame.setVisible(false);
		new AdminPanel();
	});

	frame.add(sp);	
    frame.setSize(500,500);    
    frame.setVisible(true);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
}
   
public static void main(String []args) {    
        new ShowTable();
}    
}  