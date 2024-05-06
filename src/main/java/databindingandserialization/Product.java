package databindingandserialization;

public class Product {

	
	   private String proId;      
       private String proName;      
       private String price;    
     
       //Getter and Setters    
       public String getProId() {    
           return proId;    
       }    
       public void setProId(String proId) {    
           this.proId = proId;    
       }    
       public String getName() {    
           return proName;    
       }    
       public void setProName(String proName) {    
           this.proName = proName;    
       }    
       public String getPrice() {    
           return price;    
       }    
       public void setPrice(String price) {    
           this.price = price;    
       }    
       @Override      
       public String toString() {      
           // TODO Auto-generated method stub      
           return "\"Product [ProductId "+ proId + ", ProductName = " + proName + ", ProductPrice = " + price + "]";      
       }    
}
