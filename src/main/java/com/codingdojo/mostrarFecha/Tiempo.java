package com.codingdojo.mostrarFecha;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Tiempo {
	@RequestMapping("/Tiempo")
	public String date(Model model) {
		
		Date date = new Date();
		String strTiempo = "hh:mm a";
		SimpleDateFormat fechaFormato = new SimpleDateFormat(strTiempo);
		
		model.addAttribute("strTiempo", fechaFormato.format(date));
		return "time.jsp";
	}
}
