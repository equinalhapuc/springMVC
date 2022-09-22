package br.com.alura.mvc.mudi.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {

		Pedido pedido = new Pedido();

		pedido.setUrlProduto(
				"https://www.amazon.com.br/Parafusadeira-Furadeira-Bateria-PFV120-Vonder/dp/B09TB998J3?ref_=Oct_d_orecs_d_17113547011&pd_rd_w=TRMmR&content-id=amzn1.sym.0b88fdcf-5a93-418f-aa69-11a1a44f3d28&pf_rd_p=0b88fdcf-5a93-418f-aa69-11a1a44f3d28&pf_rd_r=ZES8MBKFH0T361M8NYJY&pd_rd_wg=GWz3q&pd_rd_r=5333d24d-bf18-4dc5-b917-1ec8dfc244bb&pd_rd_i=B09TB998J3");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/51DQGpAOyiL._AC_SL1000_.jpg");
		pedido.setNomeProduto("Parafusadeira/Furadeira a Bateria 12V PFV120 Bivolt Vonder");
		pedido.setDescricao(
				"Possui regulagem para 18 posições de torque e 1 posição para perfuração, LED para melhor visibilidade do local de trabalho e cabo com revestimento emborrachado, proporcionando maior conforto ao operador. Conta com bateria de íons de lítio, que confere alta eficiência de operação, indicador de carga da bateria, além de fonte bivolt automática com tensão de entrada de 100 V~ - 240 V~. Indicada para soltar e apertar parafusos de até 6 mm de diâmetro e fazer furos em madeiras ou metais.");
		pedido.setValorNegociado(BigDecimal.valueOf(219.9));
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
