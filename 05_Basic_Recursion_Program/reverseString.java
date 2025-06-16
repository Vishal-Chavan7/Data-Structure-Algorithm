import java.util.Vector;

public class reverseString {

    public static void reverse(Vector<Character> s, int start, int end){
        if(start>=end){
            return;
        }

        char temp = s.get(start);
        s.set(start, s.get(end));
        s.set(end,temp);

        reverse(s, start+1, end-1);
    }

    public static Vector<Character> reverseStrings(Vector<Character> s) {
        int start = 0;
        int end = s.size()-1;
        reverse(s, start, end);
        return s;
        }
    public static void main(String[] args) {
        Vector<Character> s = new Vector<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');

        Vector<Character> reversed = reverseStrings(s);
        System.out.println(reversed);
    }

    
}
