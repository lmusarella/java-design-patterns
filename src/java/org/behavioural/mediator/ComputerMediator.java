package org.behavioural.mediator;

public class ComputerMediator {
	
    private static final long BOOT_ADDRESS = 1;
    private static final long BOOT_SECTOR = 2 ;
    private static final int SECTOR_SIZE = 2;

    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerMediator(CPU processor,Memory ram,HardDrive hd) {
        this.processor = processor;
        this.ram = ram;
        this.hd = hd;
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
