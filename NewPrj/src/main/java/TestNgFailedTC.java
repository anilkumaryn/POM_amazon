import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.commons.annotation.Testable;

public class TestNgFailedTC {

	
	
	@Test 
	public void test() 
	{
		Assertions.assertEquals(false,true);
	}
	
	@Testable 
	public void test2() 
	{
		
	}
	
	
}
