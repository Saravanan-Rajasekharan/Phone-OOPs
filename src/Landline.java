public class Landline implements Phone{

    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerON;


    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isRinging = false;
        this.isPowerON = true;

    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerON() {
        return isPowerON;
    }

    public void setPowerON(boolean powerON) {
        isPowerON = powerON;
    }

    @Override
    public void powerOn() {
        this.isPowerON = true;

    }

    //Call Number



    @Override
    public void callNumber(String phoneNo) {
        if(isPowerON){
            System.out.println("You are dialling no: "+ phoneNo);

        }else {
            System.out.println("Your landline is off");
        }

    }

    //Receive call

    @Override
    public void receiveCall(String phoneNo) {

        if(isPowerON && myPhoneNo.equals(phoneNo)){
            this.isRinging = true;
            System.out.println("You are getting a call");

        }else{
            System.out.println("Call not received");
        }

    }

    //Answer the call

    @Override
    public boolean answerCall() {
        if(isRinging){
            System.out.println("call answered");
            isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
