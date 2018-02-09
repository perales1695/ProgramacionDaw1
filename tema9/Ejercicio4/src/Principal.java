
public class Principal {

	public static void main(String[] args) {
		int edad,porcentaje,plus,numEmple,numJefe,opc,nuevoPlus;
		String nombreEmple,nombreEmpresa,nombreDepart;
		double sueldo,nuevoSueldo;
		Empleado emple[];
		Jefe jefe[];
		nombreEmpresa="El�ctrica, SA";
		sueldo=1000;
		Leer.mostrarEnPantalla("Los empleados trabajan en: "+nombreEmpresa);
		System.out.println("Y tienen un sueldo fijo de: "+sueldo);
		System.out.println("----------------------------------------------------");
		numEmple=Leer.pedirEntero("Cuantos empleados quiere crear");
		numJefe=Leer.pedirEntero("Cuantos jefes quiere crear");
		emple=new Empleado[numEmple];
		jefe=new Jefe[numJefe];
		for(int i=0;i<emple.length;i++){
			nombreEmple=Leer.pedirCadena("Introduzca el nombre del empleado");
			edad=Leer.pedirEntero("Introduce la edad del empleado");
			porcentaje=Leer.pedirEntero("Introduzca el porcentaje de aumento del empleado");
			emple[i]=new Empleado(nombreEmple,nombreEmpresa,edad,sueldo,porcentaje);
		}
		for(int i=0;i<jefe.length;i++){
			nombreEmple=Leer.pedirCadena("Introduzca el nombre del jefe");
			edad=Leer.pedirEntero("Introduce la edad del jefe");
			porcentaje=Leer.pedirEntero("Introduzca el porcentaje de aumento del jefe");
			plus=Leer.pedirEntero("Introduce el plus del jefe");
			nombreDepart=Leer.pedirCadena("Introduce el nombre del departamento");
			jefe[i]=new Jefe(nombreEmple,nombreEmpresa,edad,sueldo,porcentaje,plus,nombreDepart);
		}do{
			menu();
			opc=Leer.pedirEntero("Elije una opci�n");
			switch(opc){
			case 1:
				System.out.println("Vamos a modificar el sueldo base de todo los empleados");
				nuevoSueldo=Leer.pedirDouble("Introduce el nuevo saldo");
				for(int i=0;i<emple.length;i++){
					emple[i].setSueldoBase(nuevoSueldo);
				}
				for(int i=0;i<jefe.length;i++){
					jefe[i].setSueldoBase(nuevoSueldo);
				}
				break;
			case 2:
				System.out.println("Vamos a modificar el plus de todos los jefes");
				nuevoPlus=Leer.pedirEntero("Introduce el nuevo plus de los jefes");
				for(int i=0;i<jefe.length;i++){
					jefe[i].setPlus(nuevoPlus);
				}
				break;
			case 3:
				for(int i=0;i<emple.length;i++){
					System.out.println("INFORMACION DEL EMPLEADO "+(i+1));
					emple[i].infoEmpleado();
					System.out.println("Sueldo total: "+emple[i].sueldoTotalEmpleado());
				}
				for(int i=0;i<jefe.length;i++){
					System.out.println("INFORMACION DEL JEFE "+(i+1));
					jefe[i].infoJefe();
					System.out.println("Sueldo total: "+jefe[i].sueldoTotalJefe());
				}
				break;
				
			}
		}while(opc!=0);
		
	}//main
	public static void menu(){
		Leer.mostrarEnPantalla("1 - Modificar el sueldo base de todo los empleado");
		Leer.mostrarEnPantalla("2 - Modificar e plus de todos los jefes");
		Leer.mostrarEnPantalla("3 - Visualizar los datos de todos los empleados");
		Leer.mostrarEnPantalla("0 - ");
	}

}//class