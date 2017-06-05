package mypackage.chain;

/**
 * Created by RENT on 2017-06-02.
 */
public class FireFighterChainElement implements ChainElement {

    @Override
    public boolean isMyResponsibility(int phoneNumber) {
        return phoneNumber == 998;
    }

    @Override
    public void doAction(int phoneNumber) {
        System.out.println("Calling firefighter");
    }
}
