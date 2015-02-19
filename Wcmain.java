import java.io.*;

class Wcmain{

	public static void main(String[] args) {

		File inFile = new File(args[0]);
		int lines=0;int words=0;int characters=0;
		wc wcObject = new wc();

		 try{

            FileInputStream fstream = new FileInputStream(inFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine=br.readLine();

            while ( strLine != null)   {
            	lines += wcObject.lineCount(strLine+"\r\n");
            	words += wcObject.wordCount(strLine+"\r\n");
            	characters += wcObject.character(strLine+"\r\n");
            	strLine = br.readLine();
            }

            }catch (Exception e){
              System.err.println("Error: " + e.getMessage());
            }

            System.out.println("lines:"+lines+" words:"+words+" char:"+characters+"  "+args[0]);
	}
}
