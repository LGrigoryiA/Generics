public class Main {
    public static void main(String[] args) {
        MagicBox<String> box1 = new MagicBox(3);
        box1.add("Pety");
        box1.add("Nasty");
        box1.add("Max");


        System.out.println(box1.pick());
    }
}
