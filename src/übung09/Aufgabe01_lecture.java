package übung09;

public class Aufgabe01_lecture {
	
	private String   lecture;//Vorlesung
	private String  lecturer;//Dozent
	private String    course;//Studiengang
	
	
	public Aufgabe01_lecture(String lecture, String lecturer, String course){
		
		this.lecture   = lecture;
		this.lecturer = lecturer;
		this.course     = course;
		
	}
	public String getLecture(){
		
		return lecture;
	}

	public void setLecture(String lecture){
		
		this.lecture = lecture;
	}
	public String getLecturer(){
		
		return lecturer;
	}

	public void setLecturer(String lecturer){
		
		this.lecture = lecturer;
	}
	
	public String getCourse(){
		
		return course;
	}

	public void setCourse(String course){
		
		this.course = course;
	}
	

}
