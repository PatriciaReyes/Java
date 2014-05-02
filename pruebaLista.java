public class pruebaLista{
	
	public static void main(String Args[]){
		Lista Sujeto = new Lista("Hola");
		Lista Sujeto1 = new Lista("Como estas",Sujeto);
		Lista Sujeto2 = new Lista("Bien",Sujeto1);
		Lista Sujeto3 = new Lista("Adios",Sujeto2);
		Lista Sujeto4 = new Lista("Chao",Sujeto3);
		Lista Sujeto5 = new Lista("Casa", Sujeto);
		Lista Sujeto6 = new Lista("Lampara",Sujeto5);
		
		//Imprime Lista Sujeto
		System.out.println("\nSUJETO");
		while (Sujeto!=null){
			System.out.print(Sujeto.getPalabra()+" - ");
			Sujeto=Sujeto.getLista();
		};
		
		//Imprime Lista Sujeto1
		Sujeto = new Lista("Hola");
		System.out.println("\n\nSUJETO 1");
		while (Sujeto1!=null){
			System.out.print(Sujeto1.getPalabra()+" - ");
			Sujeto1=Sujeto1.getLista();
		};
		
		//Imprime Lista Sujeto2
		Sujeto1 = new Lista("Como estas",Sujeto);
		System.out.println("\n\nSUJETO 2");
		while (Sujeto2!=null){
			System.out.print(Sujeto2.getPalabra()+" - ");
			Sujeto2=Sujeto2.getLista();
		};
		
		//Imprime Lista Sujeto3
		Sujeto2 = new Lista("Bien",Sujeto1);
		System.out.println("\n\nSUJETO 3");
		while (Sujeto3!=null){
			System.out.print(Sujeto3.getPalabra()+" - ");
			Sujeto3=Sujeto3.getLista();
		};
		
		Sujeto3 = new Lista("Adios",Sujeto2);
		System.out.println("\n\nPRUEBA PERTENECE");
		System.out.println("   Veamos si 'Bien' pertenece a la lista 4 : "+Sujeto3.agregar("Bien"));
		System.out.println("Para poder agregar a alguna lista una palabra, debemos verificar que esta no pertenece a la lista.\n   Veamos si 'LaLaLa' pertenece a la lista 4 : "+Sujeto4.agregar("LaLaLa"));
		
		//Imprime Lista Sujeto4 (Despues de haber insertado LaLaLa)
		Sujeto4 = Sujeto4.insertar("LaLaLa");
		System.out.println("\n\nSUJETO 4 // Despues de haber insertado LaLaLa");
		while (Sujeto4!=null){
			System.out.print(Sujeto4.getPalabra()+" - ");
			Sujeto4=Sujeto4.getLista();
		};
		
		//Imprime Lista Sujeto7 (Interseccion de las lista Sujeto2 con Sujeto4)
		Sujeto4 = new Lista("Chao",Sujeto3);
		System.out.println("\n\nINTERSECCION");
		Lista Sujeto7 = new Lista();
		Sujeto7 = Sujeto7.interseccion(Sujeto4, Sujeto6);
		System.out.println("Interseccion de las lista Sujeto2 con Sujeto4. ");
		System.out.print("\nSUJETO 7\n");
		while (Sujeto7!=null){
			System.out.print(Sujeto7.getPalabra()+" - ");
			Sujeto7=Sujeto7.getLista();
		}
	}
}	


	