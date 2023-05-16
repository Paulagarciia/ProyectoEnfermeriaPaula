import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Esta es la clase principal de mi proyecto de enfermería para la clase tic II. 
		// Es un programa para calcular la composición corporal de una persona 
		// en función de su índice de masa corporal.
				
				
			    // Introducción de los datos

		        Scanner n1 = new Scanner(System.in);
		        System.out.println("Ingrese la altura (en cm): ");
		        double altura = n1.nextDouble();

		        Scanner n2 = new Scanner(System.in);
		        System.out.println("Ingrese el peso (en kg): ");
		        double peso = n2.nextDouble();

		        //Calcular IMC de una persona (peso entre la altura al cuadrado)
			    
		        double IMC = peso / ((altura/100)*(altura/100));

		        System.out.println("Su IMC es " + IMC);
			        
		        //Calcular la composición corporal de la persona
			        
		        if (IMC < 18.5) 
		        {
		        	System.out.println("El paciente tiene un peso inferior al normal");
		        }
		        else if ((IMC >= 18.5) && (IMC <= 24.9))
		        {
		        	System.out.println("El paciente tiene un peso normal");
		        }
		        else if ((IMC >= 25) && (IMC <= 29.9))
		        {
		        	System.out.println("El paciente tiene un peso superior al normal");
		        }
		        else if (IMC > 30)
		        {
		        	System.out.println("El paciente padece obesidad");
		        }
			   
		        
		        // Calcular el valor de la superficie corporal de la persona y la dosis 
				// de medicamento que se debe administrar en función de ese valor.
				        
				Scanner n3 = new Scanner(System.in);
				System.out.println("Ingrese la dosis del fármaco en mg/kg: ");
				double dosis = n3.nextDouble();
				        
				        
				double superficie_corporal;
				double dosis_a_administrar;
				        
			    // Calcular la superficie corporal para los menores de 10 kg
			    if (peso <= 10);
				{
					superficie_corporal = ((peso * 4) + 9) / 100;
				}   
				     	
				// Calcular la superficie corporal para los mayores de 10 kg
				if (peso > 10);
				{
					superficie_corporal = ((peso * 4) + 7) / (peso + 90);
				}

				// Calcular la dosis a administrar en función de la superficie corporal
				dosis_a_administrar = dosis * superficie_corporal;

				System.out.println("La superficie corporal es de " + superficie_corporal + " m2");
				System.out.println("La dosis a administrar es de " + dosis_a_administrar + " mg");		
		
				
	}

}
