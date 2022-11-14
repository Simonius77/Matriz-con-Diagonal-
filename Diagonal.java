/** Exercici 4
Fes un programa que:
●	Demani un nombre enter positiu
●	Dibuixi un quadrat amb una línia diagonal que divideixi el quadrat en dos triangles iguals

Exemples:
Dona’m un enter positiu: 5
*++++
+*+++
++*++
+++*+
++++*	Dona’m un enter positiu: 4
*+++
+*++
++*+
+++*

**/
/** matriz donde i son las filas y j las columnas**/

import java.util.Scanner;
public class Diagonal {
	/**iniciamos programa principal by Simonius**/
	public static void main (String [] args){
		System.out.println("Introduce un numero positivo para trazar la diagonal");
		Scanner scan=new Scanner(System.in);
		int opcion = scan.nextInt();
		if(opcion >0){
			for(int i=1; i<=opcion; i++){;
				for(int j=1; j<=opcion; j++){
					if(i==j){
					System.out.print("*");
					}else {
						System.out.print("+");
					}
				}
			/** Salto de linea para imprimir la piramide**/
			System.out.println();
				}
		}else {
				System.out.println(" Error el numero introducido es negativo");	
		}			
	}	
	
}	