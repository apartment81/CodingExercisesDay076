package ro.mirodone;

public class Triangle {

    public boolean isTriangle(int a, int b, int c) {

/*        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return true;
        }
        return false;*/
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }


}
