public class PhoneWork {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.receiveCall("Серова Екатерина");
        phone.sendMessage(new String[] { "8 (800) 555-55-50", "03", "112", "562439", "459845" });

        Phone Myphone = new Phone("562439", "Techo Camon 19");
        Phone actualPhone = new Phone("8 (800) 555-55-50", "Techo Camon 19", 256);

        Myphone.receiveCall("СберБанк", "8 (800) 555-55-50");
        System.out.println(actualPhone.getNumber());
    }
}
