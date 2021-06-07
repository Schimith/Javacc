package COMPILADOR;

import java.util.HashMap;

public class Tabela {
	
	private static final long serialVersionUID = 11234L;
	private HashMap<String, Simbolo>tab = new HashMap<String, Simbolo>();
	

	public boolean inclui(Simbolo simbolo_valor) {
		if(this.tab.containsKey(simbolo_valor.getNome())) {
			return false;
		}else
			this.tab.put(simbolo_valor.getNome(),simbolo_valor);
			return true;
	}
	
	public Simbolo getSimbolo(String Chave) {
		return tab.get(Chave);
	}
	
	public int consultaReferencia(String chave) {
		return ((Simbolo)this.tab.get(chave)).getReferencia();
	}
	public boolean isExistent(String chave) {
		return this.tab.containsKey(chave);
	}
	
	public int getNumeroSimbolos() {
		return tab.size();
	}
	
	public boolean foiInicializado(String nome) {
		Simbolo simb;
		simb =  this.getSimbolo(nome);
		
		if (simb != null) {
			return simb.getInicializada();
		}
		
		return false;
		
	}
	
	
	public String toString() {
		return this.tab.toString();
	}
	
	
	
}
