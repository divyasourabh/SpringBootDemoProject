package com.ds.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


	@Value("${coach.name}")
	private String coachName;

	@Value("${team.name}")
	private String teamName;

	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "CoachName = " + coachName + " " + " Team Name: " +teamName;
	}

	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on Server is "+ LocalDateTime.now();
	}

	@GetMapping("/workout")
	public String getDailyWorkout(){
		return "Run a hard 5K";
	}

	@GetMapping("/worktodo")
	public String getDailyWorkToDo(){

		return "Run a hard 10k in morning";
	}

	@GetMapping("/work")
	public String getDailyWork(){
		return "Run a hard 10k in morning";
	}

	@GetMapping("/code")
	public String getDailyCode(){
		return "Coding";
	}

	@GetMapping("/codeSample")
	public String getDailyCodeSample(){
		return "Coding Sample";
	}
}
