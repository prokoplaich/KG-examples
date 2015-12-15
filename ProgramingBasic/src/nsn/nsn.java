/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsn;

import gcd.GCD;

/**
 *
 * @author Student
 */
public class nsn {

    public static int nsn(int a, int b) {
        int c = a;
        int d = b;
        int x = 0;
        int r = 1;
        int gcd;
        gcd = GCD.gcd(a, b);
        x = (c * d) / gcd;

        return x;
    }
}
