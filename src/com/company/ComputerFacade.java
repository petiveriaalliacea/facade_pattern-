package com.company;

public class ComputerFacade {
    private CPU cpu;
    private VideoCard videoCard;
    private PowerSupply powerSupply;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.videoCard = new VideoCard();
        this.powerSupply = new PowerSupply();
    }

    public void run() {
        cpu.processData();
        videoCard.outputImages();
        powerSupply.powerComponents();
    }
}
