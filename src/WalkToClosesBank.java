import Utility.BankHandling;
import org.rspeer.script.Script;
import org.rspeer.script.ScriptMeta;

@ScriptMeta(developer = "Martin", desc = "Walks to closest bank", name = "Bank Walker")
public class WalkToClosesBank extends Script {



    @Override
    public int loop() {
        BankHandling.walkToNearestBank();
        return 500;
    }


}
