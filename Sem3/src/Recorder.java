import java.util.*;

public class Recorder {
	
	private RecorderUI recorderUI;
	private ArrayList<MarkCollection> records;
	private int averageMark;
	private MarkCollection currentRecord;
	
	
	/*
	public static void main(String[] args) {
		new Recorder();
	}
	*/
	
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
		//currentRecord.setName(name);
	}
	
	public void setMark(int mark){
		
	}
	
	public void getMark(){
		
	}
	
	public void calculateStatistics(){
		int runningTotal = 0;
		for(int i = 0; i < records.size(); i++){
			MarkCollection currentStudent = records.get(i);
			//int currentMark = currentStudent.getMark();
			//runningTotal += currentMark;
		}
		averageMark = runningTotal/records.size();
	}
	
	public void showStatistics(){
		System.out.printf("The average mark is: %d", averageMark);
	}
}