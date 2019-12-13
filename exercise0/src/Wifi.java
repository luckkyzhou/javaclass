public class Wifi {
    private String name;
    private String password;
    private String signalStrength;
    private String routerName;
    private String encryptionMethod;
    private int installationYear;
    private int lanNumbers;
    private boolean capable;


    public void isCapable(){
        if (capable){
            System.out.println(name + "is available");
        } else {
            System.out.println(name + "is not available");
        }
    }

    public void hasPassword(){
        if (password != ""){
            System.out.println(name + "has password.");
        } else {
            System.out.println(name + "doesn't have password.");
        }
    }

    public void nameAndSignalStrength(){
        System.out.println(name + "has" + signalStrength + "signal.");
    }

    public Wifi(String name, String password, String signalStrength, String routerName, String encryptionMethod, int installationYear, int lanNumbers, boolean capable){
        this.name = name;
        this.password = password;
        this.signalStrength = signalStrength;
        this.routerName = routerName;
        this.encryptionMethod = encryptionMethod;
        this.installationYear = installationYear;
        this.lanNumbers = lanNumbers;
        this.capable = capable;
    }
}
