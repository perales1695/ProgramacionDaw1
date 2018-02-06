
public class Empleado {
	private String nombre;
	private String apellido;	
	private double sueldo;
	//private static Integer contador=0;
	
	public Empleado(String nombre, String apellido,double sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo=sueldo;
		//contador++;
	}//constructor
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	/*public int verNumEmple(){
		return contador;
		
	}*/
	public void verInfoEmple(){
		System.out.println("**********************************");
		System.out.println("\t\t\n Nombre: "+nombre);
		System.out.println("\t\t\n Apellido: "+apellido);
		System.out.println("\t\t\n Sueldo : "+sueldo);
		System.out.println();
		return;
	}
}//class Empleado