package Steps;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import Converters.DateConverter;
import cucumber.api.Transform;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class Aprender_cucumber_steps {

	@Dado("^que criei o arquivo corretamente$")
	public void que_criei_o_arquivo_corretamente() throws Throwable {

	}

	@Quando("^executa-lo$")
	public void executa_lo() throws Throwable {

	}

	@Entao("^a especificacao deve finalizar com sucesso$")
	public void a_especificacao_deve_finalizar_com_sucesso() throws Throwable {

	}

	private int contador = 0;

	@Dado("^que o valor do contador e (\\d+)$")
	public void que_o_valor_do_contador(int arg1) throws Throwable {
		contador = arg1;
	}

	@Quando("^eu incrementar em (\\d+)$")
	public void eu_incrementar_em(int arg1) throws Throwable {
		contador = contador + arg1;
	}

	@Entao("^o valor do contador sera (\\d+)$")
	public void o_valor_do_contador_ser(int arg1) throws Throwable {

		Assert.assertEquals(arg1, contador);
	}

	Date entrega = new Date();

	@Dado("^que a entrega e dia (.*)$")
	public void que_a_entrega_e_dia(@Transform(DateConverter.class)Date data) throws Throwable {

		entrega = data;
		System.out.println(entrega);
	}

	@Quando("^a entrega atrasar em (\\d+) (dia|dias|mes|meses)$")
	public void a_entrega_atrasar_em_dias(int arg1, String tempo) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if (tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, arg1);
		}
		if (tempo.equals("meses")) {
			cal.add(Calendar.MONTH, arg1);
		}
		entrega = cal.getTime();
	}

	@Entao("^a entrega sera efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void a_entrega_sera_efetuada_em(String data) throws Throwable {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = format.format(entrega);
		Assert.assertEquals(data, dataFormatada);
	}
	
	@Dado("^que o ticket( especial)? e (A.\\d{3})$")
	public void que_o_ticket_e_AF(String tipo, String arg1) throws Throwable {
	    
	}

	@Dado("^que o valor da passagem e R\\$ (.*)$")
	public void que_o_valor_da_passagem_e_R$(Double numero) throws Throwable {
		System.out.println(numero);
	    
	}

	@Dado("^que o nome do passageiro e \"(.{5,20})\"$")
	public void que_o_nome_do_passageiro_e(String arg1) throws Throwable {

	}

	@Dado("^que o telefone do passageiro e (9\\d{3}-\\d{4})$")
	public void que_o_telefone_do_passageiro_e(String Telefone) throws Throwable {
	  
	}

	@Quando("^criar os steps$")
	public void criar_os_steps() throws Throwable {
	  
	}

	@Entao("^o teste vai funcionar$")
	public void o_teste_vai_funcionar() throws Throwable {
	 
	}


}
