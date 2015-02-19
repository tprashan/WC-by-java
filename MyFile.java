import java.io.*;
public class MyFile{
	public static String read(String fileName){
		FileInputStream fstream = null;
		File file = new File(fileName);
		try{
			fstream = new FileInputStream(fileName);
		}catch(IOException e){
			System.out.println("error is>>"+e);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		int len = (int)file.length();
		char ch[] = new char[len];
		try{
			br.read(ch,0,len);
		}catch(IOException e){
			System.out.println("error is>>"+e);
		}
		String fileData = new String(ch);
		return fileData;
	}
}