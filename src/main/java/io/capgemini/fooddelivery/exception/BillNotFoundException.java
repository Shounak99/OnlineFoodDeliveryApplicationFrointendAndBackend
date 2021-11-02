package io.capgemini.fooddelivery.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BillNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	public BillNotFoundException(String err) {
		super(err);
	}


}
