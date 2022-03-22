package com.github.jvanheesch;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DiscriminatorColumn(name = "TYPE")
public class Verslag {
    @Id
    @GeneratedValue
    private Long id;
    private String verslagText;

    public String getVerslagText() {
        return verslagText;
    }

    public void setVerslagText(String verslagText) {
        this.verslagText = verslagText;
    }
}
