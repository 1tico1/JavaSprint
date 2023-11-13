package br.com.fiap.sprint2.model.entity;

import jakarta.validation.constraints.NotBlank;

public class Cliente {
	private long id;
	@NotBlank
	private String name;
	@NotBlank
	private String cpf;
	@NotBlank
	private String mail;
	@NotBlank
	private String rg;
	@NotBlank
	private String confirmMail;
	@NotBlank
	private String confirmPass;
	@NotBlank
	private String password;
	@NotBlank
	
	public Cliente() {}
	public Cliente(long id, @NotBlank String name, @NotBlank String cpf, @NotBlank String mail, @NotBlank String rg,
			@NotBlank String confirmMail, @NotBlank String confirmPass, @NotBlank String password) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.mail = mail;
		this.rg = rg;
		this.confirmMail = confirmMail;
		this.confirmPass = confirmPass;
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getConfirmMail() {
		return confirmMail;
	}
	public void setConfirmMail(String confirmMail) {
		this.confirmMail = confirmMail;
	}
	public String getConfirmPass() {
		return confirmPass;
	}
	public void setConfirmPass(String confirmPass) {
		this.confirmPass = confirmPass;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
	