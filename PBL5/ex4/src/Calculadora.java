
import java.util.List;
import java.util.ArrayList;

public class Calculadora {

    public void somar(int x, int y){
        System.out.println("- " + x + " + " + y + " = " + (x + y) );
    }

    public void somarLista(List<Integer> numeros){
        int resultado = 0;
        for (int valor : numeros) {
            resultado += valor;
        }
        System.out.println(resultado);;
    }

    public void subtrair(int x, int y){
        System.out.println("- " + x + " - " + y + " = " + (x - y) );
    }

    public void subLista(List<Integer> numeros){
        int resultado = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            resultado -= numeros.get(i);
        }
        System.out.println(resultado);;
    }

    public void multiplicar(int x, int y){
        System.out.println("- " + x + " * " + y + " = " + (x * y) );
    }

    public void multiplicarLista(List<Integer> numeros, int multiplicador) {
        List<Integer> resultado = new ArrayList<>();
        for (int valor : numeros) {
            resultado.add(valor * multiplicador);
        }
        System.out.println(resultado);
        ;

    }

    public void divisao(int x, int y){
        System.out.println("- " + x + "/" + y + " = " + (x / y) );
    }

    public void dividirLista(List<Integer> numeros) {
        int somaImpares = 0;
        int somaPares = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (i % 2 == 0) {
                somaPares += numeros.get(i);
            } else {
                somaImpares += numeros.get(i);
            }
        }
        System.out.println(somaImpares / somaPares);
    }









}
