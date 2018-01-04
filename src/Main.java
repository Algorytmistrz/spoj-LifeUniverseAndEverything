import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        while (true){
            int a = reader.nextInt();
            if(a==42){
                break;
            }else{
                System.out.println(a);
            }
        }
        reader.close();
    }
}
