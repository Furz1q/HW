import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1, 2");
        int[] var1 = new int[]{1, 2, 3};
        for (int i = 0; i < var1.length; i++) {
            if (i == var1.length - 1) {
                System.out.print(var1[i]);
                break;
            }{
                System.out.print(var1[i] + ", ");
            }
        }
        System.out.println();

        double[] var2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < var2.length; i++) {
            if (i == var2.length - 1) {
                System.out.print(var2[i]);
                break;
            }{
                System.out.print(var2[i] + ", ");
            }
        }
        System.out.println();

        int[] var3 = {33, 34, 35, 36, 37, 38, 39};
        for (int i = 0; i < var3.length; i++) {
            if (i == var3.length - 1) {
                System.out.print(var3[i]);
                break;
            }{
                System.out.print(var3[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Задание 3");
        for(int i = var1.length - 1; i >= 0; i--){
            System.out.print(var1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = var2.length - 1; i >= 0 ; i--) {
            System.out.print(var2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = var3.length - 1; i >= 0 ; i--) {
            System.out.print(var3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задание 4");
        for (int i = 0; i < var1.length; i++) {
            if(var1[i] % 2 != 0) {
                var1[i] = var1[i] + 1;
            }
        }System.out.println(Arrays.toString(var1));
    }
}