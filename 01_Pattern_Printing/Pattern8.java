public class Pattern8 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){

            for(int j=1; j<i; j++){
                System.out.print(".");
            }

            for(int k=1; k<=(2*n)-(2*i-1); k++) {
    System.out.print("*");
}
            System.out.println();
        }
    }
}
