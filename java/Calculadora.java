import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Elige una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz");
            System.out.println("7. Media Aritmética");
            System.out.println("8. Promedio");
            System.out.println("9. Salir");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1: // Suma
                    System.out.println(
                            "Introduce los números separados por espacios (termina con un número no numérico):");
                    System.out.println("Resultado: " + suma(scanner));
                    break;
                case 2: // Resta
                    System.out.println(
                            "Introduce los números separados por espacios (el primero será la base de la resta):");
                    System.out.println("Resultado: " + resta(scanner));
                    break;
                case 3: // Producto
                    System.out.println(
                            "Introduce los números separados por espacios (termina con un número no numérico):");
                    System.out.println("Resultado: " + producto(scanner));
                    break;
                case 4: // División
                    System.out.println("Introduce dos números (dividendo y divisor):");
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    if (b != 0) {
                        System.out.println("Resultado: " + (a / b));
                    } else {
                        System.out.println("Error: División por cero.");
                    }
                    break;
                case 5: // Potencia
                    System.out.println("Introduce la base y el exponente:");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    System.out.println("Resultado: " + Math.pow(a, b));
                    break;
                case 6: // Raíz
                    System.out.println("Introduce un número para calcular su raíz cuadrada:");
                    a = scanner.nextDouble();
                    if (a >= 0) {
                        System.out.println("Resultado: " + Math.sqrt(a));
                    } else {
                        System.out.println("Error: Raíz cuadrada de un número negativo.");
                    }
                    break;
                case 7: // Media Aritmética
                case 8: // Promedio
                    System.out.println(
                            "Introduce los números separados por espacios (termina con un número no numérico):");
                    System.out.println("Resultado: " + mediaAritmetica(scanner));
                    break;
                case 9: // Salir
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }

    // Método para sumar varios números
    public static double suma(Scanner scanner) {
        double suma = 0;
        while (scanner.hasNextDouble()) {
            suma += scanner.nextDouble();
        }
        scanner.next(); // Para salir del loop
        return suma;
    }

    // Método para restar varios números
    public static double resta(Scanner scanner) {
        double resultado = scanner.nextDouble(); // Primer número como base
        while (scanner.hasNextDouble()) {
            resultado -= scanner.nextDouble();
        }
        scanner.next(); // Para salir del loop
        return resultado;
    }

    // Método para multiplicar varios números
    public static double producto(Scanner scanner) {
        double producto = 1;
        while (scanner.hasNextDouble()) {
            producto *= scanner.nextDouble();
        }
        scanner.next(); // Para salir del loop
        return producto;
    }

    // Método para calcular la media aritmética de varios números
    public static double mediaAritmetica(Scanner scanner) {
        double suma = 0;
        int count = 0;
        while (scanner.hasNextDouble()) {
            suma += scanner.nextDouble();
            count++;
        }
        scanner.next(); // Para salir del loop
        return (count > 0) ? (suma / count) : 0;
    }
}
