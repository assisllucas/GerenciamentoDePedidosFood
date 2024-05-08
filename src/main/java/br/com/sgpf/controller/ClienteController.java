package br.com.sgpf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.sgpf.entity.ClienteEntity;
import br.com.sgpf.service.ClienteService;

public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/cliente")
	public String docente(ModelMap model)
	{
		model.addAttribute("curso", clienteService.findAll());
		return "cliente"; 
	}
	@PostMapping("/salvar_cliente")
	public ModelAndView save(
			ModelMap model,
			@ModelAttribute("clienteEntity") ClienteEntity clienteEntity,
			RedirectAttributes atributes) throws Exception 
	{
		
			ModelAndView mv = new ModelAndView("redirect:/cliente");
			atributes.addFlashAttribute("mensagem", clienteService.save(clienteEntity));
			return mv;
		
	}
	@GetMapping("/alterar_cliente/{idCliente}")
	public ModelAndView update(ModelMap model,@PathVariable("idCliente") Long idCliente) throws Exception 
	{
		
		ModelAndView mv = new ModelAndView("alterar_Cliente");
		model.addAttribute("idCliente", idCliente);
		model.addAttribute("cliente", clienteService.getOneByIdCliente(idCliente));
		
		return mv;
	}
	
	@GetMapping("/excluir_cliente/{idCliente}")
	public ModelAndView delete(ModelMap model,@PathVariable("idDocente") Long idCliente,RedirectAttributes atributes) throws Exception
	{
		ModelAndView mv = new ModelAndView("redirect:/docente");
		model.addAttribute("mensagem",clienteService.deleteById(idCliente));
		model.addAttribute("cursos",clienteService.findAll());
		
		return mv;
		
	}
	@PostMapping("/alterar_cliente")
	public ModelAndView update(
			ModelMap model,
			@ModelAttribute("clienteEntity") ClienteEntity clienteEntity,
			RedirectAttributes atributes) throws Exception
	
	{
		ModelAndView mv = new ModelAndView("redirect:/cliente");
		atributes.addFlashAttribute("mensagem",clienteService.save(clienteEntity));
		
		return mv;
}
}
