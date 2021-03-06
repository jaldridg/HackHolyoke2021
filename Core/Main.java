package Core;

import java.awt.Container;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import GUI.UpgradePanel;
import Levels.PhysicsEngine;
import Levels.TheOnlyLevel;

public class Main extends JComponent implements Runnable {

    private Image image;
    private Graphics2D graphics2D;

    private PhysicsEngine pe;
    private TheOnlyLevel levelPanel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Main());
    }

    public Main() {
        pe = new PhysicsEngine();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse pressed");
            }
        });
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyChar());
            }
        });
    }

    public void run() {
        JFrame frame = new JFrame("Game");

        Container content = frame.getContentPane();

        //content.add(new Main());
        content.setLayout(new BorderLayout());

        frame.setLayout(new GridLayout(1, 0));
        frame.setSize(1000, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        UpgradePanel upgradePanel = new UpgradePanel(); 
        
        levelPanel = new TheOnlyLevel();

        content.add(upgradePanel);
        content.add(levelPanel);

        pe.movePlayer();
        repaint();
    }

    public void paintComponent(Graphics g) {
        levelPanel.paintComponent(g);
    }

    /*
    private synchronized void start() { // starts the game if it isn't started
        if(running) return;

        running = true;
        thread = new Thread(this);
        thread.start();
    }

    private synchronized void stop() {
        if (!running) return;

        running = false;
        try{
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(1);
    }

    
        // Running the game
        long lastTime = System.nanoTime();
        final double numOfTicks = 60.0; // Limits us to 60 FPS
        double numOfUpdates = 1000000000 / numOfTicks;
        double deltaTime = 0;
        int updates = 0;
        int frames = 0;
        long timer = System.currentTimeMillis();

        this.start();
        while(running) {
            long currTime = System.nanoTime();
            deltaTime += (currTime - lastTime) / numOfUpdates;
            lastTime = currTime;
            if (deltaTime >= 1) { // Only updates the game 60 times a second
                update();
                updates++;
                deltaTime --;
            }
            render(); // Renders the game about 8 million times a second (depending on your computer)
            frames++;

            if(System.currentTimeMillis() - timer > 1000) { // After a second passes, reset the updates and frames
                timer += 1000;
                // System.out.println(updates + " Ticks, " + frames + " Frames");
                updates = 0;
                frames = 0;
            }
            // NOTE: Game currently doesn't stop unless you type crtl+C/cmd+C in the command line
        }
        this.stop();
    }

    public static void clearLevel() {} // Clears the level to create the next one


    private void update() { // Updates the game elements

    }

    private void render() { // Renders the game elements

    }

    */
}