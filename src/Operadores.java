import java.util.*;

public class Operadores 
{
	static Scanner entrada = new Scanner(System.in);
	
	// Consola
	public static void main(String[] args) 
	{
		// Ejercicio 1
		System.out.println("Ingrese un numero");
		int numeroA = entrada.nextInt();
		System.out.print("\n");
		if(EsPrimo(numeroA))
		{
			System.out.println("Es un numero Primo");
		}
		else
		{
			System.out.println("No es un numero primo");
		}
		System.out.print("\n");
		
		// Ejercicio 2
		System.out.println("Ingrese un numero");
		int numeroB = entrada.nextInt();
		System.out.print("\n");
		System.out.println("El proximo numero primo es: " + PrimoMasCercano(numeroB));
		System.out.print("\n");
		
		// Ejercicio 3
		System.out.println("Ingrese un numero");
		int numeroC = entrada.nextInt();
		System.out.println("Ingrese un numero");
		int numeroD = entrada.nextInt();
		System.out.print("\n");
		RestoYCociente(numeroC, numeroD);
	}
	
	// Ejercicio 1
	public static Boolean EsPrimo(int numero)
	{
		Boolean esValido = false;
		int contador = 0;
		int i;
		
		if (!(numero == 1))
		{
			for(i = 1; i <= numero; i++)
	        {
	            if((numero % i) == 0)
	            {
	                contador++;
	            }
	        }
			
			if(contador <= 2)
	        {
	            esValido = true;
	        }
		}
		
		
		return esValido;
	}

	// Ejejrcicio 2
	public static int PrimoMasCercano(int numero)
	{
		int primo = 0;
		int ultValor = numero+1;
		
		do
		{
			if (EsPrimo(ultValor))
			{
				primo = ultValor;
			}
			else
			{
				ultValor++;
			}
					
		}
		while (!EsPrimo(ultValor));
		
		return primo;
	}
	
	// Ejercicio 3
	public static void RestoYCociente(int numA, int numB)
	{
		int cociente = 0;
		int resto = numA;
		boolean positivo = true;
		
		if (numA < numB)
		{
			System.out.println("Resto - 0");
			System.out.println("Cociente - 0");
			System.out.print("\n");
			
		}
		else
		{
			do
			{
				if((resto - numB >= 0))
				{
					cociente++;
					resto = resto - numB;
				}
				else
				{
					positivo = false;
				}
			}
			while(positivo == true);
			
			System.out.println("Resto - " + resto);
			System.out.println("Cociente - " + cociente);
			System.out.print("\n");
		}
	}

	// Ejejrcicio 
}
