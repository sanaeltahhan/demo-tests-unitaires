import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Classe Test pour la classe StringUtils
 * 
 * @author eltahhansana
 *
 */
public class StringUtilsTest {
	
	@Test
	public void levenshteinDistanceStringEquals() {
		int result = StringUtils.levenshteinDistance("chien", "chien");
		assertEquals(0, result);
	}
	
	@Test
	public void levenshteinDistanceStringDifferentAdd() {
		int result = StringUtils.levenshteinDistance("chat", "chats");
		assertEquals(1, result);
	}
	
	@Test
	public void levenshteinDistanceStringDifferentDelete() {
		int result = StringUtils.levenshteinDistance("aviron", "avion");
		assertEquals(1, result);
	}
	
	@Test
	public void levenshteinDistanceStringDifferentDeleteAdd() {
		int result = StringUtils.levenshteinDistance("distance", "instance");
		assertEquals(2, result);
	}
	
	@Test (expected = ClassException.class)
	public void levenshteinDistanceStringNull() {
		StringUtils.levenshteinDistance(null, null);
	}

	@Test (expected = ClassException.class)
	public void levenshteinDistanceStringOneOfStringNull() {
		StringUtils.levenshteinDistance(null, "chat");
	}
}
