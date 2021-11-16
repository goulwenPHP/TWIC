package com.controller;

import org.springframework.web.bind.annotation.*;

@RestController

public class VilleControleur {
	@RequestMapping(value = "/ville", method = RequestMethod.GET)
	@ResponseBody
	public String appelGet() {
		return "Hello World";
	}

}
