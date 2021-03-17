package com.company;

	/**
	 * О спецификации кода:
	 *
	 * writeSong - основной метод класса SoundCarrier, который записывает песню на носитель для дальнейшего ее воспроизведения;
	 * play - основной метод абстрактного класса SoundDevice, переопределенный в его класах-наследниках (относящихся к носителям музыкальных композиций)
	 * и отвечающий непосредственно за воспроизведение записанных на носители (CD, FlashDrive, Vinyl) песен.
	 */

public class Main {

    public static void main(String[] args) {

    	CDPlayer cdPlayer = new CDPlayer();
    	UniversalPlayer universalPlayer = new UniversalPlayer();
        VinylPlayer vinylPlayer = new VinylPlayer();

	CD cd = new CD();
	FlashDrive flashDrive = new FlashDrive();
	Vinyl vinyl = new Vinyl();

	    Song song1 = new Song("Go Down Moses", "Louis Armstrong");
	    Song song2 = new Song("Stardust","Lester Young");

	    // cd.writeSong(song2);
	    vinyl.writeSong(song1);
	    flashDrive.writeSong(song2);

	    vinylPlayer.play(vinyl);
	    universalPlayer.play(flashDrive);
	    cdPlayer.play(vinyl);
	    cdPlayer.play(cd);



    }
}
