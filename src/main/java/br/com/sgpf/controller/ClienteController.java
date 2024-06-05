package br.com.sgpf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.sgpf.entity.ClienteEntity;
import br.com.sgpf.service.ClienteService;
import br.com.sgpf.service.EntregaService;

@Controller
public class ClienteController {
	
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private EntregaService entregaService;
	
	@GetMapping("/registrarped") // nome que eu quiser colocar
	public String cliente(ModelMap model)
	{
		
		model.addAttribute("entregas", entregaService.findAll());
		model.addAttribute("clientes", clienteService.findAll());
		return "registrarped"; //Caminho real do arquivo
	}
	@PostMapping("/salvar_cliente")
	public ModelAndView save(
			ModelMap model,
			@ModelAttribute("clienteEntity") ClienteEntity clienteEntity,
			RedirectAttributes atributes) throws Exception 
	{
		
			ModelAndView mv = new ModelAndView("redirect:/registrarped");
			atributes.addFlashAttribute("mensagem", clienteService.save(clienteEntity));
			return mv;
		
	}
	@GetMapping("/alterar_cliente/{idCliente}")
	public ModelAndView update(ModelMap model,@PathVariable("idCliente") Long idCliente) throws Exception 
	{
		
		ModelAndView mv = new ModelAndView("alterar_Cliente");
		model.addAttribute("entregas", entregaService.findAll());
		model.addAttribute("idCliente", idCliente);
		model.addAttribute("cliente", clienteService.getOneByIdCliente(idCliente));
		
		return mv;
	}
	
	
}
