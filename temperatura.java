import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class temperatura implements ActionListener
{
	JButton b1=new JButton("Converter");

	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	JPanel p5=new JPanel();

	JTextField f1=new JTextField(10);

	JLabel l1=new JLabel("Temperatura");
	JLabel l2=new JLabel("De--->");
	JLabel l3=new JLabel("Para->");

	JFrame f=new JFrame("Conversor de temperatura");

	JRadioButton r1=new JRadioButton("Celcius",true);
	JRadioButton r2=new JRadioButton("Farenheit");
	JRadioButton r3=new JRadioButton("Celcius");
	JRadioButton r4=new JRadioButton("Farenheit",true);

	ButtonGroup b2=new ButtonGroup();
	ButtonGroup b3=new ButtonGroup();

	boolean primeiro=true;
	boolean segundo=false;

	public void roda()
	{

		b1.addActionListener(this);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		r4.addActionListener(this);

		b2.add(r1);
		b2.add(r2);
		b3.add(r3);
		b3.add(r4);

		p1.add(l1);
		p1.add(f1);

		p2.add(l2);
		p2.add(r1);
		p2.add(r2);

		p3.add(l3);
		p3.add(r3);
		p3.add(r4);

		p4.add(b1);

		p5.add(p1);
		p5.add(p2);
		p5.add(p3);
		p5.add(p4);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(p5);
		f.setSize(250,200);
		f.setVisible(true);

	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			try
			{
				Double num=Double.parseDouble(f1.getText());
				this.mostra(num);
			}

			catch(NumberFormatException er)
			{
				JOptionPane.showMessageDialog(null,"Digite casas decimais com pontos '.'","Erro!!!",JOptionPane.PLAIN_MESSAGE);
				f1.setText("");
			}
		}

		else if(e.getSource()==r1)
		{
			primeiro=true;
		}

		else if(e.getSource()==r2)
		{
			primeiro=false;
		}

		else if(e.getSource()==r3)
		{
			segundo=true;
		}

		else if(e.getSource()==r4)
		{
			segundo=false;
		}
	}

	public void mostra(double num)
	{
		String texto=""+num;

		if((primeiro==true)&&(segundo==false))
		{
			this.converte(num,1);
		}

		else if((primeiro==false)&&(segundo==true))
		{
			this.converte(num,0);
		}

		else
		{
			JOptionPane.showMessageDialog(null,"Resultado: "+texto,"Conversão",JOptionPane.PLAIN_MESSAGE);
		}
	}
	public void converte(double num,int o)
	{
		double res;

		if(o==1)
		{
			res=num*1.8+32;
			String tex=""+res;
			JOptionPane.showMessageDialog(null,"Celsius / Farenheint: "+tex,"Conversão",JOptionPane.PLAIN_MESSAGE);
		}

		else
		{
			res=(num-32)/1.8;
			String tex=""+res;
			JOptionPane.showMessageDialog(null,"Farenheint / Celsius: "+tex,"Conversão",JOptionPane.PLAIN_MESSAGE);
		}
	}
}