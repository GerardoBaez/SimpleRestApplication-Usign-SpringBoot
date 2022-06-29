package com.tienda.tienda.services.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class MakerDuplicateException extends RuntimeException {

	public MakerDuplicateException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}