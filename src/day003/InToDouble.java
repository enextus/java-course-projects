package day003;

public class InToDouble {
    public static void main(String[] args){
        int var1 = 5;
        int var2 = 2;
        int var3 = var1 / var2;

        double var4 = 5;
        double var5 = 2;
        double var6 = var4 / var5;

        System.out.println(var3);
        System.out.println(var6);

        int var9 = (int) (var1 / var4);

        System.out.println(var9);  // теряем дробную частш
    }
}
