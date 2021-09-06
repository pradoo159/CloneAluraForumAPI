package br.com.alura.forum.config.validacao;

public class ErroDeFormularioDto {

	private String campo;
	private String errorCode;
	private String errorMessage;

	public ErroDeFormularioDto(String campo, String errorCode, String errorMessage) {
		super();
		this.campo = campo;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
