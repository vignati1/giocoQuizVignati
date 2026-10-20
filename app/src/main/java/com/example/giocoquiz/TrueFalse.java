package com.example.giocoquiz;

public class TrueFalse {
    private int mQuestionId;//rappresenta l id della domanda
    private boolean mAnswer;//rappresenta l id della risposta

    public TrueFalse(int mQuestionId, boolean mAnswer){
        this.mQuestionId = mQuestionId;
        this.mAnswer = mAnswer;
    }

    public int getmQuestionId() {
        return mQuestionId;
    }

    public void setmQuestionId(int mQuestionId) {
        this.mQuestionId = mQuestionId;
    }

    public boolean ismAnswer() {
        return mAnswer;
    }

    public void setmAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}
