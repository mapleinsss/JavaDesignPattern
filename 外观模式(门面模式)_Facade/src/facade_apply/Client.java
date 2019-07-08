package facade_apply;

import facade_apply.system.Cpu;
import facade_apply.system.Disk;
import facade_apply.system.Gpu;
import facade_apply.system.Memory;

/**
 * @Author Mapleins
 * @Date 2019-06-14 14:34
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        MainSwitchFacade mainSwitchFacade = new MainSwitchFacade(new Cpu(), new Gpu(), new Memory(), new Disk());
        mainSwitchFacade.turnOn();
        System.out.println("----");
        mainSwitchFacade.turnOff();
    }
}
