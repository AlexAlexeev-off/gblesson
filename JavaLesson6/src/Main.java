/*
Урок 6. Продвинутое ООП
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
 */
 
//это класс, в который входят два подкласса Cat, Dog
 
class Animal {
 
    public String name;
    public int run;
 
    public Animal() {
    }
 
    public Animal(String name) {
        this.name = name;
    }
 
    public void animalInfo() {
        System.out.println();
 
    }
}

//это подкласс Cat
class Cat extends Animal {
 
   protected boolean sweem;
   int jump;
 
//конструктор
 
    public Cat(String name, int run, boolean sweem, int jump) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }
 
    //выводим информацию в консоль
    public void catInfo() {
        System.out.println("Имя кота: " + name + " - бег: " + run + ", плавание: " + sweem + ", прыыжок: " + jump);
    }
}
 
//это подкласс dog
class Dog extends Animal {
 
    public double jump;
    public int sweem;
 
        //конструктор
 
        public Dog(String name, int run, int sweem, double jump ) {
            this.name = name;
            this.run = run;
            this.sweem = sweem;
            this.jump = jump;
        }
        //выводим информацию в консоль
        public void dogInfo() {
            System.out.println("Имя собаки: " + name  + " - бег: " + run + ", плавание:" + sweem + ", прыжок: " + jump);
        }
    }
 
public class Main {
    public static void main(String[] args) {
 
        Animal animal = new Animal("CatsCategory");
        Cat cat = new Cat("Барсик", 200, false, 2);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();
 
        Animal danimal = new Animal("Dogs");
        Dog dog = new Dog("Шарик", 500, 10, 0.5);
        danimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();
 
   }
}
