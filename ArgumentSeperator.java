import java.util.*;

public class ArgumentSeperator{

	String option[] = {"-l","-w","-c"};
	String argumentes[];

	public ArgumentSeperator(String[] args){
		this.argumentes = args;
	}

	public boolean findOption(String opt){
		int i,lenOfOption = option.length;
		for(i=0;i<lenOfOption;i++){
			if(option[i].equals(opt)) return true;
		}
		return false;
	}

	public String[] collectionOfFlags(){
		int i;int j=0;int length = argumentes.length;
		String flags[] = new String[length];
		for(i=0;i<length;i++){
			if(findOption(argumentes[i])){
				flags[j]=argumentes[i];j++;
			}
		}
		String[] unique = new HashSet<String>(Arrays.asList(flags)).toArray(new String[0]);
		return unique;
	}

	public String[] collectionOfFiles(){
		int i;int j=0;int length = argumentes.length;
		String files[] = new String[length];
		for(i=0;i<length;i++){
			if(!findOption(argumentes[i])){
				files[j]=argumentes[i];j++;
			}
		}
		String[] unique = new HashSet<String>(Arrays.asList(files)).toArray(new String[0]);
		return unique;
	} 
}