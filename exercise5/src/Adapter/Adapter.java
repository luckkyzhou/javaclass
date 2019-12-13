package Adapter;

// Usb interface and Ps3 interface can not be used directly with each other, so create a adapter to adapt them.
public class Adapter extends Usber implements Ps3 {
    @Override
    public void isPs3(){
        isUsb();
    }
}
