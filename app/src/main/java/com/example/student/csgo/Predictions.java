package com.example.student.csgo;

import java.util.Random;

public class Predictions {

    private static Predictions predictions;
    private String[] answers;
    private Random random = new Random();
    private int rnd;

    private Predictions() {
        answers = new String[] {
                "You have  recieved an AK-47 Elite-Build!",
                "You have  recieved an AWP Assimov!",
                "You have  recieved a AUG Fleet Flock!",
                "You have  recieved a Galil Chatter-Box!",
                "You have recieved a Karambit Gamma Doppler!"

        };
    }

    public static Predictions get() {
        if(predictions == null) {
            predictions = new Predictions();
        }
        return predictions;
    }

    public String getPrediction() {
        rnd  = random.nextInt(answers.length);
        return answers[rnd];
    }
}