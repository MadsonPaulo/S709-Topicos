package application.model.domain;

public class Resultado {
	private Long sequencial;
	private Long cpf;
	private String modulo;
	private String informacoes;

	public Resultado() {

	}

	public Resultado(Long sequencial, Long cpf, String modulo, String informacoes) {
		super();
		this.sequencial = sequencial;
		this.cpf = cpf;
		this.modulo = modulo;
		this.informacoes = informacoes;
	}

	public Long getSequencial() {
		return sequencial;
	}

	public void setSequencial(Long sequencial) {
		this.sequencial = sequencial;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}

	@Override
	public String toString() {
		return "Resultado [sequencial=" + sequencial + ", cpf=" + cpf + ", modulo=" + modulo + ", informacoes="
				+ informacoes + "]";
	}

}
