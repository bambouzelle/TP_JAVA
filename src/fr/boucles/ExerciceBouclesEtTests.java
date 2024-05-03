package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("Tous les éléments du tableau :");
        for (int i : array) {
            System.out.println(i);
        }

        System.out.println("Les éléments du tableau dans l'ordre inverse :");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("Entiers supérieurs à 3 :");
        for (int i : array) {
            if (i > 3) {
                System.out.println(i);
            }
        }

        System.out.println("Entiers pairs :");
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Valeurs des index pairs :");
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }

        System.out.println("Entiers impairs :");
        for (int i : array) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
