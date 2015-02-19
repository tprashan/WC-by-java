import java.io.*;

class Wcmain{
      public static void printCountOfLines(int lines){
            System.out.println("lines:"+lines);
      }
      public static void printCountOfWords(int words){
            System.out.println("Words:"+words);
      }
      public static void printCountOfCharacter(int characters){
            System.out.println("char:"+characters);
      }


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
            if(option.equals("-l")) printCountOfLines(lines) ;
            if(option.equals("-w")) printCountOfWords(words) ;
            if(option.equals("-c")) printCountOfCharacter(characters) ;
            System.out.println("lines:"+lines+" words:"+words+" char:"+characters+"  "+args[0]);
	}
}