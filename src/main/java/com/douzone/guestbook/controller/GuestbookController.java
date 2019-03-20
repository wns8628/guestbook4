package com.douzone.guestbook.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.guestbook.dao.GuestbookDao;
import com.douzone.guestbook.vo.GuestbookVo;

@Controller
public class GuestbookController {
	@Autowired
	private GuestbookDao guestbookDao; //톰캣이 new해줌 .. ?? 스프링이니깐

	@RequestMapping({"","/list","/main"})
	public String list(Model model) {
		model.addAttribute("list",  guestbookDao.getList());
		return "/WEB-INF/views/list.jsp";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(GuestbookVo guestbookVo) {
		guestbookDao.insert(guestbookVo);
		return "redirect:/";
	}
	
	@RequestMapping( value="/delete/{no}", method=RequestMethod.GET )
	public String form(@PathVariable( "no" ) Long no, Model model) {
		model.addAttribute( "no", no );
		return "/WEB-INF/views/deleteform.jsp";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String remove(GuestbookVo guestbookVo) {
		guestbookDao.delete(guestbookVo);
		return "redirect:/";
	}
	
}
