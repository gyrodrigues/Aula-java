package Pages;


public class NotaAluguel {

	private int preço;
    private java.util.Date dataEntrega;
    private int pontuacao;
    
	public int getPreço() {
		return preço;
	}

	public void setPreço(int preço) {
		this.preço = preço;
	}

	public 	java.util.Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(java.util.Date time) {
		dataEntrega = time;
		
	}

	public int getPontuacao() {
		return pontuacao;
	}
	
	public void setPontuacao(int pontuacao){
		this.pontuacao = pontuacao;
	}
	


}
