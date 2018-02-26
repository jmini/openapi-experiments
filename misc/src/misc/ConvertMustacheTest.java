package misc;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import misc.ConvertMustache.Replacement;
import misc.ConvertMustache.TagPair;

public class ConvertMustacheTest {

    private static final Replacement REPLACEMENT_AAA = new Replacement("aaa", "AAA", "zzz", "ZZZ");
    private static final Replacement REPLACEMENT_BB = new Replacement("bb", "BB", "yy", "YY");
    private static final List<Replacement> REPACEMENTS_A = Collections.singletonList(REPLACEMENT_AAA);
    private static final List<Replacement> REPACEMENTS_AB = Arrays.asList(REPLACEMENT_AAA, REPLACEMENT_BB);
    private static final TagPair BRACKETS = new TagPair("((", "))");

    @Test
    public void testEmpty() {
        Assert.assertEquals("tx", ConvertMustache.replaceInContent("tx", Collections.emptyList()));
        Assert.assertEquals("tx", ConvertMustache.replaceInContent("tx", null));
        Assert.assertEquals(null, ConvertMustache.replaceInContent(null, Collections.emptyList()));
    }

    @Test
    public void testSingle() {
        Assert.assertEquals("............", ConvertMustache.replaceInContent("............", REPACEMENTS_A));
        Assert.assertEquals("...AAA.....ZZZ...", ConvertMustache.replaceInContent("...aaa.....zzz...", REPACEMENTS_A));
        Assert.assertEquals("...AAA.....ZZZ....AAA...ZZZ.", ConvertMustache.replaceInContent("...aaa.....zzz....aaa...zzz.", REPACEMENTS_A));
        Assert.assertEquals("AAA.....ZZZ", ConvertMustache.replaceInContent("aaa.....zzz", REPACEMENTS_A));
        Assert.assertEquals("AAAZZZ", ConvertMustache.replaceInContent("aaazzz", REPACEMENTS_A));
        Assert.assertEquals("AAAZZZAAAZZZ", ConvertMustache.replaceInContent("aaazzzaaazzz", REPACEMENTS_A));
        Assert.assertEquals("...AAA---ZZZ...zzz", ConvertMustache.replaceInContent("...aaa---zzz...zzz", REPACEMENTS_A));
        Assert.assertEquals("...AAA---ZZZ...zzz...AAA---ZZZ..", ConvertMustache.replaceInContent("...aaa---zzz...zzz...aaa---zzz..", REPACEMENTS_A));

        Assert.assertEquals("...A.....ZZZZ...", ConvertMustache.replaceInContent("...aaa.....zz...", Collections.singletonList(new Replacement("aaa", "A", "zz", "ZZZZ"))));
    }

    @Test
    public void testMultiple() {
        Assert.assertEquals("............", ConvertMustache.replaceInContent("............", REPACEMENTS_AB));
        Assert.assertEquals("...AAA.....ZZZ...", ConvertMustache.replaceInContent("...aaa.....zzz...", REPACEMENTS_AB));
        Assert.assertEquals("...AAA.....ZZZ....AAA...ZZZ.", ConvertMustache.replaceInContent("...aaa.....zzz....aaa...zzz.", REPACEMENTS_AB));
        Assert.assertEquals("AAA.....ZZZ", ConvertMustache.replaceInContent("aaa.....zzz", REPACEMENTS_AB));
        Assert.assertEquals("AAAZZZ", ConvertMustache.replaceInContent("aaazzz", REPACEMENTS_AB));
        Assert.assertEquals("AAAZZZAAAZZZ", ConvertMustache.replaceInContent("aaazzzaaazzz", REPACEMENTS_AB));
        Assert.assertEquals("...AAA---ZZZ...zzz", ConvertMustache.replaceInContent("...aaa---zzz...zzz", REPACEMENTS_AB));
        Assert.assertEquals("...AAA---ZZZ...zzz...AAA---ZZZ..", ConvertMustache.replaceInContent("...aaa---zzz...zzz...aaa---zzz..", REPACEMENTS_AB));

        Assert.assertEquals("...BB.....YY...", ConvertMustache.replaceInContent("...bb.....yy...", REPACEMENTS_AB));
        Assert.assertEquals("...BB.....YY....AAA...ZZZ.", ConvertMustache.replaceInContent("...bb.....yy....aaa...zzz.", REPACEMENTS_AB));
        Assert.assertEquals("AAAZZZBBYY", ConvertMustache.replaceInContent("aaazzzbbyy", REPACEMENTS_AB));
        Assert.assertEquals("...BB---YY...yy", ConvertMustache.replaceInContent("...bb---yy...yy", REPACEMENTS_AB));
        Assert.assertEquals("...BB---YY...zzz...yy...AAA---ZZZ..", ConvertMustache.replaceInContent("...bb---yy...zzz...yy...aaa---zzz..", REPACEMENTS_AB));
    }

    @Test
    public void testInside() {
        Assert.assertEquals("...aaa.....zzz......", ConvertMustache.replaceInContentInside("...aaa.....zzz......", REPACEMENTS_AB, Collections.singletonList(BRACKETS)));
        Assert.assertEquals("...aaa.....zzz...((...AAA.....ZZZ...))...aaa.....zzz...", ConvertMustache.replaceInContentInside("...aaa.....zzz...((...aaa.....zzz...))...aaa.....zzz...", REPACEMENTS_AB, Collections.singletonList(BRACKETS)));
        Assert.assertEquals("((...AAA.....ZZZ...))", ConvertMustache.replaceInContentInside("((...aaa.....zzz...))", REPACEMENTS_AB, Collections.singletonList(BRACKETS)));
        Assert.assertEquals("..((...AAA.....ZZZ...AAA.....ZZZ....))..", ConvertMustache.replaceInContentInside("..((...aaa.....zzz...aaa.....zzz....))..", REPACEMENTS_AB, Collections.singletonList(BRACKETS)));
        Assert.assertEquals(".((...AAA.....ZZZ...)).....((AAA.....ZZZ))...", ConvertMustache.replaceInContentInside(".((...aaa.....zzz...)).....((aaa.....zzz))...", REPACEMENTS_AB, Collections.singletonList(BRACKETS)));
    }

    @Test(expected = IllegalStateException.class)
    public void testEndNotFound() {
        ConvertMustache.replaceInContent("....aaa......", REPACEMENTS_A);
    }

    @Test(expected = IllegalStateException.class)
    public void testNested() {
        ConvertMustache.replaceInContent("___aaa...aaa---zzz...zzz___", REPACEMENTS_A);
    }

    @Test(expected = IllegalStateException.class)
    public void testNested2() {
        ConvertMustache.replaceInContent("....aaa...aaa---zzz...", REPACEMENTS_A);
    }

}
