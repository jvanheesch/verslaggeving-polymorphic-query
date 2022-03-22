package com.github.jvanheesch;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("NOTITIE")
public class Notitie extends Verslag {
    private String notitieText;

    public String getNotitieText() {
        return notitieText;
    }

    public void setNotitieText(String text) {
        this.notitieText = text;
    }
}
