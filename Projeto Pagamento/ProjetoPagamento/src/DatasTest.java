import org.junit.Test;

public class DatasTest {

	@Test
	public void test() {
		
		Datas minhaData = new Datas();
		
		
		minhaData.setMes(minhaData.getNumMesAtual());
		
		System.out.println(minhaData.getMes());
		System.out.println(minhaData.getNumMes());
		
		
		System.out.println(minhaData.retornaAno("30/11/0002"));
		
		
		
		
		
		
		
		
	}

}
