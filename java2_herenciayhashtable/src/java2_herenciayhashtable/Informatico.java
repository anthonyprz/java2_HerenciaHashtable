package java2_herenciayhashtable;

	public class Informatico extends Empleado {
		String especialidad;
		int a�osEnEmpresa;
		
		//constructor
		public Informatico (){}
		
		//setters
		public void setEspecialidad (String especialid){
			this.especialidad = especialid;
		}
		public void setA�osEnEmpresa (int a�osEmpresa){
			this.a�osEnEmpresa = a�osEmpresa;
		}
		//getters
		public String getEspecialidad (){
			return this.especialidad;
		}
		public int getA�osEnEmpresa (){
			return this.a�osEnEmpresa;
		}
}

