package br.com.valdinei.paroquiaonline.modelo;

import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@javax.persistence.Entity
public class Endereco extends Entity {

	@Column(length = 9)
	private String cep;
	
	@Column(length = 200)
	private String logradouro;
	
	@Column(length = 10)
	private String numero;
	
	@Column(length = 150)
	private String bairro;
	
	@Column(length = 150)
	private String cidade;
	
	@Column(length = 2)
	private String uf;
	
	@Column(length = 150)
	private String complemento;
	
	@OneToOne(optional = false)
	private Localizacao localizacao;
	
	@OneToOne(mappedBy = "endereco")
	private Paroquia paroquia;

	@OneToOne(mappedBy = "endereco")
	private Comunidade comunidade;
	
	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCep() {
		return cep;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getUf() {
		return uf;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getComplemento() {
		return complemento;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public Paroquia getParoquia() {
		return paroquia;
	}

	public void setParoquia(Paroquia paroquia) {
		this.paroquia = paroquia;
	}

	public Comunidade getComunidade() {
		return comunidade;
	}

	public void setComunidade(Comunidade comunidade) {
		this.comunidade = comunidade;
	}
	
	@Transient
	public String getEnderecoAsString() {
        String s = "";
        if (!this.getLogradouro().trim().equals("")) {
            s += this.getLogradouro().trim();
        }
        if (!this.getComplemento().trim().equals("")) {
            if (!s.equals("")) {
                s += ", ";
            }
            s += this.getComplemento().trim();
        }
        if (!this.getBairro().trim().equals("")) {
            if (!s.equals("")) {
                s += " - ";
            }
            s += this.getBairro().trim();
        }
        if (!this.getCidade().trim().equals("")) {
            if (!s.equals("")) {
                s += " - ";
            }
            s += this.getCidade().trim();
        }
        if (!this.getUf().trim().equals("")) {
            if (!s.equals("")) {
                s += "/";
            }
            s += this.getUf().trim();
        }
        if (!this.getCep().trim().equals("")) {
            if (!s.equals("")) {
                s += " - CEP : ";
            }
            s += this.getCep().trim();
        }

        return s;
    }

}
