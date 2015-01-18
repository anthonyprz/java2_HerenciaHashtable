package java2_herenciayhashtable;

	public class Informatico extends Empleado {
		String especialidad;
		int añosEnEmpresa;
		
		//constructor
		public Informatico (){}
		
		//setters
		public void setEspecialidad (String especialid){
			this.especialidad = especialid;
		}
		public void setAñosEnEmpresa (int añosEmpresa){
			this.añosEnEmpresa = añosEmpresa;
		}
		//getters
		public String getEspecialidad (){
			return this.especialidad;
		}
		public int getAñosEnEmpresa (){
			return this.añosEnEmpresa;
		}
}

