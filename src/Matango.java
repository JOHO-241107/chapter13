public class Matango {
    private int hp;
    private final int LEVEL = 10;
    private char suffix;
    public Matango(int hp, char suffix) {
        this.hp = hp;
        this.suffix = suffix;
    }

    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        if(hp < 0){
            throw new IllegalArgumentException("hpの値が負の数である。処理を中断");
        }
        this.hp = hp;
    }

    public char getSuffix() {
        return suffix;
    }
    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }

    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
}