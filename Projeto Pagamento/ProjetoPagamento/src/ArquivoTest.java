import org.junit.Test;

public class ArquivoTest
{

	@Test
	public void test()
	{

		Lista minhaLista = new Lista();

		minhaLista.carregaLista("Outubro", 2016);

		System.out.println("Tamanho lista: " + minhaLista.getTamanhoLista());

		for (int i = 0; i < minhaLista.getTamanhoLista(); i++)
		{
			System.out.print(minhaLista.getListaPagamento().get(i).getNome());
			System.out.print(" " + minhaLista.getListaPagamento().get(i).getValor());
			System.out.print(" " + minhaLista.getListaPagamento().get(i).getStringData());
			System.out.println(" " + minhaLista.getListaPagamento().get(i).getEstado());
		}

		minhaLista.salvaLista("Janeiro", 2017);

		/*
		 * 
		 * /// Testando mes atual
		 * 
		 * String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
		 * "Outubro", "Novembro", "Dezembro"};
		 * 
		 * 
		 * Date data = new Date(System.currentTimeMillis()); System.out.println(data);
		 * 
		 * Format format = new SimpleDateFormat("MM"); System.out.println(format.format(data.getTime()));
		 * 
		 * int i = Integer.parseInt(format.format(data.getTime()));
		 * 
		 * System.out.println(meses[i-1]);
		 * 
		 */
		ArquivoPagamentos meuArquivo = new ArquivoPagamentos();

		System.out.println(meuArquivo.verificaArquivo("Agosto", 2016));

	}
}
