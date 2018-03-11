package basuraM5;

import java.util.Scanner;

/**
 *  Codigo que calcula la cantidad de capitulos de relleno que tiene una serie dependiendo de el tipo de esta;
 * @author David Carvajal;
 * @version 1.0;
 * 
 */

public class Program {
	

	/**
	 * Función en la que introducimos los datos y calculamos las variables comunes dentro de cada tipo de serie;
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num_cassos = sc.nextInt();
		
		for(int i = 0; i<num_cassos; i++)
		{
			int tipo_serie = sc.nextInt();
			int num_caps = sc.nextInt();
			int porc = sc.nextInt();
			int cap_totales=0;
			int incremento;
			int tiempo;
			 
			switch(tipo_serie) {
			
			case 1: incremento = 5;
					tiempo = num_caps/20;
				
					calcul(1,porc, num_caps, cap_totales, incremento, tiempo);
					
					break;
			case 2: incremento = -5;
					tiempo = num_caps/50;
					calcul(2,porc, num_caps, cap_totales, incremento, tiempo);
					
					break;
			case 3: incremento = 20;
					tiempo = num_caps/20;
					calcul(3, porc, num_caps, cap_totales, incremento, tiempo);

			break;
			}
		}
	
		
		
	}
	
	/**
	 * Funcion que hace el calculo de el numero de capitulos de relleno
	 * @param num_caps Capitulos totales de la serie;
	 * @param tipo_serie Nos indica que tipo de serie introducimos;
	 * @param porc Porcentaje de relleno de los primeros 10 capitulos;
	 * @param cap_totales Capitulos totales de relleno;
	 * @param incremento Incremento del porcentaje de relleno respecto al tiempo
	 * @param tiempo Veces que se incrementa el porcentaje durante toda la duracion de la serie;
	 * @return devuelve el numero de capitulos de relleno de la serie que hemos introducido;
	 */
	
	public static int calcul(int tipo_serie, int porc,int num_caps,int cap_totales, int incremento, int tiempo) {
		
		porc = porc + (incremento*tiempo);
		
		if((cap_totales = (num_caps*porc)/100)<0) {
			cap_totales=0;
		}else{
			if((cap_totales = (num_caps*porc)/100)>num_caps) {
				cap_totales = num_caps;
			}else {
				cap_totales = (num_caps*porc)/100;
			}
		}
		System.out.println(cap_totales);
		return cap_totales;
	}

}
