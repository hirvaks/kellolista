package com.example.watchList.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.watchList.domain.Watch;
import com.example.watchList.domain.WatchRepository;

@Controller
public class WatchController {
	
	// Inject WatchRepository
	@Autowired
	private WatchRepository wrepository;
	
	@RequestMapping(value="/watches", method = RequestMethod.GET)
	public @ResponseBody List<Watch> watchListRest() {
		return (List<Watch>) wrepository.findAll();
	}

}
