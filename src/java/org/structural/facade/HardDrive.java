package org.structural.facade;

public interface HardDrive {
    byte[] read(long lba, int size);
}
