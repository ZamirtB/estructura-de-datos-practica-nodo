import unac.edu.co.ed.Lista;
import java.util.Random;

    public class Main {
        public static void main(String[] args) {
            // write your code here
            Random z;
            int h;
            Lista lista;
            int b;

            final int Max = 999;
            z = new Random(1);
            lista = new Lista();
            b = 30;
            System.out.println("Lista ordenada");
            for (; b > 0; b--) {
                h = z.nextInt(Max) + 1;
                lista.insertar(h);
            }
            lista.visualizar();
            System.out.println("");
            System.out.println("Lista eliminada");
            lista.eliminar(979);
            lista.visualizar();

        }

    }

