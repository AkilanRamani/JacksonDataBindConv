package databindingandserialization;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Employee {
	
	 private String empId;  
	    private String jobTitleName;  
	    private String firstName;  
	    private String lastName;  
	    private String preferredFullName;  
	    private String employeeCode;  
	    private String region;  
	    private String phoneNumber;  
	    private String emailAddress;  
	     
	    public Employee(){  
	         
	    }  
	     
	    @Override
		public String toString() {
			return "Employees [empId=" + empId + ", jobTitleName=" + jobTitleName + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", preferredFullName=" + preferredFullName + ", employeeCode="
					+ employeeCode + ", region=" + region + ", phoneNumber=" + phoneNumber + ", emailAddress="
					+ emailAddress + "]";
		}

		// getter/setters for all variables  
	    public String getEmpId() {  
	            return empId;  
	    }  
	    public void setEmpId(String empId) {  
	            this.empId = empId;  
	    }  
	     
	    public String getJobTitleName() {  
	            return jobTitleName;  
	    }  
	    public void setJobTitleName(String jobTitleName) {  
	            this.jobTitleName = jobTitleName;  
	    }  
	    public String getFirstName() {  
	            return firstName;  
	    }  
	    public void setFirstName(String firstName) {  
	            this.firstName = firstName;  
	    }  
	    public String getLastName() {  
	            return lastName;  
	    }  
	    public void setLastName(String lastName) {  
	            this.lastName = lastName;  
	    }  
	    public String getPreferredFullName() {  
	            return preferredFullName;  
	    }  
	    public void setPreferredFullName(String preferredFullName) {  
	            this.preferredFullName = preferredFullName;  
	    }  
	    public String getEmployeeCode() {  
	            return employeeCode;  
	    }  
	    public void setEmployeeCode(String employeeCode) {  
	            this.employeeCode = employeeCode;  
	    }  
	    public String getRegion() {  
	            return region;  
	    }  
	    public void setRegion(String region) {  
	            this.region = region;  
	    }  
	    public String getPhoneNumber() {  
	            return phoneNumber;  
	    }  
	    public void setPhoneNumber(String phoneNumber) {  
	            this.phoneNumber = phoneNumber;  
	    }  
	     
	    public String getEmailAddress() {  
	            return emailAddress;  
	    }  
	    public void setEmailAddress(String emailAddress) {  
	            this.emailAddress = emailAddress;  
	    }   

}
