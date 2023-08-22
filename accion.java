import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;


class accion extends Thread {
    private String musica;

    public accion(String musica) {
        this.musica = musica;
    }

    public void run() {
         playMusic(musica);
     
    }

    public void playMusic(String ubicacion) {
        try {
            File camino = new File(ubicacion);

            if (camino.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(camino);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();

                Thread.sleep(clip.getMicrosecondLength() / 10);
                clip.close();

            } else {
                System.out.println("No se encuentra el archivo de audio.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

 
}