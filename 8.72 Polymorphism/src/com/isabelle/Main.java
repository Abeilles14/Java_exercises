/*
 * isabelle andre
 * 25/07/18
 * polymorphism: when inheriting, parent class reference is used to refer child class object
 */

package com.isabelle;

class Movie {                           //classes in main class
    private String name;

    public Movie (String name) {
        this.name = name;
    }
    public String plot(){               //forgettable inherits plot from movie
        return "No plot";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {              //inheritance
    public Jaws() {
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie {                //no plot
    public Forgetable() {                       //inherits plot from parent class
        super("Forgetable");
    }
}



public class Main {
    public static void main(String[] args) {
        for (int i= 1; i<11; i++){
            Movie movie = randomMovie();            //"\n" = new line
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +"Plot: " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie(){                      //part of main class
        int randomNumber =  (int)(Math.random() * 5) +1;    //random number 1-5
        System.out.println("Random number generated was: " + randomNumber);

        switch (randomNumber){          //returns a movie object
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
