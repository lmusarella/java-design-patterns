package org.behavioural;

import org.behavioural.mediator.CPU;
import org.behavioural.mediator.ComputerMediator;
import org.behavioural.mediator.HardDrive;
import org.behavioural.mediator.Memory;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MediatorTest {
    @Test
    public void shouldInvokeAllSubMethods(){
        //Given
        CPU cpu = new CPU();
        HardDrive hd = new HardDrive();
        Memory ram = new Memory();
        ComputerMediator target = new ComputerMediator(cpu, ram,hd);

        //When
        target.start();

        //Then
        assertEquals(1,cpu.getExecuted());
        assertEquals(1,cpu.getFrozen());
        assertEquals(1,cpu.getJumped());
        assertEquals(1,hd.getRed());
        assertEquals(1,ram.getLoaded());
    }
}
