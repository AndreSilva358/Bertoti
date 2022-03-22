package audioconverter;

public class RealizeConversion {

	private Convert MP3;
	private Convert OGG;
	private Convert FLAC;

	public RealizeConversion() {
		MP3 = new converterMP3();
		OGG = new converterOGG();
		FLAC = new converterFLAC();
	}

	public void convertendoMP3() {
		MP3.convert();
	}

	public void convertendoOGG() {
		OGG.convert();
	}

	public void convertendoFLAC() {
		FLAC.convert();
	}

}