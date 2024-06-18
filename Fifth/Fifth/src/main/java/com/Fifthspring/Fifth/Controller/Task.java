package com.Fifthspring.Fifth.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Fifthspring.Fifth.Service.Task1;

@RestController
@RequestMapping("/Task")
public class Task {
		
		@Autowired
		 Task1 obj;
		
		
@PostMapping(value="/add")
	
		public int add(@RequestBody int a ,@RequestBody int b) {
			return obj.add(a,b);
		}
		
 
	@GetMapping("/pro")
		public int pro() {
			return obj.pro();
			
		}
		 

	@GetMapping("/diff")
		public int diff() {
			return obj.diff();
		}

	}