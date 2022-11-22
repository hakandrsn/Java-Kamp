package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.entities.concretes.Language;

@RestController // annotation
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;
	

	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<Language> getAll() throws Exception{
		return languageService.getAll();
	}
	
	@GetMapping("/lang/{langId}")
	public Language getLang(@PathVariable("langId") int langId ) throws Exception {
		return languageService.getOne(langId);
	}
	@DeleteMapping("/delete/{langId}")
	public void deleteOne(@PathVariable("langId") int langId) throws Exception {
		 languageService.deleteOne(langId);
	}
	@PutMapping("/update/{langId}")
	public void updateOne(@PathVariable("langId") Language language) throws Exception {
		languageService.updateOne(language);
	}
}
