package bilheteria;

public class Compra {
	private int id;
	private Sessao sessao;
	private boolean meiaEntrada;
	private Funcionario funcionario;
	private double valor;
	
	public Compra (Sessao sessao, boolean meiaEntrada, Funcionario atendente, int id) {
		this.id = id;
		this.sessao = sessao;
		this.meiaEntrada = meiaEntrada;
		this.atendente = atendente;
	}

	
	public int getId () {
		return id;
	}
	
	public int getCadeiras () {
		return this.getSessao().getSala().getDisponiveis();
	}
	
	public Sessao getSessao () {
		return sessao;
	}
	

	public double getValor() {
		return valor;
	}
	
	public boolean getMeiaEntrada () {
		return meiaEntrada;
	}
	
	public Funcionario getFuncionario () {
		return funcionario;
	}
	
	public void setId (long id) {
		this.id = id;
	}
	
	public void setSessao (Sessao sessao) {
		this.sessao = sessao;
	}
	
	public void setMeiaEntrada (boolean meiaEntrada) {
		this.meiaEntrada = meiaEntrada;
	}
	
	public void setFuncionario (Sessao sessao) {
		this.sessao = sessao;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
