
// program to find print using recursion

public class recursion01 {

    public static void print(int count) {
        
        if (count == 5) {
            return;
        }
        System.out.println(count);
        count++;
        print(count);
    }

    public static void main(String[] args) {
        System.out.println("Recursion Example");
        print(1);

    }
}
