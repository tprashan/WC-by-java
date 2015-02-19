

public class PerformOption{
	String option[] = {"-l","-w","-c"};

	public int findIndex(String opt){
		int i,lenOfOption = option.length;
		for(i=0;i<lenOfOption;i++){
			if(option[i].equals(opt)) return i;
		}
		return -1;
	}

	// public void findIndex(String option,int line,int word,int chars){
	
	// }

}