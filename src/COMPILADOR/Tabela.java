package COMPILADOR;

import java.util.HashMap;

public class Tabela {
	private HashMap<String, Simbolo>tab;
	public Tabela() {
		this.tab = new HashMap<String, Simbolo>();
		
	}
	public boolean inclu(Simbolo simbolo_valor) {
		if(this.tab.containsKey(simbolo_valor.getNome())) {
			return false;
		}else
			this.tab.put(simbolo_valor.getNome(),simbolo_valor);
			return true;
	}
	public int consultaReferencia(String chave) {
		return ((Simbolo)this.tab.get(chave)).getReferencia();
	}
	public boolean isExistent(String chave) {
		return this.tab.containsKey(chave);
	}
	
	public String toString() {
		return this.tab.toString();
	}
	
	
	
}
