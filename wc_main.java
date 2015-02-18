import java.io.*;
class Wcmain{
	public static void main(String[] args) {
		wc wcObject = new wc();
		String str = args[0];
		int length = wcObject.character(str);
		int lines = wcObject.lineCount(str);
		int words = wcObject.wordCount(str);
		System.out.println(str);
		System.out.println("lines:"+lines+" words:"+words+" char:"+length);
	}
}

// class ReadString {
 
//    public static void main (String[] args) {
 
//       //  prompt the user to enter their name
//       System.out.print("Enter your name: ");
 
//       //  open up standard input
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
//       String userName = null;
 
//       //  read the username from the command-line; need to use try/catch with the
//       //  readLine() method
//       try {
//          userName = br.readLine();
//       } catch (IOException ioe) {
//          System.out.println("IO error trying to read your name!");
//          System.exit(1);
//       }
 
//       System.out.println("Thanks for the name, " + userName);
 
//    }
 
// }  // end of ReadString class