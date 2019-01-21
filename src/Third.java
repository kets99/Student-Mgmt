import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
class Third {
	
	static JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	static JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	static JButton b1;
	static JPanel p;
	
	 public void thirdd()
	 {
		 Third goo=new Third();
		 goo.runn();
	 }
	 public void runn()
					{
						JFrame f1=new JFrame("MARKS ENTRY PAGE");
						f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
						p=new JPanel();
						f1.getContentPane().add(p);
						
						f1.setVisible(true);
						f1.setSize(3000,3000);		
						p.setLayout(null);
						l1=new JLabel("Enter student name:");
						l2=new JLabel("Enter the Roll Number :");
						l3=new JLabel("Enter  Branch"); //we can provide drop down ... 
						l4=new JLabel("Enter the year number "); //drop down
						l5=new JLabel("Enter marks in maths :");
						l6=new JLabel("Enter marks in phyics :");
						l7=new JLabel("Enter marks in drawing :");
						l8=new JLabel("Enter marks in chemistry :");

						t1=new JTextField();
						t2=new JTextField();
						t3=new JTextField();
						t4=new JTextField();
						t5=new JTextField();
						t6=new JTextField();
						t7=new JTextField();
						t8=new JTextField();
						
						ImageIcon imgg3 = new ImageIcon("image3.png");
						JLabel img3 = new JLabel();
						img3.setIcon(imgg3);
						p.add(img3); 
						img3.setBounds(0,-60,800,280);
						b1=new JButton("ADD THE RECORD "); 
						b1.setBounds(600,430,150,20);
						p.add(b1);
						l1.setBounds(200,150,150,20);
						l2.setBounds(200,200,150,20);
						l3.setBounds(200,250,150,20);
						l4.setBounds(200,300,150,20);
						l5.setBounds(200,350,150,20);
						l6.setBounds(200,400,150,20);
						l7.setBounds(200,450,150,20);
						l8.setBounds(200,500,150,20);
						t1.setBounds(400,150,150,20);
						t2.setBounds(400,200,150,20);
						t3.setBounds(400,250,150,20);
						t4.setBounds(400,300,150,20);
						t5.setBounds(400,350,150,20);
						t6.setBounds(400,400,150,20);
						t7.setBounds(400,450,150,20);
						t8.setBounds(400,500,150,20);
						
						
						p.add(l1);
						p.add(l2);
						p.add(l3);
						p.add(l4);
						p.add(l5);
						p.add(l6);
						p.add(l7);
						p.add(l8);
						p.add(t3);
						p.add(t4);
						p.add(t5);
						p.add(t6);
						p.add(t7);
						p.add(t8);
						p.add(t2);
						p.add(t1);		
						
						p.setVisible(true);
				
				b1.addActionListener(new ActionListener() {  
			        public void actionPerformed(ActionEvent ea) {       
			
			        	Connection conn=null;
			        	conn=seqel.connector();
			        	try {
			        		String query="insert into Student_list (roll_no,name,year,branch,chemistry,physics,maths,drawing) values (?,?,?,?,?,?,?,?)";
			        		PreparedStatement psd= conn.prepareStatement(query);
			        		psd.setString(1,t2.getText());
			        		psd.setString(2,t1.getText());
			        		psd.setString(3,t4.getText());
			        		psd.setString(4,t3.getText());
			        		psd.setString(5,t8.getText());
			        		psd.setString(6,t6.getText());
			        		psd.setString(7,t5.getText());
			        		psd.setString(8,t7.getText());

			        		psd.execute();
			        		JOptionPane.showMessageDialog(null,"data saved");
			        		
			        		
			        		
			        		
			        		
			        		psd.close();
			        	}
			        	catch(Exception e1)
			        	{
			        		
			        		JOptionPane.showMessageDialog(null, e1);
			        	}	        	
			        	
			        	
			}
			} );
				
				
					}
			
				
	 }
