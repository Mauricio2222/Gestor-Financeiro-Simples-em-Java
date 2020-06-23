import static org.junit.Assert.*;

import org.junit.Test;

public class TelegramBotTest {

	private static String receiveMessage;
	
	@Test
	public void test() {
		
		receiveMessage = "Show me";
		
		
		if (receiveMessage.toLowerCase().compareTo("show me".toString()) == 0)
		{
			System.out.println("BAAAAA");
			
		}
		
		fail("Not yet implemented");
	}

}
