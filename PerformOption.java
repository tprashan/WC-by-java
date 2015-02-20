

public class PerformOption{
	String option[] = {"-l","-w","-c"};

	public int findIndex(String opt){
		int i,lenOfOption = option.length;
		for(i=0;i<lenOfOption;i++){
			if(option[i].equals(opt)) return i;
		}
		return -1;
	}

	public void handleOption(String option,int line,int word,int chars,String file){
		int index = findIndex(option);
		if(index==-1)
            System.out.println("lines:"+line+" words:"+word+" char:"+chars+"  "+file);
		if(index==0) System.out.println(" "+line+" "+file);
		if(index==1) System.out.println(" "+word+" "+file);
		if(index==2) System.out.println(" "+chars+" "+file);
	}

}