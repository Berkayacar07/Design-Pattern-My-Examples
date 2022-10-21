package decorator;

public class PhoneShopMain {
    public static void main(String[] args) {
        Phone phone = new SamsungA7(ColourEnum.BLACK);
        phone = new Memory(phone);
        phone = new Colour(phone,ColourEnum.WHITE);
        phone = new Camera(phone);

        System.out.println(phone.getDescription()+"\n"+ phone.cost()+" TL");

        System.out.println("------------------------------------");
        Phone phone1 = new IPhone11(ColourEnum.GOLD);
        phone1 = new Colour(phone1,ColourEnum.WHITE);
        System.out.println(phone1.getDescription()+ "\n"+ phone1.cost()+ " TL");
    }
}
