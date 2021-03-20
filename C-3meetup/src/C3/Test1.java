package C3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Test1 {

	@Test
	void test() {
		Project.method1();
		assertTrue(true);
	}

	@Test
	void testRandomOrderSorting() {
		List<Integer> inputList=Arrays.asList(9, 1, 0);
		List<Integer> expectedList=Arrays.asList(0, 1, 9);
		assertArrayEquals(expectedList.toArray(), Project.sortNumbers(inputList).toArray());

	}
	
	@Test
	void testOrderedSorting() {
		List<Integer> inputList=Arrays.asList(0, 1, 9);
		List<Integer> expectedList=Arrays.asList(0, 1, 9);
		assertArrayEquals(expectedList.toArray(), Project.sortNumbers(inputList).toArray());
}
}