package databindingandserialization;

import java.util.Iterator;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTreeNodes {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		ObjectMapper obj = new ObjectMapper();    
		String jsonString = "{\r\n"
				+ "    \r\n"
				+ "    \"name\" : \"akilan\",\r\n"
				+ "    \"city\" : \"Cbe\"\r\n"
				+ "}";
		//create tree from JSON 
	
		JsonNode node = obj.readTree(jsonString); 
		
		JsonNode stdName = node.path("city");
		
	 

		
		System.out.println("Name: "+ stdName.textValue());  
		//path method accepts the JSON node that is the Field as an input argument and returns the node value that Represents the corresponding Json Node.
		System.out.println(stdName);
		/*Iterator<JsonNode> iterator = stdName.elements();  
		   while (iterator.hasNext()) {  
               JsonNode data = iterator.next();  
               System.out.print("data is " + data.textValue());   
           }  
		
		//System.out.println("Name: "+ stdName.textValue());  
		  
	//	System.out.println(node); */

	}

}































