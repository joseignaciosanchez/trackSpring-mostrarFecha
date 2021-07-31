package com.codingdojo.mostrarFecha;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class Fecha {

	@RequestMapping("/Fecha")
	public String date(Model model) {
		
		Date date = new Date();
		String strFecha = "EEEE, d 'de' MMMM, yyyy";
		SimpleDateFormat fechaFormato = new SimpleDateFormat(strFecha);
		
		model.addAttribute("strFecha", fechaFormato.format(date));
		return "date.jsp";
	}
}
