package classroom;

public class Tipo{
	
	public enum TipoPrueba{DISCIPLINAR, FUNDAMENTACION, ELECTIVA}; //Cambiar nombre despues para corregir, ademas de quitar los (10,20,30)
	
	public int codigo; //private
	public String nombre; //private
	
	public Tipo(int codigo,String nombre) { 
		this.codigo = codigo;
		this.nombre = nombre;
		

		
		
	}
}
