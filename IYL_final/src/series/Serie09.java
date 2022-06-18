
package series;

/**
 *
 * @author ERIK
 */
public class Serie09 {
    //serie 9 
    // para n tenimnos 
    // 9 9 8 8 7 7 6 6 5 5 4 4 3 3 2 2 1 1 9 9 8 8 7 7 6 6 5 5...n
    
    
    public static void main(String[] args) {
        int n = 29,i=1,a=9,j=1;
        while (i<=n) {            
            if (j<=2) {
                System.out.print(" "+a);
                j++;
                i++;
            }else{
                a--;
                j=1;
                if (a==0) {
                    a=9;
                }
            }
        }
        System.out.println("");
    }
}
