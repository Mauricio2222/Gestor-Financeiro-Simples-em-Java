import org.junit.Test;

public class PagamentosTest {

	@Test
	public void testPagamentos() {
		Pagamentos p1 = new Pagamentos("Banrisul", 1000.44, "01/10/2016", false);
		//Pagamentos p1 = new Pagamentos(null, null, null, null);
		System.out.println(p1.getData());
		//assertEquals("12/01/1995", p1.getData());
		
	}
}
