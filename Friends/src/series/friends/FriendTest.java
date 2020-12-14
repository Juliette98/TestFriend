package series.friends;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class FriendTest
{
	private Friend monica;
    private Friend rachel;
    private Passion passionMonica;

    /**
     * Constructeur de la classe-test FriendTest
     */
    public FriendTest()
    {
    }

    @Before
    public void setUp() // throws java.lang.Exception
    {
        monica = new Friend("monica");
        rachel = new Friend("rachel");
        passionMonica = new Passion(monica, "cuisine");
    }

    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    	monica = null;
    	rachel = null;
    	passionMonica = null;
    }

    @Test
    public void testDevenirColocataire()
    {
        assertEquals("monica est devenu(e) colocataire avec rachel", monica.devenirColocataire(rachel));
    }
   
    @Test
    public void testaddPassion()
    {
        monica.addPassion(passionMonica);
        
        ArrayList<Passion> passions = new ArrayList();
        passions.add(passionMonica);
       
        assertEquals(passions, monica.getPassion());
    }
    
}
