package testProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class Testone {
	
	
	private SumNumbers obj=new SumNumbers();
	public static int[][] getData(){
		return new int[][] {{1,2,3},{5,6,7},{6,7,8}};
	}
	@ParameterizedTest
	@MethodSource("getData")
	void testwithStringParameter(int[] data) {
		int a=data[0];
		int b=data[1];
		int sum=data[2];
		assertEquals(sum,obj.sum(a,b));
	}
		
		
	@RepeatedTest(10)
	void sumTest() {
		assertEquals(11,obj.sum(5,6));
	}
	@RepeatedTest(10)
	
	void sumunequal(){
		assertNotEquals(12,obj.sum(6, 4));
	}
	
}
