package POLYMORPHISM;

class Sports {
    void play() {
        System.out.println("Playing a sport....");
    }
}

class Football extends Sports {
    @Override
    void play() {
        System.out.println("Playing Football!");
    }
}

class BasketBall extends Sports {
    @Override
    void play() {
        System.out.println("Playing Basketball!");
    }
}

class Rugby extends Sports {
    @Override
    void play() {
        System.out.println("Playing Rugby!");
    }
}

class MainSports {
    public static void main(String[] aa) {
        Sports s = new Sports();
        Football f = new Football();
        BasketBall bb = new BasketBall();
        Rugby r = new Rugby();

        s.play();
        f.play();
        bb.play();
        r.play();
    }
}