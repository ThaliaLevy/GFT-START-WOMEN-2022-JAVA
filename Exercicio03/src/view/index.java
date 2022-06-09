package view;

import control.Mensagem;
import control.MensagemImagem;
import control.MensagemVideo;

public class index {

	public static void main(String[] args) {
		Mensagem m = new Mensagem();
		MensagemImagem mi = new MensagemImagem();
		MensagemVideo mv = new MensagemVideo();
		
		System.out.println(m.enviarMensagem());

	}

}
