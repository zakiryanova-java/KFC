public class Main {
    public static void main(String[] args) {
        Product burger = new Product();
        burger.id = 1018;
        burger.name = "Longer BBQ";
        System.out.println(burger.name);
        burger.weight = 107;
        burger.kcal = 236;
        burger.carbs = 33.3;
        System.out.println(burger.carbs);
        burger.fat = 7.1;
        burger.protein = 9.7;
        System.out.println(burger.removed);

    }
}
