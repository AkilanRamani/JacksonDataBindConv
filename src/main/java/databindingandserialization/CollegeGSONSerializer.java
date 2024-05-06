package databindingandserialization;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class CollegeGSONSerializer {

	public static void main(String[] args) throws ParseException {
		Scanner sc= new Scanner(System.in);         
        
        College colg;    
  
        String name, university, add1, add2, rank, est;    
          
        List<String> address = new ArrayList<String>();  
          
        System.out.println("Enter College Name:");    
        name = sc.nextLine();    
  
        System.out.println("Enter University Name:");    
        university = sc.nextLine();    
  
        System.out.println("Enter College Address:");    
        add1 = sc.nextLine();    
          
        System.out.println("Enter University Address:");    
        add2 = sc.nextLine();  
          
        System.out.println("Enter College Est. in dd-mm-yyy format: ");    
        est = sc.nextLine();  
          
        System.out.println("Enter College Rank:");    
        rank = sc.nextLine();    
  
        address.add(add1);  
        address.add(add2);  
          
          
        // create an instance of SimpleDateFormat  
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");  
          
        colg = new College(name, university, address, sdf.parse(est), rank);  
          
        SimpleModule module = new SimpleModule();  
        module.addSerializer(new CollegeJacksonSerializer(College.class));  
        ObjectMapper mapper = new ObjectMapper();  
        try {  
              DefaultPrettyPrinter printer = new DefaultPrettyPrinter();
            String jsonResult = mapper  
                    .registerModule(module)  
                    .writer(printer)  
                    .writeValueAsString(colg);  
            System.out.println(jsonResult);  
              
        } catch (JsonProcessingException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }         
      
      
        //close Scanner class object    
        sc.close();    
  
    }    

	}


