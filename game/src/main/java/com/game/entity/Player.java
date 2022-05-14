package com.game.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; //ID игрока
	private String name; //	Имя персонажа (до 12 знаков включительно)
	private String title; //	Титул персонажа (до 30 знаков включительно)
	private Race race; //	Расса персонажа
	private Profession profession; //	Профессия персонажа
	private Integer experience; //	Опыт персонажа. Диапазон значений 0..10,000,000
	private Integer level; //	Уровень персонажа
	private Integer untilNextLevel; //	Остаток опыта до следующего уровня
	private Date birthday; //	Дата регистрации 	Диапазон значений года 2000..3000 включительно
	private Boolean banned; //Забанен / не забанен
	
	public Player() {
		super();
	}

	public Player(Long id, String name, String title, Race race, Profession profession, Integer experience,
			Integer level, Integer untilNextLevel, Date birthday, Boolean banned) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.race = race;
		this.profession = profession;
		this.experience = experience;
		this.level = level;
		this.untilNextLevel = untilNextLevel;
		this.birthday = birthday;
		this.banned = banned;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", title=" + title + ", race=" + race + ", profession="
				+ profession + ", experience=" + experience + ", level=" + level + ", untilNextLevel=" + untilNextLevel
				+ ", birthday=" + birthday + ", banned=" + banned + "]";
	}

	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Race getRace() {
		return race;
	}
	
	public Profession getProfession() {
		return profession;
	}
	
	public Integer getExperience() {
		return experience;
	}
	
	public Integer getLevel() {
		return level;
	}
	
	public Integer getUntilNextLevel() {
		return untilNextLevel;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public Boolean getBanned() {
		return banned;
	}

	public Player withId(Long id) {
		this.id = id;
		return this;
	}

	public Player withName(String name) {
		this.name = name;
		return this;
	}

	public Player withTitle(String title) {
		this.title = title;
		return this;
	}

	public Player withRace(Race race) {
		this.race = race;
		return this;
	}

	public Player withProfession(Profession profession) {
		this.profession = profession;
		return this;
	}

	public Player withExperience(Integer experience) {
		this.experience = experience;
		return this;
	}

	public Player withLevel(Integer level) {
		this.level = level;
		return this;
	}

	public Player withUntilNextLevel(Integer untilNextLevel) {
		this.untilNextLevel = untilNextLevel;
		return this;
	}

	public Player withBirthday(Date birthday) {
		this.birthday = birthday;
		return this;
	}

	public Player withBanned(Boolean banned) {
		this.banned = banned;
		return this;
	}
	
}
