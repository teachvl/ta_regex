package ta.unittest.ht;

import java.util.regex.Pattern;

public class EmailValidator {

	private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern
			.compile("[A-Za-z]{1}[A-Za-z0-9.]{1,}[A-Za-z0-9]{1,}@[A-Aa-z]{1}[A-Za-z.]{1,}[A-Za-z]{2,}");

	public boolean checkEmail(String text) {
		return VALID_EMAIL_ADDRESS_REGEX.matcher(text).matches();
	}

}
