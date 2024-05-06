package databindingandserialization;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SimpleDataBinding {
	
	 @SuppressWarnings("unchecked")  
	    public static void main(String args[]){  
	
	  try {  
          // create instance of the ObjectMapper class  
          ObjectMapper mapper = new ObjectMapper();  
            
          // create a list of Student  
                  Map<String, Student> studentDataMap = new HashMap<String, Student>();   
            
                  // size of Map  
                  int size;  
            
                  // create an instance of Scanner class  
                  Scanner sc= new Scanner(System.in);  
            
                  System.out.println("How many records of Student you have?");  
                  size = Integer.parseInt(sc.nextLine());  
            
                  for(int i = 0; i < size; i++) {  
                
                      Student std = new Student();  
                
                      System.out.println("Enter student id: ");  
                      String stdId = sc.nextLine();  
              std.setStdId(stdId);  
                
              System.out.println("Enter course:");  
              std.setCourse(sc.nextLine());  
                
              System.out.println("Enter first name:");  
              std.setfName(sc.nextLine());
                
              System.out.println("Enter last name:");  
             std.setfName(sc.nextLine());
                
             
                
              studentDataMap.put(stdId, std);  
                
          }  
            
	                  // close Scanner class object  
                  sc.close();  
            
                  File f = new File("C:\\Users\\akilan-18633\\students.json");
                  // write Map data into student.json file  
                  mapper.writeValue(f, studentDataMap);  
            
                  System.out.println("Your data is written successfully in student.json.\n");  
                  System.out.println("Data present in student.json file......");  
                
               
				Map<String, Student> data = mapper.readValue(f, Map.class); 
				System.out.println(data);
            
                  for (Map.Entry<String, Student> entry : data.entrySet())  
                      System.out.println("Key = " + entry.getKey()+", Value = " + entry.getValue());  
            
          }  catch (JsonMappingException exec) {  
              exec.printStackTrace();  
          } catch (JsonParseException exec1) {  
              exec1.printStackTrace();  
          } catch (IOException exec11) {  
                  exec11.printStackTrace();  
          }  
  }  

}

