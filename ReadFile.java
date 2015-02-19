import java.io.*;
public class ReadFile{
	public static String read(String fileName){
		FileInputStream fstream = null;
		File file = new File(fileName);
		int len = (int)file.length();
		char ch[] = new char[len];
		try{
			fstream = new FileInputStream(fileName);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			br.read(ch,0,len);
		}catch(IOException e){
			System.out.println("error is>>"+e);
		}
		String fileData = new String(ch);
		return fileData;
	}
}