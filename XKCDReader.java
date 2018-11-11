import java.awt.*;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;
public class XKCDReader {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int comicNum = keyboard.nextInt();
		try {
			Desktop.getDesktop().browse(new URI("http://xkcd.com/" + comicNum));
		} catch (IOException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
