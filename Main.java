public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("bully");
        dog.setAge("3 tủi ");
        dog.setEat(" không ăn chuôt");
        System.out.println("Dog name :" + dog.getName());
        System.out.println("Dog age :" + dog.getAge());
        System.out.println("Dog eat :" + dog.getEat());
        dog.sound();
        Cat cat = new Cat();
        cat.setName("kiti");
        cat.setAge("2 tuổi ");
        cat.setEat("ăn được chuột");
        System.out.println("Cat name :" + cat.getName());
        System.out.println("Cat age :" + cat.getAge());
        System.out.println("Cat eat :" + cat.getEat());
        cat.sound();
    }
}