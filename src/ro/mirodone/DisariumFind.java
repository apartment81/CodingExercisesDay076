package ro.mirodone;

public class DisariumFind {


    public  void disariumNumber(int number) {

        int count_digits = Integer.toString(number).length();

        int sum = 0;
        int x = number;

        while (x != 0) {

            //get the last int digit
            int r = x % 10;
            // Sum the digits by powering according to
            // the positions
            sum = (int) (sum + Math.pow(r, count_digits--));
            x = x / 10;
        }

        if (sum == number) {
            System.out.println(sum);
        }

    }
}
