package main;

import java.util.Calendar; 
import models.ModelAeroporto;
import models.ModelCompraDePassagem;
import models.ModelPassageiro;
import controllers.NegocioCompraDePassagem;;

public class InterfaceGraficaCompraDePassagens {
	static public void InterfaceGraficaCompraDePassagem(NegocioCompraDePassagem NegocioCompra) {
		
		System.out.println("\n\n =*=*=*=*= Compra de passagens =*=*=*=*= ");
	
		ModelAeroporto Aeroporto1 = new ModelAeroporto(1, "Recife", "Pernambuco", "RE");
		ModelAeroporto Aeroporto2 = new ModelAeroporto(2, "Bonito", "S�o Paulo", "GRO");
		ModelPassageiro Passageiro1 = new ModelPassageiro("124.154.156-01", "Marcelo", "10-05-2000", "995845654", 1565);
		
		ModelCompraDePassagem novaPassagem = null;
		
		try {
			novaPassagem = new ModelCompraDePassagem("FKF", "16/07/2008", 10, Aeroporto1, Aeroporto2, Passageiro1, 275.80f);
		}
		catch(Exception e) {
			System.out.println("N�o foi possivel realizar a compra...");
		}
		
		System.out.println(novaPassagem.getData().getTime());
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		System.out.println("\n\n");
		
		
		
		
		
		
		
		
		
		
		  
		/*// month 2   year 1    day 5 
		Calendar c = Calendar.getInstance();

		c.set(Calendar.DAY_OF_MONTH, 30);
		c.set(Calendar.MONTH, 2);
		c.set(Calendar.YEAR, 2011);
		
		System.out.println(c.get(5));
		System.out.println(c.get(2));
		System.out.println(c.get(1));	
		/////////////////*/
		
		//Transforma de String Para Calendar
		/*
			String data = "16/07/2008";
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Calendar cal = Calendar.getInstance();
			cal.setTime(sdf.parse(data));
			System.out.println(cal.getTime());
		*/
		
	}
}