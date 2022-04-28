package com.bajaj.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bajaj.DTO.BajajDto;

@Service
public class BajajServices {
	
	private static final String USERID = "kajal_pawar_21081999";
	private static final String EMAILID = "kajalpawar216@gmail.com";
	private static final String ROLLNUMBER = "PD1032";
	
	@Autowired
	public BajajDto bajajDto;
		
	public BajajDto getData(List<String> list) {
		List<Integer> numberList = new ArrayList();
		List<String> alphabetsList = new ArrayList();
		for(String str:list) {
			try {
				numberList.add(Integer.parseInt(str));
			}catch(NumberFormatException e){
				alphabetsList.add(str);
			}
		}
			
		return new BajajDto("true",USERID,EMAILID,ROLLNUMBER,numberList,alphabetsList);
	}
}
