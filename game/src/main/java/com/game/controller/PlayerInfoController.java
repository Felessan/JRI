package com.game.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.entity.Player;
import com.game.service.PlayerService;

@RestController
public class PlayerInfoController {
	@Autowired
	private PlayerService playerService;

	@GetMapping(path = "rest/players/count", produces = "application/json")
	public Integer countPlayers() {
		try {
			return playerService.countPlayers();
		} catch (Exception e) {
			
		}
		return null;
	}
	
	@GetMapping(path = "rest/players/" , produces = "application/json")
	public Collection<Player> getPlayerList() {
		return null;
	}
	
}
