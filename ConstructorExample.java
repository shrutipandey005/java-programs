class ConstructorExample {
    int x;

    ConstructorExample(int a) {
        x = a;
    }

    void display() {
        System.out.println("Value = " + x);
    }

    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample(10);
        obj.display();
    }
}
