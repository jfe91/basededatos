import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        int[] valores = new int[2];
        int[] valoresMinMax = new int[2];

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    permutarValores(valores);
                    break;
                case 2:
                    sumatorio(valores);
                    break;
                case 3:
                    maximoYMinimo(valoresMinMax);
                    break;
                case 4:
                    numerosPrimos();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 5);
    }

    public static void mostrarMenu() {
        System.out.println("*******************************");
        System.out.println("******* MENÚ DE OPCIONES *******");
        System.out.println("*******************************");
        System.out.println("1. Permutar dos valores.");
        System.out.println("2. Sumatorio.");
        System.out.println("3. Máximo y mínimo.");
        System.out.println("4. Números primos.");
        System.out.println("5. Salir.");
        System.out.println("*******************************");
        System.out.print("Seleccione una opción: ");
    }

    public static void permutarValores(int[] valores) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer valor: ");
        valores[0] = scanner.nextInt();
        System.out.print("Introduce el segundo valor: ");
        valores[1] = scanner.nextInt();
        int temp = valores[0];
        valores[0] = valores[1];
        valores[1] = temp;
        System.out.println("Valores permutados: " + valores[0] + ", " + valores[1]);
    }

    public static void sumatorio(int[] valores) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer valor: ");
        valores[0] = scanner.nextInt();
        System.out.print("Introduce el segundo valor: ");
        valores[1] = scanner.nextInt();
        int suma = 0;
        for (int i = valores[0]; i <= valores[1]; i++) {
            suma += i;
        }
        System.out.println("La suma de todos los valores desde " + valores[0] + " hasta " + valores[1] + " es: " + suma);
    }

    public static void maximoYMinimo(int[] valores) {
        Scanner scanner = new Scanner(System.in);
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        System.out.println("Introduzca valores (introduzca -999 para finalizar):");
        int valor;
        while ((valor = scanner.nextInt()) != -999) {
            if (valor > maximo) {
                maximo = valor;
            }
            if (valor < minimo) {
                minimo = valor;
            }
        }

        if (maximo != Integer.MIN_VALUE) {
            valores[0] = maximo;
            valores[1] = minimo;
            System.out.println("El valor máximo introducido es: " + maximo);
            System.out.println("El valor mínimo introducido es: " + minimo);
        } else {
            System.out.println("No se introdujeron valores.");
        }
    }

    public static void numerosPrimos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("El número debe ser mayor que 1.");
        } else {
            System.out.println("Los números primos hasta " + n + " son:");
            for (int i = 2; i <= n; i++) {
                if (esPrimo(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}