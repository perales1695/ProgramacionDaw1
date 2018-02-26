
public class Comedor {
	/**
	 * 3.- 		Escribe un proyecto en Java que tenga:
			Una clase llamada Comedor en la que estará el método public static void main() y en la que se instanciarán
			los objetos de las clases que sean necesarias para:
		 Mostrar la carta de un restaurante en el que se ofrecen 6 platos. En cada plato se visualizarán los
			ingredientes que lo componen y el precio de ese plato.
		 Se supone que en el restaurante se pueden servir en un día un máximo de 100 menús. Cada menú
			consta de dos platos; a la bebida y al postre invita la casa.
		 A la hora de pagar se mostrará en pantalla: el detalle de los menús que tiene que pagar, indicando
			el precio de cada plato y el de cada menú, el total a pagar, el dinero entregado y el cambio. Nota:
			para cada mesa ocupada se anotará el número de menús y qué platos han formado cada uno.
		 Identificar clases atributos y métodos necesarios para la solución de este ejercicio.
	 * @param args
	 */
	public static void menu(){
		System.out.println(" 1 - Crear Plato");
		System.out.println(" 2 - Mostrar Plato");
		System.out.println(" 3 - Ver menu");
		/*System.out.println(" 4 - ");
		System.out.println(" 5 - ");*/
		System.out.println(" 0 - Salir");
	}
	public static void main(String[] args) {
		Menu menu[]=new Menu[100];
		Restaurante rest[]=new Restaurante[(menu.length*2)];
		int opc;
		do{
			menu();
			opc=Libreria.pedirEntero("Elije un opcion");
			switch(opc){
			case 1:
				crearPlato(rest);
				break;
			case 2:
				verPlato(rest);
				break;

			case 3:
				for(int i=0;i<menu.length;i++){
					
				}
				break;
			}
		}while(opc!=0);
	}//main
	public static void crearPlato(Restaurante rest[]){
		Ingredientes ingre;//=new Ingredientes(null, 0);

		for(int i=0;i<rest.length;i++){			
			ingre=new Ingredientes(Libreria.ingredientesAzar(),Libreria.enteroAzar(1, 5)
					,Libreria.ingredientesAzar(),Libreria.enteroAzar(1, 5),Libreria.ingredientesAzar(),Libreria.enteroAzar(1, 5));
			rest[i]=new Restaurante(Libreria.enteroAzar(20, 50),ingre,Libreria.nombrePlatosAzar(),Libreria.bebidadAzar(),Libreria.postreAzar());
			//menu[i]=new Menu(rest[i],Libreria.enteroAzar(30, 50),Libreria.postreAzar());
		}
	}
	public static void verPlato(Restaurante rest[]){
		//rest=new Restaurante[100];
		if(rest[0]==null){
			System.out.println("No hay platos para mostrar");
		}else{
			for(int i=0;i<rest.length;i++){
				System.out.println("Menu Nº: "+(i+1));
				rest[i].verCarta();
				rest[i+1].verCarta();
				i=i+2;
			}
		}
	}
	public static void verMenu(Menu menu[]){
		for(int i=0;i<menu.length;i++){
			
		}
	}
}//class