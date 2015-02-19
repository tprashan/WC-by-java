import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

public class Wctest{
	String str = "hello, this is a good day.\r\nWhat do you think?\r\n";
	@Test
	public void stringLength(){
		wc len = new wc();
		int length = len.character(str);
		assertEquals(48,length);
	}
	@Test
	public void stringCharacter(){
		String content = "hello how r u?\r\n i m fine and u?";
		wc len = new wc();
		int length = len.character(content);
		assertEquals(32,length);
	}
	@Test
	public void stringCharacterWhentabIsThere(){
		String content = "hello 	how r u?\r\n i m fine 	and u?";
		wc len = new wc();
		int length = len.character(content);
		assertEquals(34,length);
	}
	@Test
	public void countLineIsOne(){
		String content = "hello how r u?\r\n i m fine and u?";
		wc line = new wc();
		int lines = line.lineCount(content);
		assertEquals(1,lines);
	}
	@Test
	public void lineCount(){
		wc line = new wc();
		int lines = line.lineCount(str);
		assertEquals(2,lines);
	}
	@Test
	public void lineCountForSpaceAfterSlashN(){
		String content = "hello, this is a good day.\r\nWhat do you think?\r\n ";
		wc line = new wc();
		int lines = line.lineCount(content);
		assertEquals(2,lines);
	}
	@Test
	public void wordCount(){
		wc word = new wc();
		int words = word.wordCount(str);
		assertEquals(10,words);
	}
	@Test
	public void wordCountIsNine(){
		String content = "hello how r u?\r\n i m fine and u?";
		wc word = new wc();
		int words = word.wordCount(content);
		assertEquals(9,words);
	}
	@Test
	public void wordCountIsNineWhenTabIsThere(){
		String content = "hello 	how 	r u?\r\n i m fine and u?";
		wc word = new wc();
		int words = word.wordCount(content);
		assertEquals(9,words);
	}
	@Test
	public void ArrayOfLineWordCharCount(){
		String content = "hello 	how 	r u?\r\n i m fine and u?";
		wc word = new wc();
		int expected[] = {word.lineCount(content),word.wordCount(content),word.character(content)};
		int result[] = word.lines_words_chars(content);
		assertEquals(Arrays.equals(expected, result),true);
	}
}
