import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

public class Wctest{
	String str = "hello, this is a good day.\r\nWhat do you think?\r\n";
	@Test
	public void FindStringLength(){
		wc len = new wc();
		int length = len.character(str);
		assertEquals(48,length);
	}
	@Test
	public void stringShouldHave32Characters(){
		String content = "hello how r u?\r\n i m fine and u?";
		wc len = new wc();
		int length = len.character(content);
		assertEquals(32,length);
	}
	@Test
	public void stringShouldHave34CharacterWhentabIsPresentThere(){
		String content = "hello 	how r u?\r\n i m fine 	and u?";
		wc len = new wc();
		int length = len.character(content);
		assertEquals(34,length);
	}
	@Test
	public void countLineShouldGiveOne(){
		String content = "hello how r u?\r\n i m fine and u?";
		wc line = new wc();
		int lines = line.lineCount(content);
		assertEquals(1,lines);
	}
	@Test
	public void countLineShouldGiveTwo(){
		wc line = new wc();
		int lines = line.lineCount(str);
		assertEquals(2,lines);
	}
	@Test
	public void lineCountShouldGiveTwoWhenSpaceAfterSlashN(){
		String content = "hello, this is a good day.\r\nWhat do you think?\r\n ";
		wc line = new wc();
		int lines = line.lineCount(content);
		assertEquals(2,lines);
	}
	@Test
	public void wordCountShouldGiveTen(){
		wc word = new wc();
		int words = word.wordCount(str);
		assertEquals(10,words);
	}
	@Test
	public void wordCountShouldGiveNine(){
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
	public void line_Word_Char_Should_Give_Array_Of_l_w_c_Count(){
		String content = "hello 	how 	r u?\r\n i m fine and u?";
		wc word = new wc();
		int expected[] = {word.lineCount(content),word.wordCount(content),word.character(content)};
		int result[] = word.lines_words_chars(content);
		assertEquals(Arrays.equals(expected, result),true);
	}
	@Test
	public void minus_l_should_have_index_0(){
		String flag = "-l";
		PerformOption option = new PerformOption();
		int index = option.findIndex(flag);
		assertEquals(0,index);
	}
	@Test
	public void minus_w_should_have_index_1(){
		String flag = "-w";
		PerformOption option = new PerformOption();
		int index = option.findIndex(flag);
		assertEquals(1,index);
	}
	@Test
	public void minus_c_should_have_index_2(){
		String flag = "-c";
		PerformOption option = new PerformOption();
		int index = option.findIndex(flag);
		assertEquals(2,index);
	}
}
