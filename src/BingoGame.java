import java.util.Scanner;

public class BingoGame {
    public static void main(String[] args) {
        Scanner apuesta = new Scanner(System.in);

        System.out.println("---------------INICIANDO BINGO VIRTUAL----------------");
        System.out.println();
        System.out.println("Introduce tu apuesta: ");
        int num = apuesta.nextInt();
        System.out.println("Ingrese la cantidad de numeros que prevé para cantar bingo: ");
        int num2 = apuesta.nextInt();

        int[] carton = new int[10];
        int[] numGenerados = new int[99];
        int numeroLinea = 0;
        int numeroBingo = 0;
        int intentosLinea = 0;
        int intentosBingo = 0;


        for (int i = 0; i < carton.length; i++) {
            int aleatorio;
            boolean duplicado;

           do {
                aleatorio = (int) (Math.random() * 99 + 1);
               duplicado = false;
               for (int j = 0; j < i; j++) {
                   if (carton[j] == aleatorio) {
                       duplicado = true;
                   }

               }
           }while(duplicado);
            carton[i] = aleatorio;
            if (i == 0) carton[i] = (int) (Math.random() * 10 + 1);
            else if (i == 1) carton[i] = (int) (Math.random() * 10 + 10);
            else if (i == 2) carton[i] = (int) (Math.random() * 10 + 20);
            else if (i == 3) carton[i] = (int) (Math.random() * 10 + 30);
            else if (i== 4) carton[i] = (int) (Math.random() * 10 + 40);
            else if (i== 5) carton[i] = (int) (Math.random() * 10 + 50);
            else if (i== 6) carton[i] = (int) (Math.random() * 10 + 60);
            else if (i== 7) carton[i] = (int) (Math.random() * 10 + 70);
            else if (i== 8) carton[i] = (int) (Math.random() * 10 + 80);
            else if (i== 9) carton[i] = (int) (Math.random() * 10 + 90);

        }
        System.out.println("\t\t------------------------");
        System.out.println("\t\t\tB" + "\tI" + "\tN" + "\tG" + "\tO");
        System.out.println("\t\t------------------------");
        for (int num1 : carton) {
            System.out.print("\t" + num1);
        }


            System.out.println("");
            System.out.println();
            System.out.println("...........Numeros Generados............");
        System.out.println();


            for (int i = 0; i < numGenerados.length && numeroBingo< carton.length; i++) {
                boolean duplicado;
                int numSacado;

                do {
                    numSacado = (int) (Math.random() * 99 + 1);
                    System.out.print("\t"+numSacado);
                    duplicado = false;
                    for (int j = 0; j < i; j++) {
                        if (numGenerados[j] == numSacado) {
                            duplicado = true;
                            break;
                        }
                    }

                } while (duplicado);
                numGenerados[i] = numSacado;
                for (int j = 0; j < carton.length; j++) {
                    if (carton[j] == numSacado) {
                        numeroLinea++;
                        if (numeroLinea==5){
                            intentosLinea=i;
                        }
                        numeroBingo++;
                        if (numeroBingo==10){
                            intentosBingo=i;
                        }
                        System.out.println();
                        System.out.println("Nº encontrado "+numSacado);
                    }
                }

            }
        System.out.println("...........RESULTADO.............");

            System.out.println("BINGO..");
            System.out.println("Numero de intentos para cantar Bingo: " + intentosBingo);
            System.out.println("Numeros generados para cantar linea: " + intentosLinea);
            if (intentosBingo==num2){
                System.out.println("Premio Obtenido: " + num*10);

            }else {
                System.out.println("La apuesta no ha sido premiada....");
            }

            System.out.println();
            System.out.println("BINGO TERMINADO....");

    }
}

























