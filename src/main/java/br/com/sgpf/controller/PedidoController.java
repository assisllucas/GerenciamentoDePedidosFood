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

import br.com.sgpf.entity.PedidoEntity;
import br.com.sgpf.service.PedidoService;


@Controller
public class PedidoController {

	/** @Autowired
	private PedidoService pedidoService;

	@GetMapping("/pedido") // nome que eu quiser colocar
	public String pedido(ModelMap model) {

		model.addAttribute("entregas", pedidoService.findAll());
		return "registrarped"; // Caminho real do arquivo
	}

	@PostMapping("/salvar_pedido")
	public ModelAndView save(ModelMap model, @ModelAttribute("pedidoEntity") PedidoEntity pedidoEntity,
			RedirectAttributes atributes) throws Exception {

		ModelAndView mv = new ModelAndView("redirect:/registrarped");
		atributes.addFlashAttribute("mensagem", pedidoService.save(pedidoEntity));
		return mv;

	}

	@GetMapping("/alterar_pedido/{idpedido}")
	public ModelAndView update(ModelMap model, @PathVariable("idpedido") Long idPedido) throws Exception {
		ModelAndView mv = new ModelAndView("alterar_pedido");
		model.addAttribute("idpedido", idPedido);
		model.addAttribute("pedido", pedidoService.getOneByIdPedido(idPedido));

		return mv;

	}

	@PostMapping("/alterar_pedido")
	public ModelAndView update(ModelMap model, @ModelAttribute("pedidoEntity") PedidoEntity pedidoEntity,
			RedirectAttributes atributes) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/pedido");
		atributes.addFlashAttribute("mensagem", pedidoService.save(pedidoEntity));

		return mv;
	}

	@GetMapping("/excluir_pedido/{idpedido}")
	public ModelAndView delete(ModelMap model, @PathVariable("idpedido") Long idPedido, RedirectAttributes atributes) throws Exception 
	{
		ModelAndView mv = new ModelAndView("pedido");
		
	
		model.addAttribute("mensagem", pedidoService.deleteById(idPedido));
		model.addAttribute("pedidos", pedidoService.findAll());
		
		return mv;
		//termina a exclusão
	} */
	}