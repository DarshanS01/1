import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        while (true) 
        {
            int num = sc.nextInt();
            if (num < 0)
            {
                break; 
            }
            arrList.add(num); 
        }
        for (int i = arrList.size() - 1; i >= 0; i--) {
            System.out.print(arrList.get(i) + " ");
        }
    }
}
