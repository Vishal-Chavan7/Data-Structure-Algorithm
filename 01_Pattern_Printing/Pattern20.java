public class Pattern20 {
    public static void upperTriangle(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            for(int k=0; k<(2*n-2)-(2*i); k++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    

    public static void lowerTriangle(int n) {
        for(int i=1; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }

            for(int k=0; k<(2*i); k++){
                System.out.print(" ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }




            System.out.println("");


        }
}



    public static void main(String[] args) {
        upperTriangle(5);
        lowerTriangle(5);
    }
        
}
