/**
 * 
 */
package fr.diginamic.ex2.maison.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import fr.diginamic.ex2.maison.Chambre;
import fr.diginamic.ex2.maison.Maison;
import fr.diginamic.ex2.maison.Piece;

/**
 * @author eltahhansana
 *
 */
public class MaisonTest {
	
	Piece pieceAjoute = new Chambre(-10,5);
	Piece pieceAjoute2 = new Chambre(10,5);
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Test
	public void ajouterPieceNull() {
		Maison maison = new Maison();
		maison.ajouterPiece(null);
		assertEquals("Votre demande est incorrecte ! \n",systemOutRule.getLog());
	
	}
	
	@Test
	public void superficiePieceNegative() {
		Maison maison = new Maison();
		maison.ajouterPiece(pieceAjoute);
		int nbrPiece = maison.nbrPiece("Chambre");
		assertEquals(maison.nbrPiece("Chambre"), nbrPiece);
	}
	
	@Test
	public void superficiePiece() {
		Maison maison = new Maison();
		maison.ajouterPiece(pieceAjoute2);
		int nbrPiece = maison.nbrPiece("Chambre");
		assertEquals(1, nbrPiece);
	}
	

}
