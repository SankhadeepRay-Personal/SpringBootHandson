package com.wipro.ThirdSB;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	@RequestMapping("/branch")
	public String displayBranch()
	{
		return "branch";
	}
	@RequestMapping("/service")
	public String displayService()
	{
		return "service";
	}

}
