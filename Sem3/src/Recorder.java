import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Recorder
{
	/*
	private RecorderUI recorderUI;
	private ArrayList<MarkCollection> records;
	private int averageMark;
	private MarkCollection currentRecord;
	*/
	
	private static int numStudents;
	
	public static void main(String[] args) 
	{
		new Recorder();
		
		RecorderUI ui = new RecorderUI();
		
		ui.display();
		
		 try
	     {
			 BufferedReader cons=new BufferedReader(new InputStreamReader(System.in)); 
	         System.out.println("Enter the size of the student group:");
	         numStudents = Integer.parseInt(cons.readLine());
	     }
		 catch (Exception e)
		 {
			 System.err.println(e.getMessage());
		 }
		 
		 MarkCollection mc = new MarkCollection();
		 
		 mc.setSize(numStudents);
		 
		 for(int i=0; i<numStudents; i++)
		 {
			//ask user for input
			 try
		     {
				 BufferedReader cons=new BufferedReader(new InputStreamReader(System.in)); 
		         System.out.println("Enter name of the student: ");
		         //numStudents = Integer.parseInt(cons.readLine());
		         String name = cons.readLine();
		         System.out.println("Enter student mark: ");
		         float mark = Float.parseFloat(cons.readLine());
		         
		         MarkRecord mr = mc.getRecord(1);
		         mr.setMark(mark);
		         mr.setName(name);
		     }
			 catch (Exception e)
			 {
				 System.err.println(e.getMessage());
			 }
			 
			
		 }	
		 
		 float highest =0;
		 float lowest =100;
		 int highestIndex =0;
		 int lowestIndex =0;
		 
		 for(int i=0; i<numStudents;i++)
		 {
			 MarkRecord mark = mc.getRecord(i);
			 
			 if(mark.getMark() > highest)
			 {
				 highestIndex =i;
				 highest = mark.getMark();
			 }
			 if(mark.getMark() < lowest)
			 {
				 lowestIndex =i;
				 lowest = mark.getMark();
			 }	 
		 }
		 
		 
		 System.out.println(mc.getRecord(highestIndex).getName() + 
				 " got the highest mark.");
		 
		 System.out.println(mc.getRecord(lowestIndex).getName() + 
				 " got the lowest mark.");
		 
	}
	
	public void getStatistics()
	{
		
	}

	/*
	public Recorder(){
		recorderUI = new RecorderUI();
		//recorderUI.display();
	}
	
	public void display(){
		
	}
	
	public void setSize(int numStudents){
		records = new ArrayList<MarkCollection>(numStudents);
	}
	
	public void getRecord(int num){
		currentRecord = records.get(num);
	}
	
	public void setName(int currentRecordIndex, String name){
		currentRecord.setName(name);
	}
	
	public void setMark(int mark){
		
	}
	
	public void getMark(){
		
	}
	
	public void calculateStatistics(){
		int runningTotal = 0;
		for(int i = 0; i < records.size(); i++){
			MarkCollection currentStudent = records.get(i);
			int currentMark = currentStudent.getMark();
			runningTotal += currentMark;
		}
		averageMark = runningTotal/records.size();
	}
	
	public void showStatistics(){
		System.out.printf("The average mark is: %d", averageMark);
	}
	*/
}