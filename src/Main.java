class main{
    public static void main(String[] args) {
        Mage mage1 = new Mage("Ruslandiy", 15, 75, "fire");
        Mage mage2 = new Mage("Misha", 17, 66, "ice");
        Mage mage3 = new Mage("Alex", 15, 75, "earth");
        Mage mage4 = new Mage("Maria", 15, 70, "fire");
        Mage mage5 = new Mage("Lera", 15, 75, "fire");

        System.out.println(mage1.fight(mage5));
    }
}