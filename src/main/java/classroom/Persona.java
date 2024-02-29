package classroom;

public class Persona {

    private long cedula; //final, no puede ser final porque el final es para no poder cambiar la cedula //
    private String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
        //cedula = 3//
    }
    //creacion del constructor persona()

    public Persona() {
    
    }	
    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
    	this.nombre = nombre;
    	this.cedula = cedula;
        
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
    	this.cedula = 3;
        this.nombre = "";
        totalPersonas++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        
    //puede faltar el metodo setCedula//    
        
        
    }
    
    
}
