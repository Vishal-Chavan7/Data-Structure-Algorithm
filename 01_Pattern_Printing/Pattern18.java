public class Pattern18 {
    public static void main(String[] args) {
        int n=4;
        
        for (int i = 0; i < n; i++) {
            
            for(char ch = (char)(('A'+ n-1)-i); ch <= ('A'+ n-1); ch++){
                System.out.print(ch+" ");
        
            }
            System.out.println();
        }
    }
}
