package ro.mirodone;

public class DisariumFindM2 {


    public void disariumNumber(int number) {
        int sum = 0;
        char[] arr = String.valueOf(number).toCharArray();

        for (int i = 0; i < arr.length; i++)
            sum += Math.pow(arr[i] - '0', i + 1);


        if (sum == number) {
            System.out.println(sum);
        }
    }

}
