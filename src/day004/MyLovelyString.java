package day004;

public class MyLovelyString {
    public static void main(String[] args){
        String myFirstString = "text";
        System.out.println(myFirstString);

        String s1 = "";
        String s2 = " ";

        String result = "my second text "
                + myFirstString
                + "third text "
                + s2;
        System.out.println(result);
    }
}
