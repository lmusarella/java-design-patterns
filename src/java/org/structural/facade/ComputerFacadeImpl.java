package org.structural.facade;

public class ComputerFacadeImpl implements ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hd;

    @Override
    public void freeze() {
        this.cpu.freeze();
    }

    @Override
    public void jump(long position) {
        this.cpu.jump(position);
    }

    @Override
    public void execute() {
        this.cpu.execute();
    }

    @Override
    public byte[] read(long lba, int size) {
        return this.hd.read(lba,size);
    }

    @Override
    public void load(long position, byte[] data) {
        this.memory.load(position,data);
    }
}
