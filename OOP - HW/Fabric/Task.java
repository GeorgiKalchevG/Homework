
public class Task {
	private String nameOfTask;	//name of task
	private int workingHours;	//hours remaining before the task is done
	public void setName(String nameOfTask){
		this.nameOfTask = nameOfTask;
	}
	public void setWorkingHours(int workingHours){
		this.workingHours = workingHours;
	}
	public String getNameOfTask(){
		return nameOfTask;
	}
	public int getWokingHours(){
		return workingHours;
	}

	Task(String nameOfTask, int workingHours){
		setName(nameOfTask);
		setWorkingHours(workingHours);
	}
}
