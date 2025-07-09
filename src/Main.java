public class Main {
    public static void main(String[] args) {
        Sword s = new Sword("ふつうの剣",10);
        Hero h = new Hero(40,"ミナト",s);
        System.out.println(h.getName() + "の現在のHP: " + h.getHp());

        King k = new King();
        k.talk(h);

        Inn i = new Inn();
        System.out.println("宿屋で回復中...");
        i.checkIn(h);
        System.out.println(h.getName() + "の現在のHP: " + h.getHp());
        h.sleep();

        Matango m = new Matango(10,'A');
        h.attack(m);
    }
}