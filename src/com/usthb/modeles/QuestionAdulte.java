package com.usthb.modeles;

import java.io.Serializable;

public class QuestionAdulte extends Question implements Serializable {
	private static final long serialVersionUID = 1L;

	public QuestionAdulte(String theme, String libelle, String reponse, String image, int niveau) {
		super(theme, libelle, reponse, image, niveau);
	}

	

}

