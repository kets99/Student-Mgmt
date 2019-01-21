import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

class NextPage
{ 
static JLabel l1,l2,l3,l4,l5,l6,l7,l8;
static JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
static JPasswordField p1;
static JButton b1,b2,b3;
static JPanel p,p3;
String data1;
String admin="admin";
String a="admin";
static JTable table;
public void demo(String data)
{
JFrame f=new JFrame("LOGIN PAGE");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p=new JPanel();

if(data=="ADMIN LOGIN")
{
	ImageIcon imgg5 = new ImageIcon("image5.png");
	JLabel img5 = new JLabel();
	img5.setIcon(imgg5);
	p.add(img5); 
	img5.setBounds(0,0,800,280);
l1=new JLabel("Enter the admin user ID :");
l2=new JLabel("Enter the password :");
t1=new JTextField();
t2=new JTextField();
b1=new JButton("LOGIN");
b1.setBounds(600,280,150,20);
l1.setBounds(200,200,150,20);
l2.setBounds(200,250,150,20);
t1.setBounds(400,200,150,20);
t2.setBounds(400,250,150,20);
p.add(b1);
p.add(t2);
p.add(l1);
p.add(l2);
p.add(t1);


b1.addActionListener(new ActionListener() {  
    public void actionPerformed(ActionEvent me) {
    	String s1=t1.getText();
    	String s2=t2.getText();
    	if(s1.equals(admin)&&s2.equals(a))
    	{
	Third t=new Third();
	t.thirdd();
    	}
    	else
        	JOptionPane.showMessageDialog(null,"incorrect");
} });


}
else if(data=="STUDENT LOGIN")
{
	
l1=new JLabel("Enter the student name");
l2=new JLabel("Enter the password/the roll no");
t1=new JTextField();
p1=new JPasswordField();
b2=new JButton("LOGIN");
b2.setBounds(600,280,150,20);
l1.setBounds(200,200,150,20);
l2.setBounds(200,250,200,20);
t1.setBounds(400,200,150,20);
p1.setBounds(400,250,150,20);
p.add(b2);
p.add(p1);
p.add(l1);
p.add(l2);
p.add(t1);

ImageIcon imgg4 = new ImageIcon("image4.png");
JLabel img4 = new JLabel();
img4.setIcon(imgg4);
p.add(img4); 
img4.setBounds(0,0,800,280);
b2.addActionListener(new ActionListener() {  
    public void actionPerformed(ActionEvent e) {
	Connection conn=null;
	conn=seqel.connector();
	try {
		String from=t1.getText();
		String query="select * from Student_list where name=? and roll_no=?";
		PreparedStatement psd1= conn.prepareStatement(query);
		psd1.setString(1,t1.getText());
		psd1.setString(2,p1.getText());
		ResultSet rs1=psd1.executeQuery();
		int count=0;
		while(rs1.next())
		{
		count=count+1;
		}
		psd1.close();
		rs1.close();
		if(count==1)
		{
	      
	 
	    String[] columnNames = {"name", "year", "roll no", "branch","maths","chemistry","physics","drawing"};
	    
	    DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        PreparedStatement psd;
	    psd = conn.prepareStatement("select * from Student_list where NAME='" + from + "'");
        ResultSet rs = psd.executeQuery();
        
        if (rs.next()) {
           String name = rs.getString("name");
            String branch= rs.getString("branch");
            int roll_no = rs.getInt("roll_no");
            int maths = rs.getInt("maths");
            int physics = rs.getInt("physics");
            int chemistry = rs.getInt("chemistry");
            int drawing = rs.getInt("drawing");
            int year = rs.getInt("year");
            model.addRow(new Object[]{name, year, roll_no, branch,maths,physics,chemistry,drawing});
            
        }
        table = new JTable();
        table.setModel(model);
        ImageIcon imgg8 = new ImageIcon("image8.png");
        JLabel img8 = new JLabel();
        img8.setIcon(imgg8);
       
       
        
        table.setBounds(20,20,1000,1000);
        
        JFrame f1=new JFrame("STUDENT RESULT");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p3=new JPanel();
	    f1.getContentPane().add(p3);
        p3.add(table);
	    p3.setLayout(null);
	    p3.add(img8);  
	    
	    img8.setBounds(20,-280,1000,600);
		f1.setVisible(true);
		f1.setSize(3000,3000);		
		
		
		rs.close();
		psd.close();
	}
		else
		{
		//put a dialogbox
			JOptionPane.showMessageDialog(null,"incorrect");
		}
	}	
	catch(Exception e1)
	{
	
	}
	} });
}


f.getContentPane().add(p);
p.setLayout(null);

f.setSize(3000,3000);

f.setVisible(true);





}
}

