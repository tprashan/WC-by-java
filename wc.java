class wc{

	public int character(String content){
		int count;
		int character = content.length();
		return character;
	}
	public int lineCount(String str){
	    int lines = 0;
	    int len = str.length();
	    for( int pos = 0; pos < len; pos++) {
	        char c = str.charAt(pos);
	        if( c == '\n' ) lines++;
	    }
	    return lines;
	}
	public int wordCount(String content){
		int wordLength = content.split("\\s+").length;
		String[] words = content.split("\\s+");
		int count =wordLength;
		for(int i=0;i<wordLength;i++){
			if(words[i].equals("")) count-- ;
		}
		return count;
	}

	// public static int[] lines_words_chars(){
		
	// }
}
