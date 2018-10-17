import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTest {
    private CodeTest codeTest = new CodeTest();

    @Test
    public void divisibleBy(){

        Boolean res = codeTest.divisibleBy(null,null);
        assertEquals(false,res);

        Boolean res1 = codeTest.divisibleBy(100,0);
        assertEquals(false,res1);

        Boolean res2 = codeTest.divisibleBy(0,10);
        assertEquals(true,res2);

        Boolean res3 = codeTest.divisibleBy(100,10);
        assertEquals(true,res3);
    }

    @Test
    public void containNum(){
        Boolean res = codeTest.containNum(null,null);
        assertEquals(false,res);

        Boolean res1 = codeTest.containNum(12,2);
        assertEquals(true,res1);

        Boolean res2 = codeTest.containNum(112,2);
        assertEquals(true,res2);

        Boolean res3 = codeTest.containNum(111,2);
        assertEquals(false,res3);
    }

}
