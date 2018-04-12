import java.util.*;

public class Operadores 
{
	static Scanner entrada = new Scanner(System.in);
	
	// Consola
	public static void main(String[] args) 
	{
		
		// Ejercicio 1
		System.out.println("Ejercicio 1 - Numeros Primos");
		System.out.print("\n");
		
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
		System.out.print("-----------------------------------------");
		System.out.print("\n");
		
		
		// Ejercicio 2
		System.out.println("Ejercicio 2 - Primo Mayor mas cercano");
		System.out.print("\n");
		
		System.out.println("Ingrese un numero");
		int numeroB = entrada.nextInt();
		System.out.print("\n");
		System.out.println("El proximo numero primo es: " + PrimoMasCercano(numeroB));
		System.out.print("-----------------------------------------");
		System.out.print("\n");
		
		
		// Ejercicio 3
		System.out.println("Ejercicio 3 - Dividir usando sumas y restas");
		System.out.print("\n");
		
		System.out.println("Ingrese un numero");
		int numeroC = entrada.nextInt();
		System.out.println("Ingrese un numero");
		int numeroD = entrada.nextInt();
		System.out.print("\n");
		RestoYCociente(numeroC, numeroD);
		System.out.print("-----------------------------------------");
		System.out.print("\n");
		
		
		// Ejercicio 4
		System.out.println("Ejercicio 4 - Calcular el Maximo Comun Divisor");
		System.out.print("\n");
		
		System.out.println("Ingrese un numero");
		int numeroE = entrada.nextInt();
		System.out.println("Ingrese un numero");
		int numeroF = entrada.nextInt();
		System.out.print("\n");
		System.out.print("El Maximo Comun Divisor (MCD) entre " + numeroE + " y " + numeroF + " es: " + CalcularMCD(numeroE,numeroF));
		System.out.print("\n");
		System.out.print("-----------------------------------------");
		System.out.print("\n");
		
		
		// Ejercicio 5
		System.out.println("Ejercicio 5 - Simplificar Fracciones");
		System.out.print("\n");
		
		System.out.println("Ingrese el numerador");
		int numeroG = entrada.nextInt();
		System.out.println("Ingrese el denominador");
		int numeroH = entrada.nextInt();
		System.out.print("\n");
		SimplificarFraccion(numeroG, numeroH);
		System.out.print("-----------------------------------------");
		System.out.print("\n");
		
		
		// Ejercicio 6
		System.out.println("Ejercicio 6 - Determinar si un numero es Capicua");
		System.out.print("\n");
		
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
		System.out.print("-----------------------------------------");
		System.out.print("\n");
		
		
		// Ejercicio 7
		System.out.println("Ejercicio 7 - Listar todos los Capicuas de 5 cifras");
		System.out.print("\n");
		
		CapicuasDeCincoCifras();
		System.out.print("-----------------------------------------");
		System.out.print("\n");
		
		
		// Ejercicio 8
		System.out.println("Ejercicio 8 - Buscar el maximo del vector y su Posicion");
		System.out.print("\n");
		
		// ---> Crearemos un vector con numeros aleatorios NO REPETITIVOS <---
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
		System.out.print("-----------------------------------------");
		System.out.print("\n");
		
		
		// Ejercicio 9
		System.out.println("Ejercicio 9 - Ordenar un vector");
		System.out.print("\n");
		
		// ---> Crearemos un vector con numeros aleatorios <---
		int vectorC[] = CrearVectorAleatorio(30);
		
		Ordenar(vectorC);
		Mostrar(vectorC);
		System.out.print("-----------------------------------------");
		System.out.print("\n");
		
		
		// Ejercicio 10
		System.out.println("Ejercicio 10 - Promedio de un Vector. Minima cantidad en el vector, su primera posicion y cuantas veces se repite");
		
		// ---> Crearemos un vector con numeros aleatorios <---
		int vectorB[] = CrearVectorAleatorio(20);
		
		// A)
		System.out.print("\n");
		System.out.print("El promedio del vector es: " + PromedioDeVector(vectorB));
		System.out.print("\n");
		
		// B)
		MinimoDelVector(vectorB);
		System.out.print("-----------------------------------------");
		System.out.print("\n");
		
		
		// Ejercicio 11
		System.out.println("Ejercicio 11 - Ordenar y Sincronizar 2 vectores");
		System.out.print("\n");
		
		// ---> Crearemos dos vectores con numeros aleatorios ORDENADOS <---
		int vectorD[] = CrearVectorAleatorio(45);
		int vectorE[] = CrearVectorAleatorio(11);
		Ordenar(vectorD);
		Ordenar(vectorE);
		
		int[] vectorConcatenado = UnirVectores(vectorD, vectorE);
		Mostrar(vectorConcatenado);
		System.out.print("-----------------------------------------");
		System.out.print("\n");
		
		
		// Ejercicio 12
		System.out.println("Ejercicio 12 - Hallar los dos mayores numero de un vector");
		System.out.print("\n");
		
		// ---> Crearemos un vector con numeros aleatorios <---
		int vectorF[] = CrearVectorAleatorio(15);
				
		ObtenerLosDosMayores(vectorF);
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
	
	// Crear un vector con numeros aleatorios diferentes a 0
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
	// Una funcion para mostrar los vectores
	public static void Mostrar(int[] v)
	{
		int i;
		int posicion = 1;
		for(i = 0; i<v.length; i++)
		{
			System.out.println("Posicion N° " + posicion + " ----- " + v[i]);
			posicion++;
		}
	}
	
	public static void Ordenar(int[] v)
	{
		Arrays.sort(v);
	}
	
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
	public static void MinimoDelVector(int[] v)
	{
		int minimo, repeticion, posicionPrimera, i, e, a;
		boolean salir = false;
		
		e = 0;
		minimo = 0;
		repeticion = 0;
		posicionPrimera = 0;
		
		for(i = 0; i<v.length; i++)
		{
			if(i == 0)
			{
				minimo = v[i];
			}
			else
			{
				if(v[i] < minimo)
				{
					minimo = v[i];
				}
			}
		}
		
		for(a = 0; a<v.length; a++)
		{
			if(v[a] == minimo)
			{
				repeticion++;
			}
		}
		
		do
		{
			if(v[e] == minimo)
			{
				posicionPrimera = e;
				salir = true;
			}
			else
			{
				e++;
			}
		}
		while(!salir);
		
		System.out.print("El menor valor del arreglo es: " + minimo);
		System.out.print("\n");
		System.out.print("Se repite: " + repeticion + " veces");
		System.out.print("\n");
		System.out.print("La primera vez que aparece es en la posicion: " + posicionPrimera);
		System.out.print("\n");
	}
			
	// Ejercicio 11
	public static int[] UnirVectores(int[] vA, int[]vB)
	{
		int[] vectorC = new int[vA.length + vB.length];
		
		System.arraycopy(vA, 0, vectorC, 0, vA.length);
		System.arraycopy(vB, 0, vectorC, vA.length, vB.length);
		Ordenar(vectorC);
		
		return vectorC;
	}
			
	// Ejercicio 12
	public static void ObtenerLosDosMayores(int[] v)
	{
		int mayorA = 0;
		int mayorB = 0;
		int i;
		
		mayorA = MaximoDelVector(v, 0, v.length-1);
		
		for(i = 0; i<v.length; i++)
		{
			if(v[i] > mayorB && v[i] != mayorA)
			{
				mayorB = v[i];
			}
		}
		
		System.out.print("El mayor valor del vector es: " + mayorA);
		System.out.print("\n");
		System.out.print("El segundo mayor valor del vector es: " + mayorB);
		System.out.print("\n");
	}
}
