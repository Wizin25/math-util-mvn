/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.wizino.mathutil.main;

import com.wizino.mathutil.core.MathUtility;

/**
 *
 * @author tanph
 */
public class Main {
    
      public static void main(String[] args) {
              
        //Test case #1 - Xem chi tiết mô tả ở dưới (case n = 0 | 0!)
        int n = 0; //tình huống kiểm tra 0!
        long expected = 1; //0! hy vọng là 1, ko cần lập trình cx ra kq này
        long actual = MathUtility.getFactorial(n);  //0! thực tế là mấy, gọi hàm và run là biết ngay
        
        //so sánh giữa expected == actual hay ko???
        System.out.println("0! -> expected = " + expected +
                                " | actual = " + actual);
        
        //Cách 1: kiểm thử = sức người: mắt nhìn, não nghĩ
        
        //test case #2 - mô tả ở dưới
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println("1! -> expected = " + expected +
                                " | actual = " + actual);
        
        //test case #3 - mô tả dưới, dùng n = 5
        
        System.out.println("5! -> expected = 120" +
                                " | actual = " + MathUtility.getFactorial(5));
    }
    
}

//TEST CASE #3: Check getFactorial(with n = 5)
//STEPS/PROCEDURES: 
//         1. given n = 5;
//         2. call/invoke getFactorial(n = 5)

//EXPECTED RESULT 
//          the method returns 120 (standing for 5! = 120)

//STATUS: PASSED? or FAILED? - to be updated later, when finishing TEST RUN



//TEST CASE #2: Check getFactorial(with n = 1)
//STEPS/PROCEDURES: 
//         1. given n = 1;
//         2. call/invoke getFactorial(n = 1)

//EXPECTED RESULT 
//          the method returns 1 (standing for 1! = 1)

//STATUS: PASSED? or FAILED? - to be updated later, when finishing TEST RUN

//DEV PHẢI TEST CODE CỦA MÌNH, CÓ 3 CÁCH
        //SAU ĐÂY LÀ CÁCH 1: IN KẾT QUẢ XỬ LÍ CỦA HÀM RA MÀN HÌNH
     
        //NHẮC LẠI: CÔNG VIỆC CỦA QC BAO GỒM
        //THIẾT KẾ TEST CASE, RUN TEST CASE, GHI LẠI BUG NẾU CÓ
        //         TEST CASE  TEST RUN            LOG BUG > Jira, BugZilla
        //TEST CASE => nói ra bạn sẽ test app thế nào
        //bằng cách đưa vào data, giá trị kì vọng, cách dùng app với
        //bộ data đó như thế nào
        //Lát rồi run thử app xem sao!!! -> TEST RUN 
        
        //ĐỀ THI PE LUÔN Ở ĐÂY!!! THIẾT KẾ TEST CASE
        //TA THIẾT KẾ TEST CASE ĐỂ TEST HÀM TÍNH GIAI THỪA TA VỪA VIẾT
        //TEST CODE THÌ ĐC GỌI LÀ UNIT TEST
        //TEST CASE CHO UNIT TEST THÌ GỌI LÀ    "UNIT TEST" TEST CASE
        
        //TEST CASE #1: Check getFactorial() with n = 0
        //STEPS/PROCEDURES: 
        //          1. Given n = 0
        //          2. Invoke/call getFactorial(n = 0)
        
        //EXPECTED RESULT: the method returns 1 stands for 0! = 1
        //STATUS         : PASSED? or FAILED? -> lúc chạy hàm 
                                              //mới biết kq, gọi là
                                              //TEST RUN. CÓ THỂ
                                              //TEST ĐI TEST LẠI NHIỀU
                                              //LẦN