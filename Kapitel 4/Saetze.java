import java.util.Random;

public class Saetze {
	public static void main(String[] args) {
		Random random = new Random();
		String[] article = { " the", " a", " one", " some", " any" };
		String[] noun = { " boy", " girl", " dog", " town", " car" };
		String[] verb = { " drove", " jumped", " ran", " walked", " skipped" };
		String[] preposition = { " to", " from", " over", " under", " on" };
		int i = 0;

		while (i < 20) {
			int articleRandom = random.nextInt(article.length), nounRandom = random.nextInt(noun.length),
					verbRandom = random.nextInt(verb.length), prepRandom = random.nextInt(preposition.length),
					articleRandom2 = random.nextInt(article.length), nounRandom2 = random.nextInt(noun.length);
			System.out.println(article[articleRandom] + noun[nounRandom] + verb[verbRandom] + preposition[prepRandom]
					+ article[articleRandom2] + noun[nounRandom2] + ".");
			i++;
		}
	}
}
