package com.github.somi92.hsms.webservice.provider;

import java.util.List;

public class HSMSClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HSMSProviderService ws = new HSMSProviderService();
		
		HSMSService service = ws.getHSMSProviderPort();
//		List<Hsms> hsms = service.getAllActions();
		List<Hsms> hsms = service.getActionsByPriority(2);
		
		System.out.printf("%-5s%-70s%-15s%-15s%-50s%-10s","RB","Opis","SMS broj","Cena poruke","Organizacija","Prioritet"+'\n');
		System.out.println("=====================================================================================================================================================================");
		
		int c = 0;
		for (Hsms i : hsms) {
			System.out.printf("%-5s%-70s%-15s%-15s%-50s%-10s",++c,i.getDesc(),i.getNumber(),i.getPrice(),i.getOrganisation(),i.getPriority());
			System.out.println();
		}
	}

}
