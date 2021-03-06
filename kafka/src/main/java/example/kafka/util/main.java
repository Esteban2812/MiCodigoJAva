package example.kafka.util;

import java.util.Properties;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import example.kafka.entities.*;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class main {
	private Properties kafkaProps = new Properties();
	
	
	public String convertirAJson() throws JsonGenerationException, JsonMappingException, IOException {
	
	System.out.println("OS  = " + System.getProperty("os.name"));	
		
	String jsonFile;
	
	if(System.getProperty("os.name").compareTo("Linux") == 0) 
		jsonFile="/home/cambiante/file.json";
	else
		jsonFile="C:\\Users\\Esteban\\Documents\\file.json";	
	
	System.out.println("json file="+jsonFile);
	ObjectMapper mapper = new ObjectMapper();
	
	Producto producto = new Producto(10,"Traduccion frances/italiano");
	
	mapper.writeValue(new File(jsonFile), producto);
	
	return jsonFile;
	
	}
	
	public String convertirAJsonStr() throws JsonProcessingException  {
		
		//String jsonFile="C:\\Users\\Esteban\\Documents\\file.json";
		
		ObjectMapper mapper = new ObjectMapper();
		
		Producto producto = new Producto(10,"Traduccion frances/italiano");
		
		String contenidoJson = mapper.writeValueAsString( producto);
		
		return contenidoJson;
		
		}
	
	public Producto convertirDeArchivoAObjeto() throws JsonParseException, JsonMappingException, IOException {
		String jsonFile;
		if(System.getProperty("os.name").compareTo("Linux") == 0)
			jsonFile="/home/cambiante/file-copy.json";
		else
			jsonFile="C:\\Users\\Esteban\\Documents\\file-copy.json";
		ObjectMapper mapper = new ObjectMapper();
		Producto oProducto = (Producto) mapper.readValue(new File(jsonFile), Producto.class);

		return oProducto;
		
	}
	
}
