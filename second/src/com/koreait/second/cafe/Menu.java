package com.koreait.second.cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<MenuItem> menus;
	
	public Menu() {
		init();
	}
	
	private void init() {
		menus = new ArrayList();
		menus.add(new MenuItem("아메리카노", 1500));
		menus.add(new MenuItem("카푸치노", 2000));
		menus.add(new MenuItem("카라멜 마키아또", 2500));
		menus.add(new MenuItem("에스프레소", 2500));
	}
	
	public void showMenus() {
		System.out.println(" Menu ");
		for(int i=0; i<menus.size(); i++) {
			MenuItem mi = menus.get(i);
			System.out.printf("%d. %s\n", (i+1), mi);
		}
	}
	
	public MenuItem choose(int idx) {
		return menus.get(idx);
	}
	
	
	
	
	
	
	
	
	
	
}
