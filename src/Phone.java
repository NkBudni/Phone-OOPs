public interface Phone {

    void powerOn();
    void callNumber(String phoneNo);
    void recieveCall(String phoneNo);
    boolean answerCall();
    boolean isRinging();

}
