package unk.HackBack.Models;

public class TestObject {

    private String word1;
    private String word2;

    public TestObject(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    public String getWord1() {
        return word1;
    }

    public String getWord2() {
        return word2;
    }

    public String toString() {
        return word1 + " " + word2;
    }
}
