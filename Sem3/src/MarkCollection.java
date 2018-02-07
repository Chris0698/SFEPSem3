import java.util.*;

public class MarkCollection 
{
	private int size; 		//number of student
	private ArrayList<MarkRecord> studentMarks;
	
	public MarkCollection()
	{
		 studentMarks = new ArrayList<MarkRecord>();
		
	}
	
	/**
	 * Set size
	 * @param size
	 */
	public void setSize(int size)
	{
		this.size = size;
		
		 //loop the student and create
		 for (int i=0; i<size; i++)
		 {
			 MarkRecord mr = new MarkRecord();
			 studentMarks.add(mr);
			 
			 //studentMarks.add(new MarkRecord());
		 }
	}
	
	public MarkRecord getRecord(int studentNumber)
	{
		if(studentNumber <= studentMarks.size())
		{
			return studentMarks.get(studentNumber);
		}
		else
		{
			return null;
		}
	}
}
