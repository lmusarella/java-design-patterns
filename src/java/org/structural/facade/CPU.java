package org.structural.facade;

public interface CPU {
    void freeze();
    void jump(long position);
    void execute() ;
}
