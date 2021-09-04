package Dos;
public class Pares {
    public static void main(String[] args) {
        int n=1000;                                           
        int i = 1;
        do {
            System.out.println("Índice "+i+ "   "+"Par  "+i*2);
            i++;
        } while (i <= n);
    }
}
