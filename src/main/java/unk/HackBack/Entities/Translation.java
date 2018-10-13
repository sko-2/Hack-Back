package unk.HackBack.Entities;

import unk.HackBack.Entities.EmbeddedKeys.TranslationId;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Translation")
public class Translation {

    @EmbeddedId
    private TranslationId translationId;

    @Column(name = "LongText")
    @Size(max = 5000)
    private String text;

    public TranslationId getTranslationId() {
        return this.translationId;
    }

    public void setTranslationId(TranslationId translationId) {
        this.translationId = translationId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
