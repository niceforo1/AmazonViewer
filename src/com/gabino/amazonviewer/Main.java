package com.gabino.amazonviewer;

import java.util.Scanner;

import com.gabino.amazonviewer.model.Movie;

public class Main {

	public static void main(String[] args) {
		showMenu();
	}

	public static void showMenu() {

		int opcion_menu;
		Scanner menu = new Scanner(System.in);
		do {
			System.out.println("WHO SHOP");
			System.out.println("");
			System.out.println("Selecciona el numero de la opcion deseada");
			System.out.println("1- Peliculas");
			System.out.println("2- Series");
			System.out.println("3- Libros");
			System.out.println("4- Magazines");
			System.out.println("0- Salir");
			opcion_menu = menu.nextInt();

			switch (opcion_menu) {
			case 1:
				showMovies();
				break;
			case 2:
				showBooks();
				break;
			case 3:
				showBooks();
				break;
			case 4:
				showMagazine();
				break;
			case 0:
				// System.out.flush();
				System.out.println("Ahi nos vemos papu");
				System.exit(0);
				break;
			default:

				System.out.println("Error en el sistema");
				System.out.println("Vuela ingresar una opcion");
				break;

			}
		} while (opcion_menu == 0 || opcion_menu >= 5);
	}

	public static void showMovies() {
		int exit = 0;
		do {
			System.out.println("Bienvenido al menu de Peliculas");

		} while (exit != 0);

	}

	public static void showSeries() {
		int exit = 0;
		do {
			System.out.println("Bienvenido al menu de Series");
		} while (exit != 0);
	}

	public static void showChapters() {

	}

	public static void showBooks() {
		int exit = 0;
		do {
			System.out.println("Bienvenido al menu de Libros");
		} while (exit != 0);

	}

	public static void showMagazine() {
		int exit = 0;
		do {
			System.out.println("Bienvenido al menu de Magazines");
		} while (exit != 0);
	}

}
