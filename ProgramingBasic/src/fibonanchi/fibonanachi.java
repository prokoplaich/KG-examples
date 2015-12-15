/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonanchi;

/**
 *
 * @author Student
 */
public class fibonanachi {
    public static int fibonanchi(int a){
        int x = 1;
        int b = 1;
        int c = 1;
        int co = a -1;
        while (co != 0){
            x = b+c;
            b = c;
            c = x;
            co = co -1;
        }        
        return x;
    }
    
}
