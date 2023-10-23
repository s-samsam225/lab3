import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void reverseInPlace() {
    int[] input2 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, input2);
  }

  @Test
  public void reversed() {
    int[] input3 = {4,8,6};

    assertArrayEquals(new int[]{6,8,4}, ArrayExamples.reversed(input3));
  }

  @ Test 
  public void averageWithoutLowest() {
    double[] input4 = {2.0,2.0,2.0,2.0};

    assertEquals(2.0,ArrayExamples.averageWithoutLowest(input4));
  }
}

