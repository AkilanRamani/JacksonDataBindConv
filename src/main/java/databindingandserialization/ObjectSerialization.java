package databindingandserialization;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectSerialization {
	
	 public static void main(String args[]){  
         
	        // create instance of the ObjectSerialization class  
	        ObjectSerialization obj = new ObjectSerialization();  
	          
	        int size;  
	          
	        Scanner sc1 = new Scanner(System.in);  
	        System.out.println("Enter total products:");  
	        size = Integer.parseInt(sc1.nextLine());  
	          
	          
	        ArrayList<Product> products = new ArrayList<>();  
	          
	        try {  
	              
	            for(int i = 0; i < size; i++) {  
	                Product prod = new Product();  
	                String prodId, prodName, price;  
	                  
	                System.out.println("Enter Id of Product"+(i+1));  
	                prodId = sc1.nextLine();  
	                prod.setProId(prodId);  
	                  
	                System.out.println("Enter Name of Product"+(i+1));  
	                prodName = sc1.nextLine();  
	                prod.setProName(prodName);  
	                  
	                System.out.println("Enter price of Product"+(i+1));  
	                price = sc1.nextLine();  
	                prod.setPrice(price);  
	                  
	                products.add(prod);  
	                  
	            }  
	            // call writeJSON() method of the ObjectSerialization class to write List data into products file  
	            obj.writeJSON(products);  
	              
	            System.out.println("Data is written successfully in product.json file.");  
	  
	        } catch (JsonParseException e) {  
	            e.printStackTrace();  
	        } catch (JsonMappingException e) {  
	            e.printStackTrace();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	          
	        // close scanner class object  
	        sc1.close();  
	    }  
	      
	    // create writeJSON() method that will write the list data into products.json file  
	    public void writeJSON(ArrayList<Product> products) throws JsonGenerationException, JsonMappingException, IOException{  
	          
	        // create an instance of the ObjectMapper class  
	        ObjectMapper mapper = new ObjectMapper();  
	        
	        File f = new File("C:\\Users\\akilan-18633\\products.json");
	          
	        // use writeValue() method to write data into products.json  
	        mapper.writeValue(f, products);  
	    }  
	}  


