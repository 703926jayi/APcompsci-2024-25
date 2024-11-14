import org.junit.Test;
import static org.junit.Assert.*;


public class ArraysTest {
    
    public ArraysTest() {
       
    }
  @Test
    public void testCountElements() 
    {
        ArraysClass a = new ArraysClass();
        int [] nums={ 1, 2, 3, 4, 5, 6};
            assertEquals(6, a.countElements(nums));

    }
     @Test
    public void testFindLargest() 
    {
        ArraysClass a = new ArraysClass();
        int [] nums={ 1, 26, 31, 4, 15, 26};
            assertEquals(31, a.findLargest(nums));
         int[] nums2 = {3, 111, 474, 56, 98, 103, 33, 55, 80};
            assertEquals(474, a.findLargest(nums2));

    }
    
       @Test
    public void testNumOdd() 
    {
        ArraysClass a = new ArraysClass();
        int [] nums={ 1, 26, 31, 4, 15, 26};
            assertEquals(3, a.numOdd(nums));
         int[] nums2 = {3, 111, 474, 56, 98, 103, 33, 55, 80};
            assertEquals(5, a.numOdd(nums2));
   //assertTrue(ArraysClass.equals(expectedResult, result));
    }
      @Test
    public void testCountNegEven() 
    {
        ArraysClass a = new ArraysClass();
        int [] nums={ 1, -26, 31, 4, -15, 26};
            assertEquals(1, a.countNegEven(nums));
         int[] nums2 = {-3, 112, 474, -56, -98, 103, -34, 55, -80, 66, 102,-41, -2};
            assertEquals(5, a.countNegEven(nums2));
     }
       @Test
    public void testIndexGreater100() 
    {
        ArraysClass a = new ArraysClass();
        int [] nums={ 1, -26, 31, 4, -15, 26};
            assertEquals(-1, a.indexGreater100(nums));
        int[] nums2 = {-3, 112, 474, -56, -98, 103, -34, 55, -80, 66, 102,-41, -2};
            assertEquals(1, a.indexGreater100(nums2));
        int[] nums3 = {-3, 12, 47, -56, -9, 103, -34, 55, -80, 66, 102,-41, -2};
            assertEquals(5, a.indexGreater100(nums3));
     }
     @Test
    public void testOneToTenPresent() 
    {
        ArraysClass a = new ArraysClass();
        int [] nums={ 1, -26, 31, 4, -15, 26};
            assertEquals(false, a.oneToTenPresent(nums));
        int[] nums2 = {5, 2, 4, 15, 8, 1, 6, 5, 3, 7, 9,-41,10, -2};
            assertEquals(true, a.oneToTenPresent(nums2));
        int[] nums3 = {-3, 12, 47, -56, -9, 103, -34, 55, -80, 66, 102,-41, -2};
            assertEquals(false, a.oneToTenPresent(nums3));
     }
     @Test
    public void testNoRepeats() 
    {
        ArraysClass a = new ArraysClass();
        int [] nums={ 1, -26, 31, 4, -15, 26};
            assertEquals(true, a.noRepeats(nums));
        int[] nums2 = {5, 2, 4, 15, 8, 1, 6, 5, 3, 7, 9,-41, -2};
            assertEquals(false, a.noRepeats(nums2));
        int[] nums3 = {-3, 12, 47, -56, -9, 103, -34, 55, -80, -4, 102,-41, -2};
            assertEquals(true, a.noRepeats(nums3));
        int[] nums4 = {1342, 12, 47, -56, -9, 103, -34, 55, -80, -3, 102,-41, -2, 1342};
            assertEquals(false, a.noRepeats(nums4));   
     }
      @Test
    public void testSwap() 
    {
        ArraysClass a = new ArraysClass();
        int [] nums1a={ 1, -26, 31, 4, -15, 26};
        int [] nums1b = { 1, -26, 31, 4, -15, 26};
        assertArrayEquals(a.swap(nums1a, 2, 9), nums1b);
        int[] nums2a = {5, 2, 4, 15, 8, 1, 6, 5, 3, 7, 9,-41, -2};
        int[] nums2b = {1, 2, 4, 15, 8, 5, 6, 5, 3, 7, 9,-41, -2};
        assertArrayEquals(a.swap(nums2a, 0, 5), nums2b);
        int[] nums3a = {-3, 12, 47, -56, -9, 103, -34, 55, -80, -4, 102,-41, -2};
        int[] nums3b = {-3, 12, -2, -56, -9, 103, -34, 55, -80, -4, 102,-41, 47};
        assertArrayEquals(a.swap(nums3a, 2, 12), nums3b);     
     }
    
      @Test
    public void testFindNthFibonacciUsingArrays() 
    {
        ArraysClass a = new ArraysClass();
        assertEquals(a.findNthFibonacciUsingArrays(9), 34);
        assertEquals(a.findNthFibonacciUsingArrays(0), -1);
        assertEquals(a.findNthFibonacciUsingArrays(55), -1);
        assertEquals(a.findNthFibonacciUsingArrays(41), 165580141);
        assertEquals(a.findNthFibonacciUsingArrays(29), 514229);
     }

}