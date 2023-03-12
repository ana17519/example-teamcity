package plaindoll;

import org.apache.commons.lang3.RandomStringUtils;

public class Welcomer {
    public String sayWelcome() {
        return "Welcome home, good hunter. What is it your desire?";
    }

    public String sayFarewell() {
        return "Farewell, good hunter. May you find your worth in waking world.";
    }

    public String sayNeedGold() {
        return "Not enough gold";
    }

    public String saySome() {
        return "something in the way";
    }

    // 	Напишите новый метод для класса Welcomer: метод должен возвращать произвольную реплику, содержащую слово hunter.
    public String sayArbitraryReplicaWithHunter() {
        String random = RandomStringUtils.random(10, true, false);
        return random + " hunter " + random;
    }
}
