package com.karen.test2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.karen.test2.model.dto.MyModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@ApiOperation(value = "My Controller")
@RestController
public class MyController {
	@ApiOperation(value = "Getting data")
	@GetMapping
	public MyModel GetData() {
		return null;
	}

	@ApiOperation(value = "Posting data")
	public ResponseEntity<?> postData(@RequestBody MyModel myModel) {
		String message = "Not found";
		if (true) {
			return new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}
	}
}
