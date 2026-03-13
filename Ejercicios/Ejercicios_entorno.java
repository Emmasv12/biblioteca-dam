import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pares = 0;
        int impares = 0;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                pares++;
            }else{
                impares++;
            }
        }

        int[] arrayPares = new int[pares];
        int[] arrayImpares = new int[impares];

        int p = 0;
        int im = 0;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                arrayPares[p] = numeros[i];
                p++;
            }else{
                arrayImpares[im] = numeros[i];
                im++;
            }
        }

        System.out.println("Introduce numero a buscar:");
        int buscar = sc.nextInt();

        int posicion = -1;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == buscar){
                posicion = i;
            }
        }

        if(posicion != -1){
            System.out.println("Esta en la posicion: " + posicion);
        }else{
            System.out.println("No existe");
        }

    }
}