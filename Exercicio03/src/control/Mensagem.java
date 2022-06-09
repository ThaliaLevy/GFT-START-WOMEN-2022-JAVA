package control;

public class Mensagem {
	public String texto;
	public String[] reacoes = ["curtir", "coração", "gargalhada", "surpreso", "triste", "bravo"];
	
	public String enviarMensagem() {
		texto = "Olá" + reacoes[0] + "tudo bem?";
				
	}
}
