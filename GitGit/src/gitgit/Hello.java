/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitgit;

/**
 *
 * @author Czapol8
 */
public class Hello {

	private String helloMessage;

	public Hello() {
		helloMessage = "Hello World!";
	}
	
	public Hello(String message)
	{
		this.helloMessage = message;
	}

	public String getHelloMessage()
	{
		return helloMessage;
	}
	
	public void setMessage(String message)
	{
		this.helloMessage=message;
	}
	
}
