package day003;

public class Random {
    public static void main(String[] args){
        double myRandom = Math.random();
        System.out.println(myRandom);

        double myRandom2 = Math.random();
        System.out.println(myRandom2);

        double myRandom3 = Math.random();
        double myRandom4 = myRandom3 * 100;

        System.out.println(myRandom4);

        int result = (int) myRandom4;
        System.out.println(result);
    }
}
