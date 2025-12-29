package com.voter;

public class VoterData {
	
	public void checkAge(int age) //throws ValidAgeException
	{
		if(age >= 18) {	
			throw( new ValidAgeException("valid age"));
		}
		else {
			throw(new ValidAgeException("invalid age"));
		}
	}

}
