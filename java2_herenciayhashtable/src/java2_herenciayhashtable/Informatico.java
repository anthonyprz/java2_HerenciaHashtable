package java2_herenciayhashtable;

	public class Informatico extends Empleado {
		String especialidad;
		int aņosEnEmpresa;
		
		//constructor
		public Informatico (){}
		
		//setters
		public void setEspecialidad (String especialid){
			this.especialidad = especialid;
		}
		public void setAņosEnEmpresa (int aņosEmpresa){
			this.aņosEnEmpresa = aņosEmpresa;
		}
		//getters
		public String getEspecialidad (){
			return this.especialidad;
		}
		public int getAņosEnEmpresa (){
			return this.aņosEnEmpresa;
		}
}

