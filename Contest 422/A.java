import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stage = sc.nextLine();
        
        int world = stage.charAt(0) - '0';
        int curr = stage.charAt(2) - '0';
        
        if (curr == 8) {
            world++; 
            curr = 1;
        } else {
            curr++; 
        }
        
        System.out.println((char)(world+'0') + "-" + (char)(curr+'0'));
    }
}
