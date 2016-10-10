package co.simplon.dojo.numbers;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumberTest {

	@Test
	public void checkFromInt() {
		String result = RomanNumber.fromArabic(1);
		Assert.assertEquals(result, "I");
	}

}
