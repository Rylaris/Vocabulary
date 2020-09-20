package com.example.vocabulary.module;

/**
 * @author 软工1801温蟾圆
 *
 * 单词实体类
 */
public class Word {
    private String english;
    private String chineseInterpretation;

    public Word() {
    }

    public Word(String english, String chineseInterpretation) {
        this.english = english;
        this.chineseInterpretation = chineseInterpretation;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getChineseInterpretation() {
        return chineseInterpretation;
    }

    public void setChineseInterpretation(String chineseInterpretation) {
        this.chineseInterpretation = chineseInterpretation;
    }
}
