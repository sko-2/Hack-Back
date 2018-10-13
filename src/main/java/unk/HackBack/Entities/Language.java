package unk.HackBack.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Language")
public class Language {

    @Id
    @Column(name = "LanguageID")
    @Size(max = 3)
    private String languageId;

    @Column(name = "LanguageName")
    @Size(max = 45)
    private String languageName;

    @Column(name = "LatinChar")
    private Boolean isLatinChar;

    public String getLanguageId() {
        return languageId;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public Boolean getLatinChar() {
        return isLatinChar;
    }

    public void setLatinChar(Boolean latinChar) {
        isLatinChar = latinChar;
    }
}
