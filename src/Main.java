import java.awt.event.*;
import javax.swing.*;
public class Main extends JPanel implements ActionListener {
static JButton button1;
static JButton button2;
static JPanel p;
public static void main(String args[]){
Main m=new Main();
m.go();
}
public void go()
{
JFrame f=new JFrame();
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p=new JPanel();
button1 =new JButton("STUDENT LOGIN");
button2 =new JButton("ADMIN LOGIN");
p.add(button1);
p.add(button2);
p.setLayout(null);
ImageIcon imgg1 = new ImageIcon("image1.png");
JLabel img1 = new JLabel();
img1.setIcon(imgg1);
p.add(img1); 


ImageIcon imgg9 = new ImageIcon("image9.png");
JLabel img9 = new JLabel();
img9.setIcon(imgg9);
p.add(img9); 
img9.setBounds(0,400,800,280);

ImageIcon imgg2 = new ImageIcon("image2.png");
JLabel img2 = new JLabel();
img2.setIcon(imgg2);
p.add(img2); 
img1.setBounds(0,-10,800,280);
img2.setBounds(900,20,800,300);

ImageIcon imgg7 = new ImageIcon("image7.png");
JLabel img7 = new JLabel();
img7.setIcon(imgg7);
p.add(img7); 
img7.setBounds(400,0,800,280);


button1.setBounds(200,200,150,50);
button2.setBounds(400,200,150,50);
button1.addActionListener(this);
button2.addActionListener(this);
f.getContentPane().add(p);
f.setSize(3000,3000);
f.setVisible(true);
}



public void actionPerformed(ActionEvent ac)
{
if(ac.getSource()==button1)
{     
String data=button1.getText();  
NextPage nextt=new NextPage();
nextt.demo(data);

}
else
if(ac.getSource()==button2)
{
	String data=button2.getText();  
	NextPage nextt=new NextPage();
	nextt.demo(data);

}
}
}