package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcesso() {
		
//		Ana mae = new Ana();		
// 		System.out.println(mae.segredo); *Quando o atributo é herdado ele pode ser
//									     *Ser acessado diretamente sem a necessidade de estanciar novamente	
		//System.out.println(segredo); 
		//System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		
	}
}
