/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

/**
 *
 * @author Student
 */
public class GCD {

    public static int gcd(int a, int b) {
        int x = 0;
        int r = 1;
        if (a < b) {
            while (r != 0) {
                r = a % b;
                a = b;
                b = r;
                x = b;
                r = a % b;
            }
        } else {
            while (r != 0) {
                r = b % a;
                b = a;
                a = r;
                x = a;
                r = b % a;
            }
        }
        return x;
    }

}
