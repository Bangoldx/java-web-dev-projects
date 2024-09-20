package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void openClosedBracketOrder(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]code["));
    }

    @Test
    public void hasOnlyOpeningBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[code"));
    }

    @Test
    public void hasOnlyClosingBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("code]"));
    }

    @Test
    public void hasNoBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void hasMisNestedBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[code]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[code]"));
    }

    @Test
    public void hasNestedBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[launch[code]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[launch]code]"));
    }

    @Test
    public void hasTwoSetsOfBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[launch][code]"));
    }

    @Test
    public void hasTwoSetsOfBracketsFirstSetIncorrect(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]launch[[code]"));
    }

   @Test
    public void hasStringOpening(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("code["));
   }
   @Test
    public void hasStringClosing(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]code"));
   }

}