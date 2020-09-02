package dsijson2;

public class Persona {
	  private String Apellido;
	    private String Nombre;
	    private String DNI;
	    
	    @Override
	    public String toString(){
	        return "Persona [Nombre: " + Nombre + " Apellido: " + Apellido + " DNI: " + DNI + "}"; 
	    }
	    
	    public String getApellido(){
	        return this.Apellido;
	    }
	    
	    public void setApellido(String value){
	        this.Apellido=value;
	    }

	    public String getNombre(){
	        return this.Nombre;
	    }
	    
	    public void setNombre(String value){
	        this.Nombre=value;
	    }
	    
	    public String getDNI(){
	        return this.DNI;
	    }
	    
	    public void setDNI(String value){
	        this.DNI=value;
	    }


}
