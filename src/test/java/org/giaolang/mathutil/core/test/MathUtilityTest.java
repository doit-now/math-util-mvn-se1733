/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.giaolang.mathutil.core.test;

import org.giaolang.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author giao.lang
 */
public class MathUtilityTest {
   
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        //assertEquals(69, 69);
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
    }
}

//TDD: TEST DRIVEN DEVELOPMENT: 
//Kĩ thuật lập trình mà dân dev viết code đến đâu thì viết bộ test
//case đến đó (JUnit, NUnit, Mocha) và dùng 2 màu xanh đỏ để đảm
//bảo chất lượng code/chất lượng hàm!!! ĐÃ HỌC XONG

//HỌC KĨ THUẬT KIỂM THỬ CHO DÂN DEV - KĨ THUẬT DDT
//DDT: DATA DRIVEN TESTING - BỔ TRỢ CHO VIỆC XÀI UNIT TEST
//GIÚP CÁC TEST CASE DỄ ĐỌC HƠN, DỄ BẢO TRÌ HƠN
//PHẦN MỞ RỘNG THÊM CỦA TDD

//LÀ KĨ THUẬT VIẾT CODE KIỂM THỬ MÀ TÁCH BỘ DATA KIỂM THỬ
//RA KHỎI CÂU LỆNH ASSERTEQUALS() CHO DỄ KIỂM SOÁT TEST CASE

//DDT là phần mở rộng thêm cho TDD tức là giúp cho code test (Unit Test)
//trở nên dễ dàng đọc, bảo trì, dễ dàng phát hiện thiếu test case

//DDT TÁCH DATA KIỂM THỬ RA 1 CHỖ RIÊNG, THƯỜNG LÀ MẢNG 2 CHIỀU
//(CÓ NHIỀU CỘT, CÁC CỘT CHÍNH LÀ DATA ĐƯA VÀO VÀ EXPECTED)
// VÀ TA CẦN CÓ NHIỀU DÒNG NHƯ THẾ, ỨNG VỚI CÁC TEST CASE)

//VÀ MẢNG 2 CHIỀU NÀY FILL/ĐỔ TỪ TỪ VÀO TRONG HÀM ASSERTEQUALS()
//KĨ THUẬT TÁCH DATA TEST RIÊNG RA 1 CHỖ GỌI LÀ DDT
//DATA DRIVEN TESTING - VIẾT CODE TEST HƯỚNG VỀ VIỆC TÁCH DATA

//DATA ĐC ĐƯA VÀO TRỞ LẠI QUA CÁC THAM SỐ/BIẾN ĐẠI DIỆN
//NÊN DDT CÒN GỌI LÀ: PARAMETERIZED TESTING
//THAM SỐ HOÁ CÁI DATA TEST, BIẾN DATA TEST THÀNH THAM SỐ VÀ 
//ĐƯA VÀO HÀM ASSERTEQUALS()






