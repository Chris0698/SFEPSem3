import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RecorderUI extends JFrame implements ActionListener
{
	private JButton enterButton = new JButton("Enter");
	private JLabel label = new JLabel("Enter number");
	private JTextField textField = new JTextField();
	
	private Scanner scanner = new Scanner(System.in);
	
	private Recorder recorder =  new Recorder();

	
	public RecorderUI()
	{	
		/*
		System.out.println("Enter number of students: ");
		int number = scanner.nextInt();
		
		for(int i=0; i<number; i++)
		{
			System.out.println("Enter name and mark: ");
			int mark = scanner.nextInt();
			String name = scanner.next();
			/*recorder.getRecord(i);			//would be inside getMark method
			//enterMark(name, mark);
			
			recorder.getRecord(i); 
		}
		
		
		getStatistics();
		
		super("Mark Entering System");
		makeFrame();
		showFrame();
		*/
	}
	
	private void makeFrame()
	{
		setLayout(new GridLayout(1,3));
		
		enterButton.addActionListener(this);
		
		add(label);
		add(textField);
		add(enterButton);

	}
	
	private void showFrame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		if(o == enterButton)
		{
			
		}
		
	}
	
	private void enterMark(String name, int mark)
	{
		
	}
	
	private void getStatistics()
	{
		
	}
	
	public void display()
	{
		
	}
}
