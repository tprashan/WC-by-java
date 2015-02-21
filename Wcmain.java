import java.io.*;

class Wcmain{

      public static void main(String[] args) {

            ArgumentSeperator seperator = new ArgumentSeperator(args);
            String file[] = seperator.collectionOfFiles();
            String flag[] = seperator.collectionOfFlags();

            if(file.length==1 || (file[0]==null && file[1]==null))
                  System.out.println("Give a valid file name.");
            else{
                  HandleMultipleOptions handleMultiOption = new HandleMultipleOptions(file,flag);
                  handleMultiOption.handleMultiOptionAndMultiFiles();
            }
      }
};
