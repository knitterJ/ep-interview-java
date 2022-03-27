// Check whether the number is prime or not. Prime numbers - numbers which are solely divded by themselves and one.
public class Prime {

    public static boolean Prime(int number) {
        boolean isPrime = true;

        //the way to include two as prime number
        int iterateUntil = number / 2;

        if (number <= 1)
            return false;


        for (int i = 2; i <= iterateUntil && isPrime; i++) {

            //if the number divides by 2,3,4.. COMPLETELY, then it's not prime number;
            //for example 22 divides by 2 completely and "isPrime" flag changes to false;
            isPrime = number % i != 0;
            System.out.println(number);
            System.out.println(i);
            System.out.println(isPrime);
        }
        return isPrime;
    }
    public static void main(String args[]) {
        // System.out.println(Prime(7));
        // System.out.println(Prime(2));

        //notice the beauty of the above code by passing the following number:
        System.out.println(Prime(1369));
    }

}
