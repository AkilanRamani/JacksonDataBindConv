package databindingandserialization;

import java.util.Date;
import java.util.List;

public class College {
	
	 public String name;        
	    public String university;     
	    public List<String> address;   
	    public Date est;  
	    public String rank;     
	  
	    // constructor    
	    College(String name, String university, List<String> address, Date est, String rank){    
	        this.name = name;    
	        this.university = university;    
	        this.address = address;   
	        this.est = est;  
	        this.rank = rank;    
	    }    
	    //Getter and Setters  
	    public String getCollegeName() {    
	        return name;    
	    }    
	    public String getUniversityName() {    
	        return university;    
	    }    
	    public Date getEst() {    
	        return est;    
	    }    
	    public List<String> getAddress() {    
	        return address;    
	    }    
	    public String getRank() {    
	        return rank;    
	    }  
	    @Override      
	    public String toString() {      
	        // TODO Auto-generated method stub      
	        return "\"College [College Name: "+ name + ", College University = " + university + ", College Est. = " + est + ", Address = "+address+", College Rank = "+rank+"]";      
	    }    


}