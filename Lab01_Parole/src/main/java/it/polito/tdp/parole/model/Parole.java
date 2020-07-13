package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	private List<String> elenco;
		
	public Parole() {
		this.elenco= new LinkedList<>();
	}
	
	public void addParola(String p) {
		elenco.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(elenco, new Comp());
		return elenco;
	}
	
	public void reset() {
		elenco.clear();
	}

}
