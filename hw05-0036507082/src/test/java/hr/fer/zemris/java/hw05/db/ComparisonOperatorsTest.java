package hr.fer.zemris.java.hw05.db;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ComparisonOperatorsTest {

	@Test
	void testLess() {
		IComparisonOperator oper = ComparisonOperators.LESS;
		assertEquals(true, oper.satisfied("Ana", "Jasna"));
		assertEquals(false, oper.satisfied("Ana", "Ana"));
		assertEquals(false, oper.satisfied("Jasna", "Ana"));
	}
	
	@Test
	void testLessOrEquals() {
		IComparisonOperator oper = ComparisonOperators.LESS_OR_EQUALS;
		assertEquals(true, oper.satisfied("Ana", "Jasna"));
		assertEquals(true, oper.satisfied("Ana", "Ana"));
		assertEquals(false, oper.satisfied("Jasna", "Ana"));
	}
	
	@Test
	void testGreater() {
		IComparisonOperator oper = ComparisonOperators.GREATER;
		assertEquals(false, oper.satisfied("Ana", "Jasna"));
		assertEquals(false, oper.satisfied("Ana", "Ana"));
		assertEquals(true, oper.satisfied("Jasna", "Ana"));
	}
	
	@Test
	void testGreaterOrEquals() {
		IComparisonOperator oper = ComparisonOperators.GREATER_OR_EQUALS;
		assertEquals(false, oper.satisfied("Ana", "Jasna"));
		assertEquals(true, oper.satisfied("Ana", "Ana"));
		assertEquals(true, oper.satisfied("Jasna", "Ana"));
	}
	
	@Test
	void testEquals() {
		IComparisonOperator oper = ComparisonOperators.EQUALS;
		assertEquals(false, oper.satisfied("Ana", "Jasna"));
		assertEquals(true, oper.satisfied("Ana", "Ana"));
		assertEquals(false, oper.satisfied("Jasna", "Ana"));
	}
	
	@Test
	void testNotEquals() {
		IComparisonOperator oper = ComparisonOperators.NOT_EQUALS;
		assertEquals(true, oper.satisfied("Ana", "Jasna"));
		assertEquals(false, oper.satisfied("Ana", "Ana"));
		assertEquals(true, oper.satisfied("Jasna", "Ana"));
	}
	
	@Test
	void testLike() {
		IComparisonOperator oper = ComparisonOperators.LIKE;
		assertEquals(false, oper.satisfied("Zagreb", "Aba*"));
		assertEquals(false, oper.satisfied("AAA", "AA*AA"));
		assertEquals(true, oper.satisfied("AAAA", "AA*AA"));
		assertEquals(true, oper.satisfied("BBAA", "*AA"));
		assertEquals(true, oper.satisfied("AABB", "AA*"));
		assertEquals(false, oper.satisfied("BAABB", "AA*"));
	}

}
