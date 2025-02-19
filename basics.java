import java.util.*;
public class basics {
   public static void useit(int n){
        if(n==1){
        System.out.print(n);
        return;}
        useit(n-1);
        System.out.print(n);

    }
    public static void main(String[] args) {
        useit(5);

    }
}
