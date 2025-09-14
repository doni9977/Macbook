package Builder;

public class Main{
    public static void main(String[] args){
        MacBook macbookPro = new MacBook.Builder()
                .withModel("MacBook Pro 16")
                .withCpu("Apple M3 Pro")
                .withRam(32)
                .withStrage(1024)
                .withColor("Space Blak")
                .build();
        MacBook macBookAir = new MacBook.Builder()
                .withModel("MacBook Air 13")
                .withCpu("Apple M2")
                .withRam(16)
                .withStrage(512)
                .withColor("Midnight")
                .build();

        System.out.println(macbookPro);
        System.out.println(macBookAir);
    }
}