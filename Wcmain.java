import java.io.*;

class Wcmain{

      public static void main(String[] args) {

            ArgumentSeperator seperator = new ArgumentSeperator(args);
            String file[] = seperator.collectionOfFiles();
            String flag[] = seperator.collectionOfFlags();

            if(file[0]==null)
                  System.out.println("Give a valid file name.");
            else{
                  HandleMultipleOptions handleMultiOption = new HandleMultipleOptions(file,flag);
                  handleMultiOption.handleMultiOptionAndMultiFiles();
            }
      }
};
