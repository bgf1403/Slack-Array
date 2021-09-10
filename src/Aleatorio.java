import java.util.Arrays;
import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {

                int[] numeros = { 17, 34, 68, 136 };

                Random random = new Random();

                for (int i = 0; i < numeros.length; i++) {
                    int randomIndexToSwap = random.nextInt(numeros.length);
                    int temp = numeros[randomIndexToSwap];
                    numeros[randomIndexToSwap] = numeros[i];
                    numeros[i] = temp;
                }
                System.out.println(Arrays.toString(numeros));
    }
}
