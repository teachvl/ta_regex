package ta.unittest.ht;

import java.util.regex.Pattern;

public class EmailValidator {

	private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern
			.compile("[A-z]{1}[A-z0-9.]{1,}[A-z0-9]{1,}@[A-z]{1}[A-z.]{1,}[A-z]{2,}");

	public boolean checkEmail(String text) {
		return VALID_EMAIL_ADDRESS_REGEX.matcher(text).matches();
	}

}
