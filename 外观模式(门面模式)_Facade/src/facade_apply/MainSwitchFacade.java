package facade_apply;

import facade_apply.system.Cpu;
import facade_apply.system.Disk;
import facade_apply.system.Gpu;
import facade_apply.system.Memory;

/**
 * @Author Mapleins
 * @Date 2019-06-14 14:33
 * @Description
 */
public class MainSwitchFacade {

    private Cpu cpu;
    private Gpu gpu;
    private Memory memory;
    private Disk disk;

    public MainSwitchFacade(Cpu cpu, Gpu gpu, Memory memory, Disk disk) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.memory = memory;
        this.disk = disk;
    }

    public void turnOn() {
        cpu.turnOn();
        gpu.turnOn();
        memory.turnOn();
        disk.turnOn();
    }

    public void turnOff() {
        cpu.turnOff();
        gpu.turnOff();
        memory.turnOff();
        disk.turnOff();
    }
}
