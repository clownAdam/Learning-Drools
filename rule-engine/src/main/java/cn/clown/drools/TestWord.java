package cn.clown.drools;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

/**
 * TODO
 *
 * @author clown
 * @version 1.0
 * @date 2021/4/7 17:04
 */
public class TestWord {
    @Test
    public void test() {
        KieServices kss = KieServices.Factory.get();
        KieContainer kc = kss.getKieClasspathContainer();
        KieSession ks = kc.newKieSession("session");
        int count = ks.fireAllRules();
        System.out.println("总共执行了" + count + "条规则");
        ks.dispose();
    }
    @Test
    public void person(){
        KieServices kss = KieServices.Factory.get();
        KieContainer kc = kss.getKieClasspathContainer();
        KieSession ks = kc.newKieSession("session");
        Person clown = new Person("zhangsan", 30);
        FactHandle insert = ks.insert(clown);
        int count = ks.fireAllRules();
        System.out.println("总共执行了"+count+"条规则");
        System.out.println(clown.getName());
        ks.dispose();
    }
}
