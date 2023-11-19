package app;

public class Main3 {

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
        int count = 0;
        int sum = 0;
        int i = numbers.length-1;

        while (i >= 0) {

            int num = numbers[i];
            sum += num;
            ++count;
            System.out.println("" + count + ") Num is " + num + ", Sum is " + sum);
            i--;
        }
    String separate = "----------------------";
        System.out.println(separate +"\nSum of numbers is "+sum);
}
}



