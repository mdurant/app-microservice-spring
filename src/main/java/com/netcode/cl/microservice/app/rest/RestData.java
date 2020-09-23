package com.netcode.cl.microservice.app.rest;

import java.awt.PageAttributes.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.netcode.cl.microservice.app.model.ModelData;

@RestController
@RequestMapping(path = "/rest/data")
public class RestData {

	@GetMapping(path = "/obtenData", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ModelData getData(@RequestParam(name="msg") String message) {
		ModelData response = new ModelData();
		response.setCode(200);
		response.setStatus(true);
		response.setMensaje("Mensaje Recibido :" + message);
		return response;	
	}
	
}
