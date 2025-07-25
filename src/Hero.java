public class Hero {
    private int hp;
    private String name;
    private Sword sword;

    public Hero(int hp, String name, Sword s) {
        setHp(hp);
        setName(name);
    }

    public String getName(){// 追加
        return this.name;
    }
    public void setName(String name){
        if(name == null){
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        this.name = name;
    }
    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp){
        if(hp < 0){
            throw new IllegalArgumentException("hpの値が負の数である。処理を中断");
        }
        this.hp = hp;
    }
    public void bye() {
        System.out.println("勇者は別れを告げた");
    }
    private void die() {
        System.out.println(this.name + "は死んでしまった！");
        System.out.println("GAME OVERです。");
    }
    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した！");
    }
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("お化けキノコ" + m.getSuffix() + "から100ポイントの反撃を受けた");
        this.hp -= 100;
        if (this.hp <= 0 ) {
            this.die();
        }
    }
}