package recap.abstraction;

public class ExtendingChild extends AbstractParent implements OptionalStuff {


    public ExtendingChild(int var1, int var4, String var2, boolean var3) {
        super(var1, var4, var2, var3);
    }

    @Override
    public int getSumOfVar1And4() {
        return var1+var4;
    }


    @Override
    public String getFirstThreeCharsOfVar2() {
        return var2.substring(0,3);
    }

    @Override
    public boolean isPhoneOnOrOff(String sentence) {
        return sentence.toLowerCase().contains(" on");

    }

    public static void main(String[] args) {
        ExtendingChild abstractParent = new ExtendingChild(2, 3, "String",  true); {
            System.out.println(abstractParent.var1);
            System.out.println(abstractParent.var4);
            System.out.println("Sum of var1 and var4 = " + abstractParent.getSumOfVar1And4());

            System.out.println("Var2 = " + abstractParent.var2);
            System.out.println("Var2's first three character = " + abstractParent.getFirstThreeCharsOfVar2());


            System.out.println(abstractParent.isPhoneOnOrOff("My phone is on"));
            System.out.println(abstractParent.isPhoneOnOrOff("My phone is off"));
        }


    }

}
