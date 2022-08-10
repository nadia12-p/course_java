import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        System.out.println("Ingrese un numero:");
        String strNum1 = buffer.readLine();
        Integer num1 = Integer.parseInt(strNum1);

        System.out.println("Ingrese otro numero:");
        String strNum2 = buffer.readLine();
        Integer num2 = Integer.parseInt(strNum2);

        System.out.println("Ingrese otro numero:");
        String strNum3 = buffer.readLine();
        Integer num3 = Integer.parseInt(strNum3);

        Integer numMenor = 0;

        if (num3 > num1 && num2 > num1) {
            numMenor = num1;
        }
        if (num3 > num2 && num1 > num2) {
            numMenor = num2;
        }
        if (num2 > num3 && num1 > num3) {
            numMenor = num3;
        }

        Integer numMayor = 0;

        if (num3 < num1 && num2 < num1) {
            numMayor = num1;
        }
        if (num3 < num2 && num1 < num2) {
            numMayor = num2;
        }
        if (num2 < num3 && num1 < num3) {
            numMayor = num3;
        }

        System.out.println("El numero mas grande es: " + numMayor);
        System.out.println("El numero mas chico es: " + numMenor);

    }
}