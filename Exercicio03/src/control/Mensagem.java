package control;

public class Mensagem {
	public String texto;
	public String[] reacoes = ["curtir", "cora��o", "gargalhada", "surpreso", "triste", "bravo"];
	
	public String enviarMensagem() {
		texto = "Ol�" + reacoes[0] + "tudo bem?";
				
	}
}
