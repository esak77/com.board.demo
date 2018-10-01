package com.board.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.domain.BoardVO;
import com.board.domain.Criteria;
import com.board.domain.PageMaker;
import com.board.service.BoardService;

@Controller
public class HomeController {
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Criteria cri, Model model) throws Exception{
		model.addAttribute("listall",service.listall(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countingPage(cri));
		
		model.addAttribute("pageMaker", pageMaker);
		
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
	public void detail(@RequestParam("idx") int idx,
			@ModelAttribute("cri") Criteria cri,
			Model model) throws Exception{
		service.hit_count(idx);
		model.addAttribute("detail", service.detail(idx));
	}
	
	
	@RequestMapping(value="/update_db", method=RequestMethod.POST)
	public String update_db(BoardVO vo) throws Exception{
		service.update(vo);
		return "redirect:/";
	}
	
	@RequestMapping(value="/delete", method= RequestMethod.POST)
	public String delete_db(@RequestParam("idx") int idx) throws Exception{
		service.delete(idx);
		return "redirect:/";
	}
	
}
