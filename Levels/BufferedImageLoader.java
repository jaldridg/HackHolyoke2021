package Levels;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

// Code referenced: https://youtu.be/1TFDOT1HiBo?t=430

public class BufferedImageLoader {

    private BufferedImage image;
    
    public BufferedImage loadImage(String path) {

        try{
            image = ImageIO.read(getClass().getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}
