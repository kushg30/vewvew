package com.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Share;
import com.example.service.ShareService;

@RestController
public class ShareResource {

	@Autowired
	private ShareService shareService;
	
	@GetMapping(value = "/shares/{id}",produces = "application/json")
	public Share getShareById(@PathVariable int id) {
		return shareService.findShareById(id);
	}
}