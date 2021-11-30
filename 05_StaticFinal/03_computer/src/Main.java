public class Main {
    public static void main(String[] args) {

        Cpu cpu = new Cpu(1000, 1,"123", 10);
        Ram ram = new Ram(TypeRam.DDR2, 1000, 10);
        HardDisk hardDisk = new HardDisk(TypeHardDisk.SSD, 1000, 10);
        Monitor monitor = new Monitor(TypeMonitor.TN, 20, 10);
        Keyboard keyboard = new Keyboard(TypeKeyboard.BLUETOOTH, false, 10);

        Computer comp1 = new Computer("LG", "Big", cpu, ram, hardDisk, monitor, keyboard);

        Cpu cpu1 = new Cpu(2500, 8, "Athlon", 190);
        Ram ram1 = new Ram(TypeRam.DDR4, 4096, 200);
        HardDisk hardDisk1 = new HardDisk(TypeHardDisk.HDD, 1024, 200);
        Monitor monitor1 = new Monitor(TypeMonitor.IPS, 28, 200);
        Keyboard keyboard1 = new Keyboard(TypeKeyboard.NOBLUETOOTH, true, 200);

        Computer comp2 = comp1.setParametrs("Siemens", "Fast", cpu1, ram1, hardDisk1, monitor1, keyboard1);

        System.out.println(comp1);
        System.out.println(comp2);
    }
}
