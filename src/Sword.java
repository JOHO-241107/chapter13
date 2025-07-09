public class Sword {
    private String name;
    private int damage;
    public Sword(String name, int damage) {
        setName(name);
        setDamage(damage);
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if(name == null){
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        this.name = name;
    }
    public int getDamage(){
        return this.damage;
    }
    public void setDamage(int damage){
        if(damage < 0){
            throw new IllegalArgumentException("damegeの値が負の数である。処理を中断");
        }
        this.damage = damage;
    }
}