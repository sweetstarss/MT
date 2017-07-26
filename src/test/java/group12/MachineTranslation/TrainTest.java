package group12.MachineTranslation;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TrainTest extends TestCase{
	
	public TrainTest(String testName){
		super(testName);
	}
	
	public static Test suite(){
		return new TestSuite(TrainTest.class);
	}
	
    public void testApp()
    {
        assertTrue( true );
    }

}
