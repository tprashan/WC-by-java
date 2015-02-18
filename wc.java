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
		int word = content.split("\\s+").length;
		return word;
	}
}
