package facadepattern;

public class ApplicationFacade {

	public static void main(String[] args) {

		realizaConversao realizaConversao = new realizaConversao();

		realizaConversao.convertendoMP3();
		realizaConversao.convertendoOGG();
		realizaConversao.convertendoFLAC();

	}

}