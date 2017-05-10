package com.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="api")
public class GreetingController {
	
	@Autowired
	CompletedDateRepository repository;
	
	@Autowired
	HabitRepository habitRepo;
	
	@RequestMapping("/gethabits")
	public ArrayList<Habit> findAll(){		
		ArrayList<Habit> list = new ArrayList<Habit>();		
		for (Habit habit : habitRepo.findAll()) {
			list.add(habit);
		}
		return list;
	}
	
	@PostMapping("/save")
	@ResponseBody
	public String process(@RequestBody String completedPercentage ){
		LocalDate todayLocalDate = LocalDate.now( ZoneId.of( "America/Montreal" ) );
		java.sql.Date date = java.sql.Date.valueOf( todayLocalDate );
		double percentCompleted = Double.parseDouble(completedPercentage);
		repository.save(new CompletedDate(date, percentCompleted));
		System.out.println(completedPercentage);
		return "done";
	
	}	
	
	@GetMapping("/getdbcompleteddates")
	public ArrayList<CompletedDate> getDates(){
		ArrayList<CompletedDate> dates = new ArrayList<CompletedDate>();
		for (CompletedDate completedDate : repository.findAll()) {
			dates.add(completedDate);
			System.out.println(completedDate.getDate().toString());
		}
		return dates;
	}
	
    @GetMapping("/greeting")
    public String greeting(@RequestParam(required=false, defaultValue="World") String name) {
        System.out.println("==== in greeting ====");
        return "david";
    }
    
    @PutMapping(value="/completeddate")
    @ResponseBody 
    public String getCompletedDate(@RequestBody String completeDate){
    	System.out.println(completeDate);
    	return completeDate;
    }

}