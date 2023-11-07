package br.com.fiap.sprint2.model.entity;

public class Protocol {
	private int idprotocol;
	private boolean aproved;
	
	public Protocol() {}
	
	public int getIdprotocol() {
		return idprotocol;
	}
	public void setIdprotocol(int idprotocol) {
		this.idprotocol = idprotocol;
	}
	public boolean isAproved() {
		return aproved;
	}
	public void setAproved(boolean aproved) {
		this.aproved = aproved;
	}
	public Protocol(int idprotocol, boolean aproved) {
		this.idprotocol = idprotocol;
		this.aproved = aproved;
	}
	public int getProtocol() {
		return idprotocol;
	}
	
	}

