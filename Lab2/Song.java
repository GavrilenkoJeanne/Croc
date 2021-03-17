package com.company;

public class Song {
        private String nameOfSong;
        private String nameOfPerformer;

        public Song(String nameOfSong, String nameOfPerformer){
            this.setNameOfSong(nameOfSong);
            this.setNameOfPerformer(nameOfPerformer);
        }

        public void setNameOfSong(String nameOfSong) {
            if (nameOfSong.isBlank()) {
                this.nameOfSong = " Неизвестный трек ";
            } else {
                this.nameOfSong = nameOfSong;
            }
        }

        public String getNameOfSong() {
            return this.nameOfSong;
        }

        public void setNameOfPerformer(String nameOfPerformer) {
            if (nameOfPerformer.isBlank()) {
                this.nameOfPerformer = " Неизвестный исполнитель ";
            } else {
                this.nameOfPerformer = nameOfPerformer;
            }
        }

        public String getNameOfPerformer() {
            return this.nameOfPerformer;
        }
}
