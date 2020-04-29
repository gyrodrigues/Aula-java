package Steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import org.junit.Assert;

import Pages.AluguelService;
import Pages.Filme;
import Pages.NotaAluguel;
import Pages.TipoAluguel;
import Utils.DateUtils;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class Alugar_Filme_steps {

	private Filme filme;
	private AluguelService aluguel = new AluguelService();
	private NotaAluguel nota;
	private String erro;
	private TipoAluguel tipoAluguel = TipoAluguel.COMUM;

	@Dado("^um filme com estoque de (\\d+) unidades$")
	public void um_filme_com_estoque_de_unidades(int arg1) throws Throwable {
		filme = new Filme();
		filme.setEstoque(arg1);
	}


	
	@Dado("^que o preco de alguel seja R\\$ (\\d+)$")
	public void que_o_preco_de_alguel_seja_R$(int arg1) throws Throwable {
		filme.setAluguel(arg1);
	}

	@Quando("^alugar$")
	public void alugar() throws Throwable {

		try {
			nota = aluguel.alugar(filme, tipoAluguel);
		} catch (RuntimeException e) {
			erro = e.getMessage();

		}

	}



	@Entao("^o preco do aluguel sera R\\$ (\\d+)$")
	public void o_preco_do_aluguel_sera_R$(int arg1) throws Throwable {
		Assert.assertEquals(arg1, nota.getPreço());
	}

	@Entao("^o estoque do filme sera de (\\d+) unidade$")
	public void o_estoque_do_filme_sera_de_unidade(int arg1) throws Throwable {
		Assert.assertEquals(arg1, filme.getEstoque());
	}

	@Entao("^nao sera possivel alugar por falta de estoque$")
	public void nao_sera_possivel_alugar_por_falta_de_estoque() throws Throwable {
		Assert.assertEquals("Filme sem estoque", erro);
	}

	@Dado("^que o tipo de alugel seja (.*)$")
	public void que_o_tipo_de_alugel_seja_extendido(String tipo) throws Throwable {
		tipoAluguel = tipo.equals("semanal")? TipoAluguel.SEMANAL: tipo.equals("extendido")? TipoAluguel.EXTENDIDO: TipoAluguel.COMUM;
	}

    
	@Entao("^a data de entrega sera em (\\d+) dias?$")
	public void a_data_de_entrega_sera_em_dias(int arg1) throws Throwable {
	 Date dataEsperada = DateUtils.obterDataDiferencaDias(arg1);
	 Date dataReal = nota.getDataEntrega();
	 
	 DateFormat format = new SimpleDateFormat("dd,mm,yyyy");
	 Assert.assertEquals(format.format(dataEsperada), format.format((dataReal)));
	}

	@Entao("^a pontuacao recebida sera (\\d+) pontos$")
	public void a_pontuacao_recebida_sera_pontos(int arg1) throws Throwable {
		Assert.assertEquals(arg1, nota.getPontuacao());

	}
	
	@Dado("^um filme$")
	public void um_filme(DataTable table) throws Throwable {
		Map<String, String> map = table.asMap(String.class, String.class);
	    filme = new Filme();
	    filme.setEstoque(Integer.parseInt(map.get("estoque")));
	    filme.setAluguel(Integer.parseInt(map.get("preco")));
	    String tipo  = map.get("tipo");
	    tipoAluguel = tipo.equals("semanal")? TipoAluguel.SEMANAL: tipo.equals("extendido")? TipoAluguel.EXTENDIDO: TipoAluguel.COMUM;
	}
}
