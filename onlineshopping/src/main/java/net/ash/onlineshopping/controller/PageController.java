package net.ash.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcome to Spring Web MVC");
		return mv;
	}
	
//	@RequestMapping(value="/test")
//	public ModelAndView test( @RequestParam(value="greeting",required=false)String gr)
//	{
//		if(gr==null)gr="Welcome to spring framework!";
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting",gr);
//		return mv;
//	}
	
//	@RequestMapping(value="/test/{greeting}")
//	public ModelAndView test( @PathVariable("greeting")String gr)
//	{
//		if(gr==null)gr="Welcome to spring framework!";
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting",gr);
//		return mv;
//	}
}
