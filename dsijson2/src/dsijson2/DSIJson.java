package dsijson2;

import static dsijson2.Json.JSON_MAPPER;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.codehaus.jackson.map.ObjectMapper;

public class DSIJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Persona persona1= new Persona();
	        persona1.setApellido("Perez");
	        persona1.setNombre("Jose");
	        persona1.setDNI("1323266");
	        
	        Persona persona3= new Persona();
	        persona3.setApellido("Fernandez");
	        persona3.setNombre("Ana");
	        persona3.setDNI("3456789");
	        
	        ArrayList<Persona> personas = new ArrayList<Persona>();
	        personas.add(persona1);
	        personas.add(persona3);
	       
	        JSON_MAPPER.writeValue(new File("/Este equipo/Documentos/Nueva/listadepersonas.json"), personas);
	        
	        Persona persona2 = JSON_MAPPER.readValue(new File("/usuario/Naiara/Documentos/persona1.json"), Persona.class);
	        System.out.println(persona2);
	        
	        ArrayList<Persona> personasdesdejson = JSON_MAPPER.readValue(new File("/Este equipo/Documentos/Nueva/listadepersonas.json"), JSON_MAPPER.getTypeFactory().constructCollectionType(ArrayList.class, Persona.class));
	        System.out.println(personasdesdejson.get(1).getApellido());
	        
	    }

}
