package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Language {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int languageId;
	private String languageOrigin;
	private String languageName;
	public int getLanguageId() {
		return languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	public String getLanguageOrigin() {
		return languageOrigin;
	}
	public void setLanguageOrigin(String languageOrigin) {
		this.languageOrigin = languageOrigin;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	@Override
	public String toString() {
		return "Language [languageId=" + languageId + ", languageOrigin=" + languageOrigin + ", languageName="
				+ languageName + "]";
	}
	
	
}
