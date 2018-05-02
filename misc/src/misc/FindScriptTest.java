package misc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindScriptTest {

    @Test
    public void testFindOutputFolder() {
        assertEquals("abcde/xyz", FindScript.findOutputFolder("-l xxx -o abcde/xyz\""));
        assertEquals("abcde/xyz", FindScript.findOutputFolder("-l xxx -o abcde/xyz -x true"));
        assertEquals("abcde-xyz", FindScript.findOutputFolder("-l xxx -o abcde-xyz -x false"));
        assertEquals("abcde_xyz", FindScript.findOutputFolder("-l xxx -o abcde_xyz"));
        assertEquals("abcde.xyz", FindScript.findOutputFolder("-l xxx -o abcde.xyz"));
    }

}
