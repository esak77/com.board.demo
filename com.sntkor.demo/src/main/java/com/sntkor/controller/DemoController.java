package com.sntkor.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sntkor.domain.IdcVO;
import com.sntkor.service.IdcService;


@Controller
public class DemoController {
	
	@Inject
	private IdcService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "index";
	}
	
	@RequestMapping(value = "/page", method = {RequestMethod.GET,RequestMethod.POST})
	public String page(Locale locale, Model model) throws Exception{
		model.addAttribute("list", service.list());
		return "/page";
	}
	
	@RequestMapping(value="/insert", method= {RequestMethod.POST})
	public String main(IdcVO vo, Model model) throws Exception{
		service.insert(vo);
		return "redirect:/page";
	}
	@RequestMapping(value="/detail", method= {RequestMethod.GET})
	public void detail(Model model, @RequestParam int idx) throws Exception{
		model.addAttribute("detail", service.detail(idx));
	}
}
