package java2_herenciayhashtable;
import java.util.Hashtable;
import java.util.Scanner;

public class InformacionDeEmpleados {
	public static void main (String [] args){
		String codigoInf, nomb, ape, espe;
		int eda, añosEmp;
		double sueld;

			Informatico informatico = new Informatico();
			Scanner sc = new Scanner (System.in);
			Hashtable<String,String> hash = new Hashtable<String,String>();

			
			
				System.out.println("----------------para informatico--------------------");
				System.out.println("ingresa el codigo del empleado informatico");
				codigoInf = sc.next();
				informatico.setCodigoEmpleado(codigoInf);		
				System.out.println("ingresa el nombre del empleado informatico");
				nomb = sc.next();
				informatico.setNombre(nomb);
				System.out.println("ingresa el apellido del empleado informatico");
				ape = sc.next();
				informatico.setApellido(ape);
				System.out.println("ingresa la edad del empleado informatico");
				eda = sc.nextInt();
				informatico.setEdad(eda);
				System.out.println("ingresa el sueldo del empleado informatico");
				sueld = sc.nextDouble();
				informatico.setSueldo(sueld);
				System.out.println("ingresa la especialidad del empleado informatico");
				espe = sc.next();
				informatico.setEspecialidad(espe);
				System.out.println("¿cuantos años tiene trabajando en la empresa?");
				añosEmp = sc.nextInt();
				informatico.setAñosEnEmpresa(añosEmp);
				double sueldoAños;
				sueldoAños = sueld * añosEmp;
				
				//----------------hastable---------------
				hash.put("a", informatico.getCodigoEmpleado());
				hash.put("b", informatico.getNombre());
				hash.put("c", informatico.getApellido());
				Integer num = new Integer(informatico.getEdad());
				hash.put("d", num.toString());
				Double doubl = new Double(informatico.getSueldo());
				hash.put("e", doubl.toString());
				hash.put("f", informatico.getEspecialidad());
				Double doubl2 = new Double(informatico.getAñosEnEmpresa());
				hash.put("g", doubl2.toString());
				Double doubl3 = new Double(sueldoAños);
				hash.put("x", doubl3.toString());
				
				//mostrar
				System.out.println("<><><><><><><><><>informacion del empleado<><><><><><><><><>");
				System.out.println("codigo del empleado: "+hash.get("a"));
				System.out.println("nombre: "+hash.get("b"));
				System.out.println("apellido: "+hash.get("c"));
				System.out.println("edad: "+hash.get("d"));
				System.out.println("sueldo: "+hash.get("e"));
				System.out.println("especialidad: "+hash.get("f"));
				System.out.println("años en empresa: "+hash.get("g"));
				System.out.println("estas son las ganancias desde que ha empezado a trabajar: " +hash.get("x")+ "€");
		}

	
}