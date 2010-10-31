package hello;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.*;

public class FizzTest {
	@Test
	public void _3のときはFizz() throws Exception {
		assertThat(FizzBuzz.fizz(3), is("Fizz")); 
	}
	
	@Test
	public void _1のときは空白() throws Exception {
		assertThat(FizzBuzz.fizz(1), is("")); 
	}
}
