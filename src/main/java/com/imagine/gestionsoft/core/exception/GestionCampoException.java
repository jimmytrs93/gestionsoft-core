package com.imagine.gestionsoft.core.exception;

public class GestionCampoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String codigo;
	private String mensaje;

	public GestionCampoException() {
	}

	public GestionCampoException(String codigo, String mensaje) {
		super(mensaje);
		this.codigo = codigo;
		this.mensaje = mensaje;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
