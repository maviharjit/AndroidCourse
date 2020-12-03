package com.example.comedianbot;

import java.util.ArrayList;

/** created by learnovate */
public class JokeWriter {
    public static ArrayList<Joke> getJokeListOne() {

        Joke j;
        ArrayList<Joke> jokeList = new ArrayList<Joke>();

        jokeList.add(new Joke("Why couldnt the bicycle stand up?",
                "Because it was two tired"));
        jokeList.add(new Joke("What do you call a cheese the isnt yours?",
                "Nacho Cheese!"));
        jokeList.add(new Joke("Before I criticize a man, I like to talk a mile in his shoes",
                "That way, I'm a mile away and has his shoes"));
        jokeList.add(new Joke("What do you call a fish with no eye?",
                "Fshh"));
        jokeList.add(new Joke("Have you heard the one about Corduroy pillow?",
                "It's making HEADLINES!"));
        jokeList.add(new Joke("Whats red and bad for your teeth?",
                "A brick"));
        return jokeList;
    }

    public static ArrayList<Joke> getJokeListTwo() {

        Joke j;
        ArrayList<Joke> jokeList = new ArrayList<Joke>();

        jokeList.add(new Joke("Why didn't the melons marry?",
                "Because they cantaloupe"));
        jokeList.add(new Joke("What did the cobbler say when a car wandered into his shop?",
                "Shoe!"));
        jokeList.add(new Joke("What did the Buddhist say to the hot dog vendor?",
                "Make me one with evreything!"));
        jokeList.add(new Joke("The face of a child can say everything!",
                "especially the mouth part of face"));
        jokeList.add(new Joke("Why did the cookie go to the hospital?",
                "Because he felt crummy"));
        jokeList.add(new Joke("I intend to live forever",
                "So far, so good"));
        return jokeList;
    }
}
