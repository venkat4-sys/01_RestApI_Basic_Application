package com.ashokit;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	/*
	 * by default dispatcher servelet give the success response as 200 ok
	 * 
	 */

	@GetMapping("/welcome")
	public String getMessage() {
		String msg = "Welcome to RestAPI...";

		return msg;
	}

	/*
	 * By default dispatcher servlet gives the 200 ok (Success) if you want to send
	 * the our status codes then we have to use Response Entity
	 */
	@GetMapping("/greet")
	public ResponseEntity<String> greetMsg() {

		String responseBody = "Good Evening...";

		return new ResponseEntity<String>(responseBody, HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<String> saveMsg() {

		String responsebody = "Msg Saved Sucessfully...";

		return new ResponseEntity<String>(responsebody, HttpStatus.CREATED);
	}
}
