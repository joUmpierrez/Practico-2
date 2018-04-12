import java.util.*;

public class Operadores 
{
	static Scanner entrada = new Scanner(System.in);
	
	// Consola
	public static void main(String[] args) 
	{
		/*
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
		
		// Ejercicio 4
		System.out.println("Ingrese un numero");
		int numeroE = entrada.nextInt();
		System.out.println("Ingrese un numero");
		int numeroF = entrada.nextInt();
		System.out.print("\n");
		System.out.print("El Maximo Comun Divisor (MCD) entre " + numeroE + " y " + numeroF + " es: " + CalcularMCD(numeroE,numeroF));
		
		// Ejercicio 5
		System.out.println("Ingrese el numerador");
		int numeroG = entrada.nextInt();
		System.out.println("Ingrese el denominador");
		int numeroH = entrada.nextInt();
		System.out.print("\n");
		SimplificarFraccion(numeroG, numeroH);
		
		// Ejercicio 6
		System.out.println("Ingrese un numero");
		int numeroI = entrada.nextInt();
		if (EsCapicua(numeroI))
		{
			System.out.print("El numero " + numeroI + " es Capicua");
			System.out.print("\n");
		}
		else
		{
			System.out.print("El numero " + numeroI + " no es Capicua");
			System.out.print("\n");
		}
		
		// Ejercicio 7
		CapicuasDeCincoCifras();
		System.out.print("\n");
		
		// Ejercicio 8
		// ---> Crearemos un vector con numeros aleatorios <---
		int vector[] = CrearVectorAleatorioNoRepetitivo(100);
		
		// A)
		int numeroJ;
		int numeroK;
		
		do
		{
			System.out.println("Ingrese un numero entre 0 y 99");
			numeroJ = entrada.nextInt();
		}
		while(!(numeroJ >= 0 && numeroJ <= 99));
		
		do
		{
			System.out.println("Ingrese un numero entre 0 y 99");
			numeroK = entrada.nextInt();
		}
		while(!(numeroK >= 0 && numeroK <= 99));

		int maximoDelVector = MaximoDelVector(vector, numeroJ, numeroK);
		
		System.out.print("\n");
		System.out.print("El maximo valor del vector aleatorio es: " + maximoDelVector);
		System.out.print("\n");
		
		// B)
		int numeroL;
		int numeroM;
		
		do
		{
			System.out.println("Ingrese un numero entre 0 y 99");
			numeroL = entrada.nextInt();
		}
		while(!(numeroL >= 0 && numeroL <= 99));
		
		do
		{
			System.out.println("Ingrese un numero entre 0 y 99");
			numeroM = entrada.nextInt();
		}
		while(!(numeroM >= 0 && numeroM <= 99));
		
		int posicionMaximoDelVector = PosicionDelMaximoDelVector(vector, numeroL, numeroM);
		
		System.out.print("\n");
		System.out.print("La posicion del maximo valor del vector aleatorio es: " + posicionMaximoDelVector);
		System.out.print("\n");
		*/
		// Ejercicio 9
		
		// Ejercicio 10
		//int vectorB[] = CrearVectorAleatorio(20);
		
		// Ejercicio 11
		
		
		// Ejercicio 12
		
	}
	
	// Ejercicio 1
	public static boolean EsPrimo(int numero)
	{
		boolean esValido = false;
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

	// Ejercicio 4
	public static int CalcularMCD(int a, int b)
	{
		int mcd;
		int dividendo = Math.max(a, b);
		int divisor = Math.min(a, b);
		
		do
		{
			mcd = divisor;
			divisor = dividendo%divisor;
			dividendo = mcd;
		}
		while(divisor != 0);
		return mcd;
	}
	
	// Ejercicio 5
	public static void SimplificarFraccion(int a, int b)
	{
		int multiplo = CalcularMCD(a, b);
		int numerador = a/multiplo;
		int denominador = b/multiplo;
		
		System.out.println("La Fraccion: " + a + "/" + b + " --- Se convierte en: " + numerador + "/" + denominador);
		System.out.print("\n");
	}
	
	// Ejercicio 6
	public static boolean EsCapicua(int a)
	{
		int numeroInvertido = 0;
		int digitos = a;
		do
		{
			numeroInvertido = numeroInvertido * 10 + digitos%10;
			digitos = digitos/10;
		}
		while(digitos != 0);
		
		return a == numeroInvertido;
	}
	
	// Ejercicio 7
	public static void CapicuasDeCincoCifras()
	{
		int i;
		int e = 1;
		for(i = 10001; i<100000; i++)
		{
			if(EsCapicua(i))
			{
				System.out.println("Capicua N°" + e + " -----> " + i);
				e++;
			}
		}
	}
	
	// Ejercicio 8
	// Crear un vector con numeros aleatorios no repetitivos diferentes a 0
	public static int[] CrearVectorAleatorioNoRepetitivo(int cantidadValores)
	{
		int vectorAleatorio[] = new int[cantidadValores];
		
		int aleatorio;
		boolean existe = false;
		int e;
		int i;
		for(i = 0; i<cantidadValores; i++)
		{
			existe = false;
			do
			{
				aleatorio = (int) (Math.random()*32);
				
				for(e = 0; e<vectorAleatorio.length; e++)
				{
					if(vectorAleatorio[e] == aleatorio)
					{
						existe = true;
					}
					else
					{
						existe = false;
					}
				}
			}
			while(aleatorio == 0 && existe == true);
			
			vectorAleatorio[i] = aleatorio;
		}
		
		return vectorAleatorio;
	}
	
	// // Crear un vector con numeros aleatorios diferentes a 0
	public static int[] CrearVectorAleatorio(int cantidadValores)
	{
		int vectorAleatorio[] = new int[cantidadValores];
		int aleatorio;
		int i;
		for(i = 0; i<cantidadValores; i++)
		{
			do
			{
				aleatorio = (int) (Math.random()*32);
			}
			while(aleatorio == 0);
			vectorAleatorio[i] = aleatorio;
		}
		
		return vectorAleatorio;
	}

	// A)
	public static int MaximoDelVector(int v[], int desde, int hasta)
	{
		int maximo = 0;
		int i;
		desde = Math.min(desde, hasta);
		hasta = Math.max(desde, hasta);
		
		for(i = desde; i <= hasta; i++)
		{
			if(v[i] > maximo)
			{
				maximo = v[i];
			}
		}
		
		return maximo;
	}
	
	// B)
	public static int PosicionDelMaximoDelVector(int v[], int desde, int hasta)
	{
		int posicionMaximo = 0;
		desde = Math.min(desde, hasta);
		hasta = Math.max(desde, hasta);
		int valorMaximo = MaximoDelVector(v, desde, hasta);
		int e;
		int i;
		
		for(i = desde; i <= hasta; i++)
		{
			if (v[i] == valorMaximo)
			{
				posicionMaximo = i;
			}
		}
		
		return posicionMaximo;
	}

	// Ejercicio 9
	
	
	// Ejercicio 10
	// A)
	public static int PromedioDeVector(int[] v)
	{
		int promedio;
		int suma = 0;
		int i;
		
		for(i = 0; i<v.length; i++)
		{
			suma += v[i];
		}
		promedio = suma / v.length;
		
		return promedio;
	}
	
	// B)
	
			
	// Ejercicio 11
			
			
	// Ejercicio 12
			
}
