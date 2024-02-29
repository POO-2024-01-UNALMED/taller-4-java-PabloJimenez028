package classroom;

import classroom.Tipo.TipoPrueba;

public class Asignatura {
	
    public String nombre;
    String n = nombre; //esto pa q
    public int codigoInterno;
    public int codigoExterno;
    public Tipo tipo; //Añadi .TipoPrueba

    public Asignatura() {
    	this("Sin nombre", 0, 0, null);
        //this(0); esto pa q x2
    }

    public Asignatura(Tipo tipo,int codigoInterno) { //intercambie los parametros tipo y codigo Interno de los parametros
        this("Sin nombre", codigoInterno, 0, tipo);
    }
        
    public Asignatura(int codigoExterno,Tipo tipo) {
    	this("Sin nombre", 0, codigoExterno,tipo); 
    }

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0, tipo); //cuando falta el Codigo externo e interno
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
