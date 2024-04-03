package com.wipro.FirstSB;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping("/name")
	public String displayBankName()
	{
		return "HDFC";
	}
	
	@RequestMapping("/address")
	public String displayBankAddress()
	{
		return "No 61/C, GT Road, Belting Bazar\r\n"
				+ "Serampore\r\n"
				+ "Hooghly - 712203";
	}
	
}
