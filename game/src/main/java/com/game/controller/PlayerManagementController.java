package com.game.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.game.entity.Player;

@RestController
public class PlayerManagementController {
	@PostMapping(path = "/rest/players")
	public Player createPlayer() {
		return null;
	}
	
	@GetMapping(path = "/rest/players/{id}")
	public Player getPlayerById(@PathVariable Long id) {
		return null;
	}
	
	@PostMapping(path = "/rest/players/{id}")
	public Player updatePlayerById(@PathVariable Long id, @RequestBody Player player) {
		return null;
	}
	
	@DeleteMapping(path = "/rest/players/{id}")
	public Player deletePlayerById(@PathVariable Long id) {
		return null;
	}

}
