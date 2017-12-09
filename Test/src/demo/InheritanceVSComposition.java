package demo;

class Insect {
    private int size;
    private String color;
 
    public Insect(int size, String color) {
        this.size = size;
        this.color = color;
    } 
 
    public void move() {
        System.out.println("Move");
    }
 
    public void attack() {
        move();  //假设昆虫在攻击前必须要先移动一次
        System.out.println("Attack");
    } 
}

class Bee extends Insect {
    public Bee(int size, String color) {
        super(size, color);
    }
 
    public void move() {
    	System.out.println("Fly");
    	super.move();
        
    }
 
    public void attack() {
        move();
        // System.out.println("Attack");
        super.attack();
    }
}


public class InheritanceVSComposition {
    public static void main(String[] args) {
        Insect i = new Bee(1, "red");
        i.attack();
    }
}

