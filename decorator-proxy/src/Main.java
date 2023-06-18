import com.example.decorator.DiamondSword;
import com.example.decorator.EnchantedSword;
import com.example.decorator.Sword;
import com.example.decorator.WoodenSword;
import com.example.proxy.Backend;
import com.example.proxy.BigIpProxy;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Decorator
        Sword woodenSword = new WoodenSword();
        Sword diamondSword = new DiamondSword(woodenSword);
        Sword enchantedDiamondSword = new EnchantedSword(diamondSword);

        enchantedDiamondSword.attack();


        //Proxy
        Backend javaBackend = new Backend();

        BigIpProxy sgsProxy = new BigIpProxy(javaBackend, Set.of("SGS"));

        sgsProxy.executeRequest("GET /api/users", "SGS");
        sgsProxy.executeRequest("GET /api/users", "Hacker");

    }

}
