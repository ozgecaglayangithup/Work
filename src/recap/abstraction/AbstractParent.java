package recap.abstraction;

public abstract class  AbstractParent {


    static {
        System.out.println("This is static block");
    }

    {
        System.out.println("Non-static block");
    }


    public AbstractParent(int var1,int var4, String var2, boolean var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
    }

    public int var1;
    public int var4;
    public String var2;
    public boolean var3;

    public abstract int getSumOfVar1And4();

    //  create an abstract method which will get the first three characters of the var2
    //and implement it in the child class


    public abstract String getFirstThreeCharsOfVar2();






}
