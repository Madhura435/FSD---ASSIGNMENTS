package com.madhura.Spring_Boot_basics.Exceptions;

public class UserNotFoundException extends RuntimeException{
public UserNotFoundException(String meassage)
{
	super(meassage);
}
}
