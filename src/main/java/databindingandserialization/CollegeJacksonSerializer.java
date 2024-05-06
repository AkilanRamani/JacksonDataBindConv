package databindingandserialization;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

@SuppressWarnings("serial")
public class CollegeJacksonSerializer extends StdSerializer<College> {  
    
  // create an instance of SimpleDateFormat class  
  private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");  
    
  public CollegeJacksonSerializer(@SuppressWarnings("rawtypes") Class t) {  
      super(t);  
  }  

  

	@Override
	public void serialize(College value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeStartObject();  
        
	      gen.writeStringField("College Name ", value.getCollegeName());  
	      gen.writeStringField("College University ", value.getUniversityName());  
	      gen.writeStringField("Address ", value.getAddress().stream().collect(Collectors.joining("-")));  
	      gen.writeObjectField("College Est. ", value.getEst() != null ? sdf.format(value.getEst()) : null);  
	      gen.writeStringField("College Rank: ", value.getRank());  
	        
	      gen.writeEndObject();  	
		
	}
}