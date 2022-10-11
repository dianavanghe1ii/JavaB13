package object;
/*
=========Task==========
Cup class
    isClean
    size
    materialType
 !> include one method in the CUP class
 !> create constructor to initialize all instance variables
 !> in a separate class, create three cup objects and see how your coding works
 */

public class Cup {
    boolean isClean;
    int size;
    static String materialType;
    int count;
    //Constructor
    public boolean isClean(int size){
        this.size=size;
        System.out.println("This is isClean method");
        return isClean;
    }
    public boolean isClean(){
        System.out.println("This is isClean method");
        return isClean;
    }
    //constructor
    public Cup( int size){
        this.size=size;
    }
    //this will not compile since is a constructor above with the single parameter and same data type
//    public Cup(int count){
//        this.count=count;
//    }

    public Cup( boolean isClean, int size, String materialType){
        System.out.println("blahblah");
        this.isClean=isClean;
        this.size=size;
        this.materialType=materialType;
        this.isClean();
    }
    //Constructor
    public Cup(){
        // System.out.println();//wont work because when callin a contructor inside of another constructor has to be very first statement
        // we need to call the constructor, then you can do everything else

        this(true,5,"wood");
        System.out.println();
        System.out.println();
    }
}
