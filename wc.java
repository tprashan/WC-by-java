class wc{

	public int character(String content){
		int characters = content.length();
		return characters;
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

	public int[] lines_words_chars(String content){
		int l_w_c[] = {lineCount(content),wordCount(content),character(content)};
		return l_w_c;
	}
}
