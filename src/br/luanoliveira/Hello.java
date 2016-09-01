package br.luanoliveira;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

//@RequestScoped
@ManagedBean
@SessionScoped
public class Hello {
	
	private String message;
	
	@PostConstruct
	public void init(){
		System.out.println(" Bean executado! ");
		System.out.println(this.message);
	}
	
	public String getMessage(){
		return this.message;
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}

	public void alter(String message)
	{
		this.setMessage(message);
	}

	
	

}
