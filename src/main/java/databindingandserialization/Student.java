package databindingandserialization;

public class Student {
	
	private String stdId;  
    private String course;  
    private String fName;  
    private String lName;  
   
  
    public Student(){  
         
    }  
  
    // getter/setters for all variables  
    public String getStdId() {  
        return stdId;  
    }  
    public void setStdId(String stdId) {  
        this.stdId = stdId;  
    }  
  
    public String getCourse() {  
        return course;  
    }  
    public void setCourse(String course) {  
        this.course = course;  
    }

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", course=" + course + ", fName=" + fName + ", lName=" + lName + "]";
	}

	
  
   
  
    

}
