package testen;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Patroon;


public class PatroonTest
{
    private Patroon p1, p2, p3, p4;

    @BeforeEach
    public void before()
    {
        p1 = new Patroon('A');
        p2 = new Patroon('B','?');
        p3 = new Patroon('C');
        p4 = new Patroon('D');
    }	
    
    @Test 
    public void maakPatroon_typeS_geeftDefaultTypeATerug()
    {
    	p2 = new Patroon('S');
    	Assertions.assertEquals('A',p2.getType());
    }	
    
    
    @Test 
    public void maakPatroon_opvultekenHaakjeOpen_geeftDefaultSterTerug()
    {
    	p2 = new Patroon('A','(');
    	Assertions.assertEquals('*',p2.getOpvulteken());

    }
    
    @Test 
    public void getType_retourneertB()
    {
        Assertions.assertEquals('B',p2.getType());
    }
       
    @Test 
    public void getOpvulTeken_retourneertVraagteken()
    {
        Assertions.assertEquals('?',p2.getOpvulteken());
    }
    
    @Test 
    public void getOpvulTeken_retourneertDefaultOpvultekenSter()
    {
        Assertions.assertEquals('*',p1.getOpvulteken());
    }
    
    @Test 
    public void teken_retourneertPatroonA()
    {
        Assertions.assertEquals("Patroon A\n*\n**\n***\n****\n*****\n******\n*******\n********\n*********\n**********\n",p1.teken());
    }
    
    @Test 
    public void teken_retourneertPatroonB()
    {
        Assertions.assertEquals("Patroon B\n??????????\n ?????????\n  ????????\n   ???????\n    ??????\n     ?????\n      ????\n       ???\n        ??\n         ?\n",p2.teken());
    }
    
    @Test 
    public void teken_retourneertPatroonC()
    {
        Assertions.assertEquals("Patroon C\n**********\n*********\n********\n*******\n******\n*****\n****\n***\n**\n*\n",p3.teken());
    }
    
    @Test 
    public void teken_retourneertPatroonD()
    {
        Assertions.assertEquals("Patroon D\n         *\n        **\n       ***\n      ****\n     *****\n    ******\n   *******\n  ********\n *********\n**********\n",p4.teken());
    }
}
