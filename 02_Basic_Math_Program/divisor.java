import java.util.ArrayList;
import java.util.Arrays;
public class divisor {

    public static int[] getDivisors(int n){
        ArrayList<Integer> divisors  = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                divisors.add(i);
            }
        }
        int [] result = new int[divisors.size()];
        for(int i=0; i<divisors.size(); i++){
            result[i] = divisors.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int [] store =  getDivisors(n);
        System.out.println(Arrays.toString(store));

    }
}

























// public class divisor {

//     public static void main(String[] args) {
        
//         int n =10;
//         int [] temp = new int[n];
//         int count=0;
//         for(int i=1; i<=n; i++){
//             if(n%i==0){
//                 temp[count]=i;
//                 count++;
//             }     
//         }
//         for(int j=0 ;j<=count-1; j++){
//                     System.out.print(+temp[j]+ ", ");
//                 }
//     }
    
// }
