package classwork;

import java.time.Year;

public class Computer {
    private String cpu;
    private String model;
    private Integer ram;
    private Integer year;

    public Computer(String cpu, String model, Integer ram, Integer year){
        this.cpu = cpu;
        this.model = model;
        this.ram = ram;
        this.year = year;
    }

    public void start(){
        System.out.println("System starting");
    }
    public void shutdown(){
        System.out.println("System shutting down");
    }
    public void displaySpec(){
        System.out.println("CPU: " + cpu + "\nModel: " + model + "\nRAM: " + ram + "\nYear: " + year);
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

}

