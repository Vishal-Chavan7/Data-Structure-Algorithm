public class Pattern10 {

    public static void erectHalfPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    public static void invertedHalfPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        erectHalfPyramid(5);
        invertedHalfPyramid(5);
        
    }
}
