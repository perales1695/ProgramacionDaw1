import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opc;
		Libro libros[] = null;
		Autor autores[] = null;
		int numLibros;
		Scanner t=new Scanner(System.in);
		do{
			menu();
			opc=Leer.pedirEntero("Elija una opcion");
			switch(opc){
			case 1:
				String titulo;
				double precio;
				int cantidad;
				int numAutor,contaErrores=0;

				String nombre,correo,genero = null;
				numLibros=Leer.pedirEntero("Cuantos libros quieres crear ?.");
				libros=new Libro[numLibros];
				numAutor=Leer.pedirEntero("Cuantos autores tendra el libro");
				autores =new Autor[numAutor];
				for(int indice=0;indice<numLibros;indice++){
					titulo=Leer.pedirCadena("titulo del libro "+numLibros);
					for(int k=0;k<numAutor;k++){
						nombre=Leer.pedirCadena("Introduzca el nombre del autor");
						correo=Leer.pedirCadena("Introduzca el correo del autor");
						do{
							genero=Leer.pedirCadena("Introduzca el genero del autor Hombre (H) Mujer (M)");
						}while(validarGenero(genero)==false);

						autores[k]=new Autor(nombre,correo,genero);
						precio=Leer.pedirDouble("Introcuzca el precio del libro");
						cantidad=Leer.pedirEntero("Cuantos libros de estos tendr�");
						libros[indice]=new Libro(titulo,autores,precio,cantidad);
					}
				}

				break;
			case 2:

				String nombreAutor;
				nombreAutor=Leer.pedirCadena("Introduce el nombre del autor que quiere modificar");
				String nuevoNombre,nuevoCorreo;
				char nuevoGenero;

				String nuevoGeneroString = null;
				for(int indice=0;indice<autores.length;indice++){
					if(autores[indice].getNombre().equals(nombreAutor)){

						modificarAutor();
						opc=Leer.pedirEntero("");
						if(opc==1){

							nuevoNombre=Leer.pedirCadena("Introduzca el nuevo nombre");
							autores[indice].setNombre(nuevoNombre);
						}
						if(opc==2){
							nuevoCorreo=Leer.pedirCadena("Introduzca el nuevo correo");
							autores[indice].setCorreo(nuevoCorreo);
						}
						if(opc==3){
							do{
								nuevoGeneroString=Leer.pedirCadena("Introduzca el nuevo genero del autor Hombre (H) Mujer (M)");
								nuevoGenero=nuevoGeneroString.charAt(0);
							}while(validarGenero(nuevoGeneroString)==false);
							autores[indice].setGenero(nuevoGenero);
						}
					}else{
						Leer.mostrarEnPantalla("El "+nombreAutor+" no existe");
					}
				}//for para recorrer 

				break;
			case 4:
				for(int i=0;i<libros.length;i++){
					System.out.println(libros[i].cadenaLibro());
				}
				break;
			}
		}while(opc!=0);
		t.close();

	}//main
	public static  void menu (){
		System.out.println("1 - Crear libros");
		System.out.println("2 - Modificar Autor");
		System.out.println("3 - Modificar libro");
		System.out.println("4 - Listado de libros");
		System.out.println("5 - Listado de autores");
		System.out.println("0 - Salir");

	}
	public static void modificarAutor(){

		System.out.println("1 - Modificar nombre del Autor");
		System.out.println("2 - Modificar el correo del autor");
		System.out.println("3 - Modificar el genero del autor/a");
	}
	public static boolean validarGenero(String caracter){

		boolean correcto=false;
		int contador=0;
		if(caracter.equalsIgnoreCase("M") || caracter.equalsIgnoreCase("H")){ // letra.equalsIgnoreCase("H")){

		}else{
			contador++;
			Leer.mostrarEnPantalla("Elije M � H");
		}
		if(contador==0){
			correcto=true;
		}else{
			correcto=false;
		}

		return correcto;
	}
}//class