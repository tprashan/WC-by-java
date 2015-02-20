import java.io.*;

class HandleMultipleOptions{
      String []file;String []flag;
      public HandleMultipleOptions(String[] file,String[] flag){
            this.file = file;
            this.flag = flag;
      }
      public void handleMultiOptionAndMultiFiles(){
            wc wcObject = new wc();
            int i;int noOfFiles = file.length;
            for(i=0;i<noOfFiles;i++){
                  if(file[i]!=null){
                        String fileContent = ReadFile.read(file[i]);
                        int count[] =  wcObject.lines_words_chars(fileContent);
                        PerformOption perOpt = new PerformOption();
                        perOpt.handleOption(flag[0],count[0],count[1],count[2],file[i]);
                  }
                  
            }
      }
}

// String fileContent = ReadFile.read(file[0]);
// int count[] =  wcObject.lines_words_chars(fileContent);

// PerformOption perOpt = new PerformOption();
// perOpt.handleOption(flag[0],