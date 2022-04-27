package AgendaTelefonica;

public class AgendaSistema {
	private ContatoSistema contatos;
	private Lista historico;
	private String[] favoritos;
	
	
	public String getContatos() {
		return contatos.toString();
	}
	public void setContatos(ContatoSistema contatos) {
		this.contatos = contatos;
	}
	
	public Lista getHistorico() {
		return historico;
	}
	public void setHistorico(Lista historico) {
		this.historico = historico;
	}
	
	public String[] getFavoritos() {
		return favoritos;
	}
	public void setFavoritos(String[] favoritos) {
		this.favoritos = favoritos;
	}
	
	
	
	
	
}
