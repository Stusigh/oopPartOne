package ooppartone;

public class Main {
    public static void main(String[] args) {
        Pet mowgli = new Pet("Mowgli", "New Orleans", "Cat", 3);
        System.out.println(mowgli.getAge());
        System.out.println(mowgli.getName());
        System.out.println(mowgli.getType());

        Pet theDog = new Pet();
        System.out.println(theDog.getAge());
        System.out.println(theDog.getName());
        System.out.println(theDog.getType());

        Computer emptyComputer = new Computer();
        Computer unfinishedComputer = new Computer("Nvidia GeForce GTX 1650", "Intel Celeron G4930");
        Computer fastComputer = new Computer("AMD Radeon RX6800", "AMD Ryzen 5", 32);
        Computer slowComputer = new Computer("AMD Radeon R9 285", "Intel Pentium 4", 2);

        emptyComputer.whatComputerDoYouHave();
        emptyComputer.shouldIDownloadMoreRam();

        unfinishedComputer.whatComputerDoYouHave();
        unfinishedComputer.shouldIDownloadMoreRam();

        slowComputer.whatComputerDoYouHave();
        slowComputer.shouldIDownloadMoreRam();

        fastComputer.whatComputerDoYouHave();
        fastComputer.shouldIDownloadMoreRam();

    }
}
