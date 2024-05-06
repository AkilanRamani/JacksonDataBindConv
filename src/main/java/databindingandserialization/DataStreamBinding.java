package databindingandserialization;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataStreamBinding {

	public static void main(String[] args) {
	    try {                 
            // create an instance of JsonFactory   
            JsonFactory jsonFactory = new JsonFactory();  
              
            
            File f = new File("C:\\Users\\akilan-18633\\products.json");
            // create an instance of JsonGenerator by using the createGenerator() method of JsonFactory  
            JsonGenerator jsonGenerator = jsonFactory.createGenerator(f, JsonEncoding.UTF8);  
           
            // create an instance of Scanner class  
            Scanner sc = new Scanner(System.in);  
            // use writeStartObject()  
            jsonGenerator.writeStartObject();  
            // write name field to product.json file  
            System.out.println("Enter Product Name:");  
            String name = sc.nextLine();  
            jsonGenerator.writeStringField("name", name);   
            // write price field to product.json file  
            System.out.println("Enter Product Price:");  
            String price = sc.nextLine();  
            jsonGenerator.writeStringField("price", price);  
            // write expire field to product.json  
            System.out.println("Is product expire(Yes/No)?:");  
            String expire = sc.nextLine();  
            jsonGenerator.writeStringField("expire", expire);  
            // "variation" : [X1, X2, X3]  
            jsonGenerator.writeFieldName("variations");               
            // use writeStartArray() method to write values in an array  
            jsonGenerator.writeStartArray();              
            System.out.println("Total number of variations:");  
            int size = Integer.parseInt(sc.nextLine());           
            for(int i = 0; i < size; i++) {  
                System.out.println("Enter "+(i+1)+" variation name:");  
                jsonGenerator.writeString(sc.nextLine());   
            }             
            // use writeEndArray() method to stop writing values in the array  
            jsonGenerator.writeEndArray();   
            // use writeStartObject()  
            jsonGenerator.writeEndObject();               
            // close JsonGenerator using close() method  
            jsonGenerator.close();                    
            // close Scanner class  
            sc.close();   
           
            JsonParser parser = jsonFactory.createParser(f);  
           System.out.println(parser);
            // create an instance of the ObjectMapper class  
            ObjectMapper mapper = new ObjectMapper();  
            @SuppressWarnings("unchecked")  
            Map<String,Object> mapData = mapper.readValue(f, Map.class);  
            System.out.println(mapData);
            System.out.println(mapData.get("name"));  
            System.out.println(mapData.get("price"));  
            System.out.println(mapData.get("expire"));  
            System.out.println(mapData.get("variations"));  
        }   
        catch (JsonParseException e) {   
            e.printStackTrace();   
        } catch (JsonMappingException e) {  
            e.printStackTrace();   
        } catch (IOException e) {   
            e.printStackTrace();   
        }  
    }  

	}


