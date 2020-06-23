import org.junit.Test;

public class ListaTest {

	@Test
	public void testLista() {
		
		Pagamentos p1 = new Pagamentos("Banrisul", 1000.44, "12/01/2016", false);
		Pagamentos p2 = new Pagamentos("Itau", 500.44, "12/01/2016", false);
		
		Lista minhaLista = new Lista();
		minhaLista.newPagamento(p1);
		minhaLista.newPagamento(p2);		
		
	    int n = minhaLista.getTamanhoLista();
	    for (int i=0; i<n; i++) {
	      System.out.printf("Posição %d - %s - %.2f \n", i, minhaLista.getListaPagamento().get(i).getNome(), minhaLista.getListaPagamento().get(i).getValor());
	    }
	
	}

}
