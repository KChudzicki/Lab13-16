package Lab15;

public class PlayerSym {
    public static void main(String[] args) {
        Song[] library =new Song[3];
        library[0] = new Song("Michael Jackson","Beat It","Thriller");
        library[1]= new Song("Perlm Jam","Even Flow", " Ten");
        library[2]=new Song("Protishead","Over","NCY Live");

       Player[] players = {new CD(library), new Mp3(library)};
       players[0].play();
        players[0].stop();
        players[0].pause();
        players[0].next();
        players[0].play();
        players[0].previous();
        players[0].play();

        System.out.println();

        players[1].play();
        players[1].pause();
        players[1].stop();
        players[1].next();
        players[1].next();
        players[1].play();

    }
        }


