package Library;

public class Pessoa {
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private double multa = 0;
	private int livrosDoados = 0;
	
	
	
	
	public Pessoa(String nome, String cpf, String telefone, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.multa = 0;
		this.livrosDoados = 0;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getLivrosDoados() {
		return livrosDoados;
	}
	public void setLivrosDoados(int livrosDoados) {
		this.livrosDoados = livrosDoados;
	}
	public double getMulta() {
		return multa;
	}
	public void setMulta(double multa) {
		this.multa = multa;
	}
	
	
	
	
	
}
