package com.github.jvanheesch;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MEMO")
public class Memo extends Verslag {
    private String memoText;

    public String getMemoText() {
        return memoText;
    }

    public void setMemoText(String text) {
        this.memoText = text;
    }
}
