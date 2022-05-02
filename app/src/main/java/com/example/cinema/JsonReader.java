package com.example.cinema;

public class JsonReader {
    private String keyword;
    private String lenght_of_word;

    public JsonReader(String keyword, String lenght_of_word) {
        this.keyword = keyword;
        this.lenght_of_word = lenght_of_word;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getLenght_of_word() {
        return lenght_of_word;
    }

}
