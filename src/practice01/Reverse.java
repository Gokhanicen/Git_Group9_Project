package practice01;

public class Reverse {
    public static void main(String[] args) {
   String name ="Java";
   String reversed ="";
        for (int i = name.length()-1; i >= 0; i--) {
            reversed +=name.charAt(i);
        }
        System.out.println(reversed);



    }



}
