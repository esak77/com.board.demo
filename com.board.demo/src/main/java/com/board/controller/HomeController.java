package com.board.controller;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.domain.BoardVO;
import com.board.service.BoardService;

@Controller
public class HomeController {
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception{
		model.addAttribute("listall",service.listall());
		return "index";
	}
	
	@RequestMapping(value="/insert", method= RequestMethod.GET)
	public void insert() throws Exception {}
	
	@RequestMapping(value="/insert_db", method=RequestMethod.POST)
	public String insert_db(BoardVO vo) throws Exception {
		System.out.println(vo.toString());
		service.insert(vo);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public void detail(@RequestParam("idx") int idx, Model model) throws Exception{
		model.addAttribute("detail", service.detail(idx));
	}
	
	
}
