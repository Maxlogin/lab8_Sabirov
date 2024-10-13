package zad3;

public class Practicum {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Mouse mouse = new Mouse();
        Cow cow = new Cow();
        Frog frog = new Frog();
        Elephant elephant = new Elephant();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Seal seal = new Seal();
        System.out.println("Dog goes " + dog.say());
        System.out.println("Cat goes " + cat.say());
        System.out.println("Bird goes " + bird.say());
        System.out.println("And mouse goes " + mouse.say());
        System.out.println("Cow goes " + cow.say());
        System.out.println("Frog goes " + frog.say());
        System.out.println("And the elephant goes " + elephant.say());
        System.out.println("Ducks say " + duck.say());
        System.out.println("And fish go " + fish.say());
        System.out.println("And the seal goes " + seal.say());
        System.out.println(" ");
        System.out.println("Дальше продолжение песни");
        System.out.println("But there's one sound that no one knows\n" + //What does the fox say?
                "\n" +
                "What does the fox say?\n" +
                "\"Ring-ding-ding-ding-dingeringeding!\n" +
                "Gering-ding-ding-ding-dingeringeding!\n" +
                "Gering-ding-ding-ding-dingeringeding!\"\n" +
                "What the fox say?\n" +
                "\"Wa-pa-pa-pa-pa-pa-pow!\n" +
                "Wa-pa-pa-pa-pa-pa-pow!\n" +
                "Wa-pa-pa-pa-pa-pa-pow!\"\n" +
                "What the fox say?\n" +
                "\"Hatee-hatee-hatee-ho!\n" +
                "Hatee-hatee-hatee-ho!\n" +
                "Hatee-hatee-hatee-ho!\"\n" +
                "What the fox say?\n" +
                "\"Joff-tchoff-tchoffo-tchoffo-tchoff!\n" +
                "Tchoff-tchoff-tchoffo-tchoffo-tchoff!\n" +
                "Joff-tchoff-tchoffo-tchoffo-tchoff!\"\n" +
                "What the fox say?");
    }
}

class Animal {
    public String say() {
        return "I'm an Animal!";
    }
}

class Dog extends Animal {
    @Override
    public String say() {
        return "woof";
    }
}

class Cat extends Animal {
    @Override
    public String say() {
        return "meow";
    }
}

class Bird extends Animal {
    @Override
    public String say() {
        return "tweet";
    }
}

class Mouse extends Animal {
    @Override
    public String say() {
        return "squeek";
    }
}

class Cow extends Animal {
    @Override
    public String say() {
        return "moo";
    }
}

class Frog extends Animal {
    @Override
    public String say() {
        return "croak";
    }
}

class Elephant extends Animal {
    @Override
    public String say() {
        return "toot";
    }
}

class Duck extends Animal {
    @Override
    public String say() {
        return "quack";
    }
}

class Fish extends Animal {
    @Override
    public String say() {
        return "blub";
    }
}

class Seal extends Animal {
    @Override
    public String say() {
        return "ow ow ow";
    }
}