package ooppartone;

public class Computer {

    //Instance Variables

    private String GPU;
    private String CPU;
    private Integer RAMinGB;

    //Empty Constructor

    public Computer() {
        GPU = "Graphics Card";
        CPU = "Central Processing Unit";
        RAMinGB = 0;
    }
    public Computer(String myGPU, String myCPU, Integer myRAMinGB) {
        this.GPU = myGPU;
        this.CPU = myCPU;
        this.RAMinGB = myRAMinGB;
    }
    //Getters
    public String getGPU() {
        return GPU;
    }
    public String getCPU() {
        return CPU;
    }
    public Integer getRAM() {
        return RAMinGB;
    }

    //Setters
    public void setGPU(String newGPU) {
        this.GPU = newGPU;
    }
    public void setCPU(String newCPU) {
        this.CPU = newCPU;
    }
    public void setRAMinGB(Integer newRAM) {
        this.RAMinGB = newRAM;
    }

    //Other Methods

    public boolean shouldIDownloadMoreRam() {
        if(this.RAMinGB >= 16) {
            System.out.println("You don't need to download more RAM.");
            return false;

        } else {
            System.out.println("Download more RAM!");
            return true;
        }
    }
    public String whatComputerDoYouHave() {
        String response = "I have a "+ this.GPU + " graphics card, an " + this.CPU + " as my CPU, and " + this.RAMinGB + " gigabytes of RAM.";
        System.out.println(response);
        return response;

    }
}
