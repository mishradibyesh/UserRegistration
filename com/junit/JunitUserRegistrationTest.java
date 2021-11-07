package com.junit;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class JunitUserRegistrationTest {

	// instance variable of junitUserRegistration to access the class elements
	JunitUserRegistration junitUserRegistration = new JunitUserRegistration();

	@Test
	public void givenFirstName_IsProper_ReturnTrue() {
		boolean actualResult = junitUserRegistration.firstName("Dibyesh");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void givenFirstName_IsProper_ReturnFalse() {
		boolean actualResult = junitUserRegistration.firstName("DIBYeSH");
		Assert.assertEquals(false, actualResult);
	}
	
	 @Test
	    public void givenLastName_IsProper_ReturnTrue() {
	        boolean actualResult = junitUserRegistration.lastName("Velisetti");
	        Assert.assertEquals(true, actualResult);
	    }

	    @Test
	    public void givenLastName_IsNotProper_ReturnFalse() {
	        boolean actualResult = junitUserRegistration.lastName("veliseTTi");
	        Assert.assertEquals(false, actualResult);
	    }

}