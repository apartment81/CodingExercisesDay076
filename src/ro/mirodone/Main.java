package ro.mirodone;


import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {


        Disarium disarium = new Disarium();

       // System.out.println(disarium.disariumNumber(175));

        DisariumClever disariumClever = new DisariumClever();

       System.out.println(disariumClever.disariumNumber(175));

        long startTime = System.currentTimeMillis();
        toTest();
        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime);
        System.out.println(duration);


    }

      private static void toTest(){

        DisariumFind disariumFind = new DisariumFind();
        DisariumFindM2 disariumFindM2 = new DisariumFindM2();
        int[] array = IntStream.range(0, 2999999).toArray();

          for (int anArray : array) {

              disariumFind.disariumNumber(anArray);
              // disariumFindM2.disariumNumber(array[i]);

          }
    }

}
