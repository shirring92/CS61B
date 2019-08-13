import java.io.*;

class Nuke2 {
	public static void main (String[] arg) throws Exception{
		BufferedReader keyboard;
		String inputLine;

		keyboard = new BufferedReader(new InputStreamReader(System.in));
		inputLine = keyboard.readLine();

		String firstchar = inputLine.substring(0,1);
	    String restchar = inputLine.substring(2);
		String outLine = firstchar.concat(restchar);

		System.out.println(outLine);
	}
}