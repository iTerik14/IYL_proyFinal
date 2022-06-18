/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatoria;

/**
 *
 * @author ERIK
 */
public class Sumatoria1 {
    public static void main(String[] args) {
        int x=5;
        double s = 0.0;
        int n = 15,a=0,p=2,j=1,i=1;
        while (i<=n) {            
            if (j<=3) {
                s+= Math.pow(x, a)/p;
                System.out.println(x+"^"+a+"/"+p+" = "+s);
                p+=2;
                j++;
                i++;
            }else{
                a++;
                j=1;
            }
        }
        System.out.println("");
        System.out.println("suma = "+s);
        
    }
}
