class Group {
  private int[] Group;
  
  // Constructor
		public Group(int N){
      Group = new int[N];
		}
}

public class Lista {
	// Lista que alamcena direcciones.
	private String Palabra;
	private Lista Next; 
		
		// Constructor (Lista Vacia)
		public Lista(){
		    Palabra = ""; 
			Next = null;
		}

		// Constructor con un solo elemento
		public Lista(String palabra){
		    this.Palabra = palabra;
			this.Next = null;
		}
		
		// Constructor 
		public Lista(String palabra, Lista lista){
		    this.Palabra = palabra;
			this.Next = lista;
		}
		
		// Inserta el valor en la lista en el caso de que dicho valor no se encuenre previaemente en la lista (El valor de la pagina)
		public boolean agregar(String palabra){
			Lista aux = this.Next;
			if (this != null){
				if (this.Palabra.equals(palabra)){return true;}
				while (aux != null){
					if (aux.Palabra.equals(palabra)){ return true;}
				    else {aux = aux.Next;}
				};
			}
			return false;
		}
		
		// Devuelve la palabra en la lista que se esta buscando
		public String getPalabra(){
		    return Palabra;
		}	
		
		// Devuelve la lista que se esta revisando
		public Lista getLista(){
		    return Next;
		}	
		
		// Inserta un nuesvo String a la lista
		public Lista insertar(String palabra){	
			Lista aux = this;
			if (this.agregar(palabra) == false){  aux = new Lista(palabra,this);}
		return aux;	
		}
		
		// Intercecta dos listas, y los pone en una lista nueva. Si los elementos se repiten, los coloca una sola vez
		// Proporciona la posibilidad de realizar la consulta sobre mas de una palabra, con lo que la lista de palabra seran aquella en las que aparezcan todas las palabras consultadas.
		public Lista interseccion(Lista lista1, Lista lista2){
		    Lista aux = new Lista();
			while (lista1 != null){
				if (lista2.agregar(lista1.Palabra)){
					aux = aux.insertar(lista1.Palabra);
				};
				lista1 = lista1.Next;
			};
			return aux;
	    }
}