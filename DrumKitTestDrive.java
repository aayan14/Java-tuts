class DrumKit {
    boolean snare = true;
    boolean topHat = true;

    void playSnare() {
        System.out.println("bang bang ba-bang");
    }

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
}

public class DrumKitTestDrive {
    public static void main(String[] arg) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();
        if (d.snare == true) {
            d.playSnare();
        }
    }
}
