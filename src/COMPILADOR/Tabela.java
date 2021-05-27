package COMPILADOR;

public class Tabela {

	private String nome;   
	private char tipo;     
	private int referencia;   
	private static int marcador = 1;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public int getReferencia() {
		return referencia;
	}
	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}
	public static int getMarcador() {
		return marcador;
	}
	public static void setMarcador(int marcador) {
		Tabela.marcador = marcador;
	} 

	public String toString() {

		return "\n" + "Nome:"+this.getNome() + "\t" + "Tipo:"+this.getTipo() + "\t" + "Referência:"+this.getReferencia();

	}
	



}
