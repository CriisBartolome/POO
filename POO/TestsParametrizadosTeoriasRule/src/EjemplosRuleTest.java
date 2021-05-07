import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestName;
import org.junit.rules.Timeout;

public class EjemplosRuleTest {
    
    @Rule
    public RulePersonalizada rulePersonalizada = new RulePersonalizada();
    
    @Rule
    public TestName name = new TestName();
    
    @Test
    public void nombreMetodo() {
        Assert.assertEquals("nombreMetodo", name.getMethodName());
    }

    @Rule
    public TemporaryFolder carpeta = new TemporaryFolder();
    
    @Test
    public void existeCarpeta() throws IOException {
        File carpetaTest = carpeta.newFolder("CarpetaDeTest");
        File archivoTest = carpeta.newFile("test.txt");
        Assert.assertTrue(carpetaTest.exists());
        Assert.assertTrue(archivoTest.exists());
        Assert.assertEquals("existeCarpeta", name.getMethodName());
    }    
    
    @Rule
    public Timeout timeout = new Timeout(3, TimeUnit.SECONDS);
 
    @Test
    public void testA() throws Exception {
        Thread.sleep(1000);
        Assert.assertEquals("testA", name.getMethodName());
    }
 
    //Tiene que fallar
    @Test
    public void testB() throws Exception {
        Thread.sleep(3000);
    }

}
