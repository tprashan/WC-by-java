import java.io.*;

class HandleMultipleOptions{
      String []file;String []flag;
      public HandleMultipleOptions(String[] file,String[] flag){
            this.file = file;
            this.flag = flag;
      }
      public void handleMultiOptionAndMultiFiles(){
            wc wcObject = new wc();
            int i,j;int noOfFiles = file.length;
            for(i=0;i<noOfFiles;i++){
                  if(file[i]!=null){
                        for(j=0;j<noOfFiles;j++){
                              if(flag[j]!=null){
                                    String fileContent = ReadFile.read(file[i]);
                                    int count[] =  wcObject.lines_words_chars(fileContent);
                                    PerformOption perOpt = new PerformOption();
                                    perOpt.handleOption(flag[j],count[0],count[1],count[2],file[i]);
                              }
                        }
                  }
                  
            }
      }
}

