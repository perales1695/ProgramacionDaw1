import java.util.Random;
import java.util.Scanner;

public class Ejer42 {

	public static void main(String[] args) {
		/*
		 * 42.-Una empresa guarda en una tabla de 3x12x4 las ventas realizadas por sus tres
		representantes a lo largo de doce meses de sus cuatro productos, VENTAS [representante,
		mes, producto]. Queremos proyectar el array tridimensional sobre uno de dos dimensiones que
		represente el total de ventas, TOTAL [mes, producto], para lo cual sumamos las ventas de
		cada producto de cada mes de todos los representantes. Imprimir ambos arrays.
		 */
		//Scanner teclado = new Scanner (System.in);
		Random azar=new Random();
		int num;
		String vecEmple[]={"Emple 1 ","Emple 2","Emple 3"};

		String meses[]={"enero","Febrero","Marzo","Abril","Mayo","Junio",
				"Julio","Agosto","Septiembre","Octubre","Noviembre","Dciembre"};

		String productos[]={"Cerveza","Pan","Coca Cola","Fanta"};

		String vecVenta[][][]= new String[3][12][4];
		int k,i,j;
		for(k=0;k<3;k++){

			for(i=0;i<12;i++){
				for(j=0;j<4;j++){
					vecVenta[k][i][j]=vecEmple[azar.nextInt(3)]+" "+meses[azar.nextInt(12)]+" "+productos[azar.nextInt(4)];
				}//tercer for
			}//segundo for
		}//primer for
int cont;
cont=0;
		for(k=0;k<3;k++){

			for(i=0;i<12;i++){
				for(j=0;j<4;j++){
					System.out.print(vecVenta[k][i][j]+" ");
				}//tercer for
				System.out.println();
			}//segundo for
			System.out.println();
		}//primer for

	}//main

}//class
