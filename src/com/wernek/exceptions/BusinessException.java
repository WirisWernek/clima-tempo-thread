package com.wernek.exceptions;

public class BusinessException extends Exception{
    public BusinessException(String mensagemDeErro){
		super(mensagemDeErro);
	}
}
