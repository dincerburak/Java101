package BoksOyunu;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {

    Fighter fighter1 = new Fighter("Mete", 100, 105, 14, 50);
    Fighter fighter2 = new Fighter("Burak", 95, 120, 16, 40);

    Match match = new Match(fighter1,fighter2 ,90,110);
        match.run();
    }
}
