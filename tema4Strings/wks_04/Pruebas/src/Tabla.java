import java.util.*;
public class Tabla {

	public static void main(String[] args) {
	 
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		// TODO Auto-generated method stub
 
		int num, suma;/* 
		System.out.println("introduce un numero");
			num=teclado.nextInt();
			for(i=1;i<=num;i++){
				System.out.println(num+" * "+ i+" = "+num*i);
			}*/ 
		
		System.out.println("introduce un numero");
			num=teclado.nextInt(); 
			suma=0;
			suma=suma+num;
			while (num!=0){
				System.out.println("introduce un numero");
				num=teclado.nextInt();
				suma=suma+num;

			}

			System.out.println("numero introducido: "+suma);
			 
		int tabla[][]=new int [5][5];
		int k, j;
			for (k=0;k<5;k++){
				for(j=0;j<5;j++){
					tabla[k][j]=(int)(Math.random()*9+1);
					
				}
			}
			for (k=0;k<5;k++){
				for(j=0;j<5;j++){
					System.out.print(tabla[k][j]+" ");
					
					
				}
				System.out.println();
			} 
		
	}

}
