interface Camera{
    void takePicture();
    void takeVideo();
}

interface Music{
    void hearSong();
    void seeMovie();
}

class Mobile implements Camera,Music{
    public void takePicture(){
        System.out.println("Picture is saved in gallery..");

    }

    public void takeVideo(){
        System.out.println("the video is very high quality ..");

    }

    public void hearSong(){
        System.out.println("Spotify is opeded for song ..");
    }

    public void seeMovie(){
        System.out.println("See new movie now released...");
    }
} 
public class multiple_inheritance1 {
    public static void main(String[] args) {
        Mobile vivo = new Mobile();
        vivo.takePicture();
        vivo.takeVideo();
        vivo.hearSong();
        vivo.seeMovie();
        System.out.println();

        Camera cam = new Mobile();
        cam.takePicture();
        cam.takeVideo();
        System.out.println();

        Music song = new Mobile();
        song.hearSong();
        song.seeMovie();
    }
}


