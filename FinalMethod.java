
class Android{
    //    final void ringtone() {
//        System.out.println("Mobile phone is ringing.");
//    }
    void ringtone() {
        System.out.println("Mobile phone is ringing.");
    }

}

class Samsung extends Android{
    @Override
    void ringtone() {
        System.out.println("Samsung is ringing.");
    }
}

class FinalMethod {
    public static void main(String[] args) {
        //creating the object of Android
        Android obj1=new Android();
        obj1.ringtone(); //It will invoke the method in the parent class

        Samsung obj2=new Samsung();
        obj2.ringtone(); //Cannot invoke ringtone() from child class as the
        //parent class has marked it final.
    }
}