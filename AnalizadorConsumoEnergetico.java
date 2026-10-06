import java.util.Scanner;

public class AnalizadorConsumoEnergetico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lunes, martes, miercoles, jueves, viernes;
        double promAnterior, promedio;
        double porcentaje;
        String consumo;
        String comparacion;

        System.out.println("Ingrese el consumo de energia el lunes: ");
        lunes = scanner.nextDouble();
        System.out.println("Ingrese el consumo de energia el martes: ");
        martes = scanner.nextDouble();
        System.out.println("Ingrese el consumo de energia el miercoles: ");
        miercoles = scanner.nextDouble();
        System.out.println("Ingrese el consumo de energia el jueves: ");
        jueves = scanner.nextDouble();
        System.out.println("Ingrese el consumo de energia el viernes: ");
        viernes = scanner.nextDouble();
        System.out.println("Ingrese promedio de consumo de energia anterior: ");
        promAnterior = scanner.nextDouble();

        scanner.close();

        promedio = (lunes + martes + miercoles + jueves + viernes)/5;
        
        if (promedio < 8) {
            consumo = "Consumo bajo";
        } else if (promedio <= 12) {
            consumo = "Consumo normal";
        } else if (promedio <= 16) {
            consumo = "Consumo alto";
        } else {
            consumo = "Consumo critico";
        }

        porcentaje = ((promedio - promAnterior)/promAnterior) * 100;

        if (porcentaje < 0) {
            comparacion = "El consumo disminuyo";
        } else if (porcentaje <= 10) {
            comparacion = "El consumo aumento ligeramente";
        } else if (porcentaje <= 25) {
            comparacion = "El consumo aumento considerablemente";
        } else {
            comparacion = "Alerta: aumento elevado del consumo";
        }

        System.out.println("============================");
        System.out.println("   ANALIZADOR DE CONSUMO   ");
        System.out.println("============================");
        System.out.println("\nPromedio consumo: " + promedio);
        System.out.println("\nNivel: " + consumo);
        System.out.println("\nPromedio anterior: " + promAnterior);
        System.out.println("Promedio actual: " + promedio);
        System.out.println("\nVariacion: " + porcentaje + "%");
        System.out.println("\nResultado: \n" + comparacion);
    }
}