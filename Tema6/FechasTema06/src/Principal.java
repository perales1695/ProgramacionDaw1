import java.text.ParseException;
import java.util.*;
public class Principal {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Calendar fecha=new GregorianCalendar();
		Scanner teclado=new Scanner(System.in);
		Integer dia;
		Integer mes;
		Integer a�o;
		Integer dia2;
		Integer mes2;
		Integer a�o2;
		dia=fecha.get(Calendar.DAY_OF_MONTH);
		mes=fecha.get(Calendar.MONTH)+1;
		if(mes>12){
			mes=12;
		}
		a�o=fecha.get(Calendar.YEAR);
		System.out.println(dia+" "+mes+" "+a�o);
		Fecha hoy=new Fecha(dia,mes,a�o);

		System.out.println(hoy.esBisiesto()+" .... bisiesto");
		System.out.println(hoy.esCorrecta()+" .... fecha ");
		hoy.getCadenaMes(); 
		hoy.getDiaMes();

		hoy.getCadenaFecha1();
		hoy.getCadenaFecha2();
		/*System.out.println("Introduzca una fecha v�lida");
		do{
			System.out.println("Introduzca el d�a");
			dia2=teclado.nextInt();
		}while(dia2>31 ||   dia2 <1);
			
		System.out.println("Introduzca el mes");
		mes2=teclado.nextInt();
		while(mes2>12 || mes2 <1){
			System.out.println("Introduzca el mes");
			mes2=teclado.nextInt();
		}
		System.out.println("Introduzca el a�o");
		a�o2=teclado.nextInt();
		String a�oString = null;
		a�oString+=a�o2;
		while(a�oString.length()<4){
			System.out.println("Introduzca el a�o");
			a�o2=teclado.nextInt();
			a�oString+=a�o2;
		}
		Fecha hoy2=new Fecha(dia2,mes2,a�o2);*/
		System.out.println("FECHA INTRODUCIDA MANUALMENTE");
		System.out.println(hoy.esBisiesto()+" .... bisiesto");
		System.out.println(hoy.esCorrecta()+" .... fecha ");
		hoy.getCadenaMes(); 
		hoy.getDiaMes();
		
		hoy.getCadenaFecha1();
		hoy.getCadenaFecha2();
		hoy.diferenciaFecha(hoy);
		teclado.close();
	}//main

}//class
