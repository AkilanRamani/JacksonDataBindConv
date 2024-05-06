package databindingandserialization;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksondataBinding {

	public static void main(String[] args) {
		 ObjectMapper mapper = new ObjectMapper();  
		 String empString = "{\n\"employees\" : [\n{\n\"empId\":\"001\",\n\"jobTitleName\":\"Developer\","  
	                + "\n\"firstName\":\"Nicholas\",\n\"lastName\":\"Clemens\",\n\"preferredFullName\":\"Nicholas Clemens\","  
	                + "\n\"employeeCode\":\"E010\",\n\"region\":\"CA\",\n\"phoneNumber\":\"408-1234567\",\n\"emailAddress\""  
	                + ":\"nicholas.clemens@gmail.com\"\n},\n{\n\"empId\":\"002\",\n\"jobTitleName\":\"Developer\","  
	                + "\n\"firstName\":\"Sharon\",\n\"lastName\":\"Lorenz\",\n\"preferredFullName\":\"Sharon Lorenz\","  
	                + "\n\"employeeCode\":\"E011\",\n\"region\":\"CA\",\n\"phoneNumber\":\"408-1111111\",\n\"emailAddress\""  
	                + ":\"sharon.lorenz@gmail.com\"\n},\n{\n\"empId\":\"thanks\",\n\"jobTitleName\":\"Program Directory\","  
	                + "\n\"firstName\":\"Brittany\",\n\"lastName\":\"Hart\",\n\"preferredFullName\":\"Brittany Hart\",\n\""  
	                + "employeeCode\":\"E012\",\n\"region\":\"CA\",\n\"phoneNumber\":\"408-2222222\",\n\"emailAddress\":\"brittany.hart@gmail.com\"\n}\n]\n}";  

		  try {
			Employee employees = mapper.readValue(empString, Employee.class);
			 empString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employees);  
	            System.out.println(empString);  
			   System.out.println(employees);  
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  	 
		 
		 
		 
	}

}
