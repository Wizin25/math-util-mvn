/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.wizino.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author tanph
 */
public class MathUtililyDDTTest {

    //ta tách bộ data kiểm thử ra khỏi câu lệnh so sánh
    //kỹ thuật này gọi là DDT - Data-Driven-Testing
    //kiểm thử hàm, kiểm thử app mà tách riêng bộ data ra 1 chỗ để dễ kiểm soát
    //sự thiếu đủ của các test case, các test data
    //data test ta để riêng 1 chổ, thường là mảng, hay file Excel
    //hoặc table
    //0! -> 1
    //1! -> 1
    //2! -> 2
    //3! -> 6
    //thấy mùi của mnagr 2 chiều
    public static Object[][] initData() {
        //int[] a = {phần tử của mảng 1 chiếu cách nhau dấu phẩy}
        Object[][] testData = {{0, 1},
                               {1, 1},
                               {2, 2},
                               {4, 24},
                               {5, 120}
        };
        return testData;
    }
    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArgumentReturnsOk(int n, long expected){
        assertEquals(expected,MathUtility.getFactorial(n));
                
    }
}
