package com.geekbrains.lesson6;


public class NoteBook {

    private String RAM;
    private String diskSize;
    private String operatingSystem;
    private String color;

    public NoteBook(String RAM, String diskSize, String operatingSystem, String color) {
        this.RAM = RAM;
        this.diskSize = diskSize;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getProperty(String key) {
        switch(key) {
            case "1": return RAM;
            case "2": return diskSize;
            case "3": return operatingSystem;
            case "4": return color;
            default: return null;
        }
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "RAM='" + RAM + '\'' +
                ", diskSize='" + diskSize + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
