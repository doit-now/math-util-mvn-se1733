/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.giaolang.mathutil.core;

/**
 *
 * @author giao.lang
 */
//class này clone giống class java.util.Math
//chứa các hàm static Math.sqrt() Math.sin() Math.random()
public class MathUtility {
    
    public static final double PI = 3.1415;
    
    //hàm getF() là hàm tính n! = 1.2.3..n
    //thiết kế hàm như sau:
    //0! = 1! = 1
    //ko có giai thừa cho số âm. Nếu đưa -5! -> CHỬI; ném ra Exception
    //vì giai thừa tăng rất nhanh, 21! long ko chứa nổi (long 18 số 0)
    //20! vừa đủ cho long
    //21! 22! 23! > 20! -> CHỬI, ném ra Exception
//    public static long getFactorial(int n) {
//        
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
//        
//        if (n == 0 || n == 1)
//            return 1;
//        
//        long product = 1; //biến lưu dồn các tích
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        
//        return product;
//            
//        
//           
//        
//        
//        
//    }
    
     public static long getFactorial(int n) {
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
        
        if (n == 0 || n == 1)
            return 1;
        
        return n * getFactorial(n - 1);
                 
    }
    
}

//5! = 1.2.3.4.5 = 1.2.3.4   . 5
//               =    4!     . 5 = 5 x 4!

//4! = 4 x 3!
//3! = 3 x 2!
//2! = 2 x 1!
//1! = 1;  DỪNG QUÁ TRÌNH ĐUỔI NHAU
//N! = N X (N - 1)!




