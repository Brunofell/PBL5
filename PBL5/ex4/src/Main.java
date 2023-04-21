import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();

        c1.somar(5, 6);
        List<Integer> valores = Arrays.asList(2, 3, 5);
        c1.somarLista(valores);

        c1.subtrair(10, 26);
        List<Integer> num = Arrays.asList(4, 6, 5, 4, 2, 3, 8, 4);
        c1.subLista(num);

        c1.multiplicar(10, 60);
        List<Integer> multi = Arrays.asList(1, 2, 3, 4, 5, 6);
        c1.multiplicarLista(multi, 4);


        c1.divisao(20,2);
        List<Integer> divi = Arrays.asList(10, 2, 36, 4, 57, 6);
        c1.dividirLista(divi);
    }

}