public class Pattern17 {

    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            char ch='A';
            for(int j=1; j<=(2*i-1); j++){
                System.out.print(ch);
                if(j<i) ch++;
                else ch--;
            }
            System.out.println();
        }
    }
}