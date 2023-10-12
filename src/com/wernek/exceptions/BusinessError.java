package com.wernek.exceptions;

public class BusinessError extends Exception{
   public BusinessError(String mensagemDeErro){
		super(mensagemDeErro);
	} 
}
