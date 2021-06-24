package demo.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import demo.application.request.InquiryRequest;

@Controller
public class InquiryController {

	@GetMapping("/inquiry")
	public String inquiryForm(InquiryRequest inquiryRequest) {
		
		return "/inquiry/form";
	
	}
	
	@PostMapping("/inquiry/confirm")
	public String inquiryConfirm(InquiryRequest inquiryRequest,RedirectAttributes redirectAttributes) {
		
		  redirectAttributes.addFlashAttribute("complete", "ëóêMäÆóπ");
		
		return "inquiry/confirm";
		
	}
	
	@PostMapping("/inquiry/form")
	public String backForm(InquiryRequest inquiryRequest) {

		return "inquiry/form";
	}
	
	
	@PostMapping("/inquiry/complete")
	public String complete(InquiryRequest inquiryRequest, RedirectAttributes redirectAttributes) {

		  redirectAttributes.addFlashAttribute("complete", "ëóêMäÆóπ");
		 
		return "redirect:/inquiry/form";
		}
	
}
