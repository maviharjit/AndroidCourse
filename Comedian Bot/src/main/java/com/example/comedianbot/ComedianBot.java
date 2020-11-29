package com.example.comedianbot;

import java.util.ArrayList;

/* crated by learnovate */
public class ComedianBot extends JokeBot {

    public ComedianBot(ArrayList<Joke> jokesIKnow) {
        super(jokesIKnow);
        jokesIKnow = JokeWriter.getJokeListTwo();
    }

    public void performShow(){
        talk("hello my name is " + getName());
        talk("let me tell you a few jokes");

        for (Joke joke : jokesIKnow) {
            sayJoke(joke);
        }

        talk("thanks everyone, goodnight");
    }

    @Override
    protected void sayJoke(Joke aJoke){
        talk(aJoke.getJokeSetup() + "..." + aJoke.getJokePunchline());
    }
}
