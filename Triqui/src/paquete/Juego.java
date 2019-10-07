package paquete;

import java.io.InputStreamReader;
import java.io.Reader;

public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StringBuffer bf = new StringBuffer();
	char c;
	try {
		Reader entrada = new InputStreamReader(System.in);
		while((c=(char)entrada.read())!='u') {
			bf.append(c);
			
		}
	}
		catch(Exception e) {
			System.out.println("error");
		}
		System.out.println(bf.toString());
	
}
}