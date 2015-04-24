


public class cola_con_pila {
		
		public cola_con_pila(){
			pila Pila1=new pila();
		    pila Pila2=new pila();
		       
				System.out.println("COLA CON PILAS");

				Pila1.push("1 : Primero en ingresar");
				Pila1.push("2 : Dato que queda en el medip ");
				Pila1.push("3 : Ultimo en ingresar");
				
				
				System.out.println("Ultimo dato "); 
				System.out.println(Pila1.peek());
				

				System.out.println(); 
				
				Pila2.push(Pila1.pop());
				Pila2.push(Pila1.pop());
				Pila2.push(Pila1.pop());
				
				
				System.out.println("Salida"); 
				System.out.println();
				
				while(Pila2.empty()==false){ 
					System.out.println(Pila2.pop()); 
				}
			
		}
		
		public static void main(String[] args) {			
				cola_con_pila Cola = new cola_con_pila();
			}

	

}
