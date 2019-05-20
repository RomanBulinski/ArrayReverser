import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TestMain {


    @Test
    public void test1(){
        Main n = new Main();
        String[] inputData = {"I", "like", "big", "butts", "and", "I", "cannot", "lie!"};
        String[] outputData = {  "!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI" };
        assertArrayEquals( outputData , n.reverse(inputData) );
    }




//    @Test
//    public void FixedTest1()
//    {
//        assertEquals(new String[]{"!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI"},
//                ArrayReverser.reverse(new String[]{"I", "like", "big", "butts", "and", "I", "cannot", "lie!"}));
//    }
//
//    @Test public void FixedTest2()
//    {
//        assertEquals(new String[]
//                        {"How", "many", "shrimp", "do", "you", "have", "to", "eat",
//                                "before", "your", "skin", "starts", "to", "turn", "pink?"},
//                ArrayReverser.reverse(new String[]{"?kn", "ipnr", "utotst", "ra", "tsn", "iksr", "uo", "yer", "ofebta", "eote", "vahu", "oyodpm", "ir", "hsyn", "amwoH"}));
//    }


}
