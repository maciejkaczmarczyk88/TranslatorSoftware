package com.example.TranslatorSoftware;

import org.springframework.stereotype.Repository;

@Repository
public class Entry {

    private String original;
    private String translation;

    public Entry(String original, String translation) {
        this.original = original;
        this.translation = translation;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "original='" + original + '\'' +
                ", translation='" + translation + '\'' +
                '}';
    }
}
