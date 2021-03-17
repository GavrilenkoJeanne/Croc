package com.company;

public class Main {

    public static void main(String[] args) {

    	CDPlayer cdPlayer = new CDPlayer();
    	UniversalPlayer universalPlayer = new UniversalPlayer();
		VinylPlayer vinylPlayer = new VinylPlayer();

		CD cd = new CD();
		FlashDrive flashDrive = new FlashDrive();
		Vinyl vinyl = new Vinyl();

	    Song song1 = new Song("h", "gf");
	    Song song2 = new Song("f","fa");

	    // cd.writeSong(song2);
	    vinyl.writeSong(song1);
	    flashDrive.writeSong(song2);

	    vinylPlayer.play(vinyl);
	    universalPlayer.play(flashDrive);
	    cdPlayer.play(vinyl);
	    cdPlayer.play(cd);



    }
}
