package br.edu.ifspcjo.ads.web3.ifitness.domain.model;

public enum Gender {
	
	MASCULINO("Masculino"),
	FEMININO("Feminino"),
	OUTRO("Outro"),
	PREFIRO_NÃO_DIZER("Prefiro Não Dizer");
	
	private String description;

	private Gender(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
}
