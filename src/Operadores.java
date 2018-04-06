import java.util.*;

public class Operadores 
{
	static Scanner entrada = new Scanner(System.in);
	
	// Consola
	public static void main(String[] args) 
	{
		// Ejercicio 1
		System.out.println("Ingrese un numero");
		int numeroPrimo = entrada.nextInt();
		System.out.print("\n");
		if(EsPrimo(numeroPrimo))
		{
			System.out.println("Es un numero Primo");
		}
		else
		{
			System.out.println("No es un numero primo");
		}
		
		// Ejercicio 2
	}
	
	// Ejercicio 1
	public static Boolean EsPrimo(int numero)
	{
		Boolean esValido = false;
		int contador = 0;
		int i;
		
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
		
		return esValido;
	}


}
