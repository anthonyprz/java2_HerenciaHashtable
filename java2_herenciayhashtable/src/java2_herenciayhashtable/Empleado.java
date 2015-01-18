package java2_herenciayhashtable;


public class Empleado {
	String codigoEmpleado;
	String nombre;
	String apellido;
	int edad;
	double sueldo;
		//setters
		public void setCodigoEmpleado (String codigoEmpleado){
			this.codigoEmpleado = codigoEmpleado;
		}
		public void setNombre (String nombre){
			this.nombre = nombre;
		}
		public void setApellido (String apellido){
			this.apellido = apellido;
		}
		public void setEdad (int edad){
			this.edad = edad;
		}
		public void setSueldo (double sueldo){
			this.sueldo = sueldo;
		}
		//getters
		public String getCodigoEmpleado (){
			return this.codigoEmpleado;
		}
		public String getNombre (){
			return this.nombre;
		}
		public String getApellido (){
			return this.apellido;
		}
		public int getEdad (){
			return this.edad;
		}
		public double getSueldo(){
		return this.sueldo;
		}
		//constructor
		Empleado (){
			super();
		}
}
