package org.behavioural.mediator;

public class HardDrive {
        private int red=0;
        public byte[] read(long lba, int size) {
                red = getRed() + 1;
                return new byte[]{}; }

        public int getRed() {
                return red;
        }
}
