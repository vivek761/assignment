package com.yash.controller1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemController {
@RequestMapping("/home")
public String viewData(@RequestParam("name") String name,@RequestParam("price") int price,@RequestParam("qty") int qty,@RequestParam("dis") int dis,Model m) {
	int d=(price/100)*dis;
	int p=price-d;
	int disprice=qty*p;

	 m.addAttribute("disprice", disprice);
	 m.addAttribute("name", name);
	 m.addAttribute("price", price);
	 m.addAttribute("quantity", qty);
	return "disprice";
}
}
