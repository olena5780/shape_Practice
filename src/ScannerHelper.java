import java.util.Scanner;

public class ScannerHelper {


    public static double getDouble(String question){
        System.out.println(question);
        return scan().nextDouble();
    }

    public static Scanner scan(){
        return new Scanner(System.in);
    }

}
