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
            String option = args[0];
            File inFile = new File(args[1]);
            int lines=0;int words=0;int characters=0;
            wc wcObject = new wc();

            String file = MyFile.read(args[1]);
            System.out.println(file);
            lines += wcObject.lineCount(file);
            words += wcObject.wordCount(file);
            characters += wcObject.character(file);

            if(option.equals("-l")) printCountOfLines(lines) ;
            if(option.equals("-w")) printCountOfWords(words) ;
            if(option.equals("-c")) printCountOfCharacter(characters) ;
            System.out.println("lines:"+lines+" words:"+words+" char:"+characters+"  "+args[1]);
      }
};
