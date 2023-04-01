package ta.unittest.ht;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.Assert;

public class EmailValidatorTest {
	@Test(dataProvider = "correctEmails")
	public void checkEmailShouldAnswerWithTrue(String text) {
		Assert.assertTrue(new EmailValidator().checkEmail(text));
	}

	@Test(dataProvider = "incorrectEmails")
	public void checkEmailShouldAnswerWithFalse(String text) {
		Assert.assertFalse(new EmailValidator().checkEmail(text));
	}

	@DataProvider
	public Object[][] correctEmails() {
    return new Object[][] {
    	{"userName@mail.uA"},
    	{"user1NamE@mail.ua"},
    	{"user.name@mail.ua"},
    	{"us.er.name@mail.ua"},
    	{"us.er.name@mail.ua"},
    	{"us.er.na.me@mail.ua"},
    	{"us1er2na3me@mail.ua"},
    	{"us1er.na3m.e@mail.ua"},
    	{"user.name@i.ua"},
    	{"user.name@lv.ua"},
    	{"user.name@lviv.ukraine"},
    	{"user.name@kv.ukraine"},
    	{"user.name@lviv.ua"},
    	{"user.name@kv.univer.ua"},
    	{"user.name@kv.uni.ver.ua"},
    	{"user.name@lv.u.ni.ver.ua"},
		{"UserName1@mail.ua"},
		{"UserName12@mail.ua"},
		{"User12.Name12@mail.ua"},};
   }
 
	@DataProvider
	public Object[][] incorrectEmails() {
		return new Object[][] { 
			{""}, 
			{"@"}, 
			{"@mail.ua"}, 
			{".@mail.ua"}, 
			{"1@mail.ua"}, 
			{".1@mail.ua"}, 
			{"1a@mail.ua"}, 
			{"a1@mail.ua"},
			{".a.@mail.ua"},
			{"1a1@mail.ua"},
			{"user_name@mail.ua"},
			{"user-name@mail.ua"},
			{"username_@mail.ua"},
			{"user.name@"},
			{"user.name@."},
			{"user.name@k.u"},
			{"user.name@1.2"},
			{"user.name@mail.u"},
			{"user.name@mail,ua"}, 
			{"user.name@mail_ua"} };
	}
}

