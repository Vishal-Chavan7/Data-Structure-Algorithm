public class Pattern9 {



     public static void erectPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedPyramid(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<(2*n)-(2*i+1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        erectPyramid(5);
        invertedPyramid(5);
    }
}
