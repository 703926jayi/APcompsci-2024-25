/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 11565
 */
public class MethodsTest {
    
    public MethodsTest() {
    }

    @Test
    public void testAdd() 
    {
        Methods m = new Methods();
        assertEquals(60, m.add(33,27));
        assertEquals(21, m.add(24, -3));
        assertEquals(29, m.add(1, 28));
    }
     @Test
    public void testFindSmallest() 
    {
        Methods m = new Methods();
        assertEquals(4, m.findSmallest(5,27,4));
        assertEquals(-8, m.findSmallest(242, 199, -8));
        assertEquals(29, m.findSmallest(29, 38, 29));
    }
   
     @Test
    public void testFindAverage() 
    {
        Methods m = new Methods();
        assertEquals(2.0, m.findAverage(1, 2, 3), .001);
        assertEquals(-14.667, m.findAverage(-2, -33, -9), .001);
        assertEquals(50.667, m.findAverage(100, 38, 14), .001);
    }
     @Test
    public void testSumDigits() 
    {
        Methods m = new Methods();
        assertEquals(6, m.sumDigits(123));
        assertEquals(20, m.sumDigits(5942));
        assertEquals(32, m.sumDigits(84391502));
    }
      @Test
    public void testIsLeapYear() 
    {
        Methods m = new Methods();
        assertEquals(false, m.isLeapYear(2017));
        assertEquals(true, m.isLeapYear(2104));
        assertEquals(false, m.isLeapYear(1900));
        assertEquals(true   , m.isLeapYear(2400));
    }
     @Test
    public void testFindMonth() 
    {
        Methods m = new Methods();
        assertEquals("March", m.findMonth(3));
       assertEquals("November", m.findMonth(11));
       assertEquals("Invalid", m.findMonth(15));
    }
     @Test
    public void testSumRange() 
    {
        Methods m = new Methods();
        assertEquals(63, m.sumRange(3, 11));
        assertEquals(494, m.sumRange(35, 17));
        assertEquals(2436465, m.sumRange(2349, 805));
    }
     @Test
    public void testCalculateGrade() 
    {
        Methods m = new Methods();
        assertEquals("A", m.calculateGrade(19,20));
        assertEquals("E", m.calculateGrade(31,60));
        assertEquals("C", m.calculateGrade(63,80));
    }
     @Test
    public void testFindNthFibonacci() 
    {
        Methods m = new Methods();
        assertEquals(3, m.findNthFibonacci(4));
        assertEquals(55, m.findNthFibonacci(10));
        assertEquals(4181, m.findNthFibonacci(19));
    }
}