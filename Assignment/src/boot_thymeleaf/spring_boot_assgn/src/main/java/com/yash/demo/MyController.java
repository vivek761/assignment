package com.yash.demo;



	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.jdbc.core.JdbcTemplate;
	import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.servlet.ModelAndView;


	import com.yash.demo.model.*;
	import com.yash.demo.dao.*;
	@Controller
	public class MyController {
		 
		 @Autowired
		 AuthorDAO authordao;
		 
		 @Autowired
		BooktitleDAO booktitledao;
		 
		 @Autowired
		 PublisherDAO pubdao;
		 
		 @RequestMapping("/")
			public String index()
			{
				
				return "index";
			}
		 @RequestMapping("/author")
			public String m2()
			{
				return "author";
			}
		 @RequestMapping(value="/saveauthor", method=RequestMethod.POST)
			public ModelAndView saveAuthor(@ModelAttribute Author objauthor)
			{
				ModelAndView objmv = new ModelAndView();
				 
				if(authordao.addAuthor(objauthor)==1)
				{
					 
					objmv.setViewName("authorsuccess");
					objmv.addObject("author1",objauthor);	
				
				return objmv;
				}
				else
				{
					objmv.setViewName("author");
					return objmv;
				}
			}
			
			@RequestMapping(value="/authorlist")
			public ModelAndView authorlist()
			{
				List<Author> alist=authordao.getAllAuthor();
				List<Booktitle> blist=booktitledao.getAllbooktitle();
				List<Publisher> plist=pubdao.getAllpublisher();

				
		 		ModelAndView objmv = new ModelAndView();
		 		
				objmv.addObject("alist",alist);
				objmv.addObject("blist",blist);
				objmv.addObject("plist",plist);
				
				objmv.setViewName("authorlist");
				return objmv;
			}
			@RequestMapping("/booktitle")
			public String m3()
			{
				return "booktitle";
			}
			 @RequestMapping(value="/savebooktitle", method=RequestMethod.POST)
				public ModelAndView saveBooktitle(@ModelAttribute Booktitle objbooktitle)
				{
					ModelAndView objbt = new ModelAndView();
					 
					if(booktitledao.addBooktitle(objbooktitle)==1)
					{
						 
						objbt.setViewName("booksuccess");
						objbt.addObject("booktitle",objbooktitle);	
					
					return objbt;
					}
					else
					{
						objbt.setViewName("booktitle");
						return objbt;
					}
				}
			 @RequestMapping("/publisher")
				public String m4()
				{
					return "publisher";
				}
			 @RequestMapping(value="/savepublisher", method=RequestMethod.POST)
				public ModelAndView savePublisher(@ModelAttribute Publisher objpub)
				{
					ModelAndView objp = new ModelAndView();
					 
					if(pubdao.addPublisher(objpub)==1)
					{
						 
						objp.setViewName("pubsuccess");
						objp.addObject("publisher",objpub);	
					
					return objp;
					}
					else
					{
						objp.setViewName("publisher");
						return objp;
					}
				}

				
				@RequestMapping(value="/edit")
				public String m5()
				{
					return "edit";
				}
				
				@RequestMapping(value="/editauthor", method=RequestMethod.POST)
				public ModelAndView editauthor(@ModelAttribute Author objA)
				{
					ModelAndView objMV=new ModelAndView();
					if(authordao.editAuthor(objA)==1)
					{
					objMV.setViewName("editauthor");
					objMV.addObject("author", objA);
					return objMV;
					}
					else
					{
						objMV.setViewName("author");
						return objMV;
					}
				}
				@RequestMapping("/delauthor")
				public String m6()
				{
					return "delete";
				}
				
				@RequestMapping(value="/deleteauthor", method=RequestMethod.POST)
				public ModelAndView deleteauthor(@ModelAttribute Author objA)
				{
					ModelAndView objMV=new ModelAndView();
					if(authordao.deleteAuthor(objA)==1)
					{
					objMV.setViewName("deleteauthor");
					objMV.addObject("author", objA);
					return objMV;
					}
					else
					{
						objMV.setViewName("author");
						return objMV;
					}
				}
		}
	

	

