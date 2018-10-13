package unk.HackBack.Entities.EmbeddedKeys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Embeddable
public class TranslationId implements Serializable {

    @NotNull
    @Size(max = 3)
    @Column(name = "LangID")
    private String langId;

    @NotNull
    @Size(max = 45)
    @Column(name = "RefID")
    private String refId;

    public TranslationId() {
        // Intentionally blank
    }

    public TranslationId(String langId, String refId) {
        this.langId = langId;
        this.refId = refId;
    }

    public String getLangId() {
        return langId;
    }

    public void setLangId(String langId) {
        this.langId = langId;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TranslationId that = (TranslationId) o;

        if (!this.langId.equals(that.langId)) {
            return false;
        }

        return this.refId.equals(that.refId);
    }

    @Override
    public int hashCode() {
        int result = langId.hashCode();
        result = 31 * result + refId.hashCode();
        return result;
    }
}
