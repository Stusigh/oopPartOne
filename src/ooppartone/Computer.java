package ooppartone;

public class Computer {

    //Instance Variables

    private String gpu;
    private String cpu;
    private Integer ramInGb;

    //Empty Constructor

    public Computer() {
        gpu = "Graphics Card";
        cpu = "Central Processing Unit";
        ramInGb = 0;
    }

    public Computer(String myGPU, String myCPU) {
        this.gpu = myGPU;
        this.cpu = myCPU;
        this.ramInGb = 0;
    }


    public Computer(String myGPU, String myCPU, Integer myRAMinGB) {
        this.gpu = myGPU;
        this.cpu = myCPU;
        this.ramInGb = myRAMinGB;
    }
    //Getters
    public String getGpu() {
        return gpu;
    }
    public String getCpu() {
        return cpu;
    }
    public Integer getRAM() {
        return ramInGb;
    }

    //Setters
    public void setGpu(String newGPU) {
        this.gpu = newGPU;
    }
    public void setCpu(String newCPU) {
        this.cpu = newCPU;
    }
    public void setRamInGb(Integer newRAM) {
        this.ramInGb = newRAM;
    }

    //Other Methods

    public boolean shouldIDownloadMoreRam() {
        if(this.ramInGb >= 16) {
            System.out.println("You don't need to download more RAM.");
            return false;
        } else {
            System.out.println("Download more RAM!");
            return true;

        }
    }
    public String whatComputerDoYouHave() {
        if (this.cpu == "Central Processing Unit" && this.gpu == "Graphics Card" && this.ramInGb == 0) {
            String response = "You don't even have a computer.";
            System.out.println(response);
            return null;
        } else {
            String response = "I have a " + this.gpu + " graphics card, an " + this.cpu + " as my CPU, and " + this.ramInGb + " gigabytes of RAM.";
            System.out.println(response);
            return response;
        }
    }
}
