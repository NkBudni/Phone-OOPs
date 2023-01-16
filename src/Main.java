public class Main {
    public static void main(String[] args) {

        LandLine l1=new LandLine("123456");
        LandLine l2=new LandLine("987654");

        l1.callNumber("987654");
        l2.recieveCall("987654");
        System.out.println(l2.answerCall());
    }
}