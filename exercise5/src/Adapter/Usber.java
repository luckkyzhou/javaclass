package Adapter;

// We call the Ps3 interface, but it returns the Usb port so we achieve the purpose of adaptation.
public class Usber implements Usb{
    @Override
    public void isUsb(){
        System.out.println("USB interface.");
    }
}
