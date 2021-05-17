package testProject;

public class SumNumbers {
		public int sum(int a, int b) {
			if(a>10)
				throw new IllegalArgumentException("value<10");
			int sum=a+b;
			return sum;
				
	}

}
