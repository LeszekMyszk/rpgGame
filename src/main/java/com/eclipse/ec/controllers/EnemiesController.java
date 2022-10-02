package com.eclipse.ec.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eclipse.ec.repository.Wapen;
import com.eclipse.ec.repository.WapenRepository;

@RestController
public class EnemiesController {

	private WapenRepository wapenRepository;

	public EnemiesController(WapenRepository wapenRepository) {
		this.wapenRepository = wapenRepository;
	}

	@RequestMapping(value = "/wapens", method = RequestMethod.GET)
	public ResponseEntity<List<Wapen>> getAllWapens() {
		List<Wapen> wapens = new ArrayList<>();
		for (Wapen wapen : wapenRepository.findAll()) {
			wapens.add(wapen);
		}
		return new ResponseEntity<List<Wapen>>(wapens, HttpStatus.OK);
	}

}
