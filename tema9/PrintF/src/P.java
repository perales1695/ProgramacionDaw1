import java.util.Random;

public class P {

	public static void main(String[] args) {
		Random a=new Random();
		String marca[]={"Opel", "Ford", "Chevrolet", "Nissan", "Jaguar", "Renault", "Audi", "BMW", "Toyota", "Suzuki", "Citroen","Mini", 
				"Jeep", "Mazda", "Mercedes", "Mitsubishi","Koenigsegg","Lamborghini","Ferrari","Porsche"};
		String modelo[]={"Modelo1A", "Modelo2A", "Modelo3A", "Modelo4A", "Modelo5A", "Modelo6A",
				"Modelo1B", "Modelo2B", "Modelo3B", "Modelo4B", "Modelo5B", "Modelo6B"};
		//ystem.out.printf("%4s","");
		for(int i=0;i<10;i++){
			System.out.print(marca[a.nextInt(marca.length)]);
			System.out.printf("%20s ","");
			System.out.print(modelo[a.nextInt(modelo.length)]);
			System.out.println();
		}
		
	}

}
