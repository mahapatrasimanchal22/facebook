package test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import main.BaseTest;
import main.POMIRC;

public class go  extends BaseTest{

	@Test
	public void pro() throws IOException, InterruptedException {
	POMIRC clk=new POMIRC(drive);
	clk.submit();
	}
	
}
