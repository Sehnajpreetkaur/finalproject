/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * 
 *Game : A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * 
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * 
 * Game: BlackJack - This 21-counting game is typically played against the dealer. A is either regarded
 * as 1 or 11 in the game, depending on which is more advantageous for him. All face cards are regarded as 10. Starting
 * with only two cards, the user has the option to stay * or hit. After the dealer moves, he wins if he stays and 
 * his two cards are higher than the dealer; otherwise, he loses. if he strikes.After receiving an additional random card, he will be able to continue selecting between hitting and staying. When
* the user eventually chooses to hit stay *, the dealer's turn follows. If the dealer's cards are lower than the user's,
* he hits until those cards are either higher than or equal to the user's.
 *
 * GitHub: The Repository was made public https://github.com/kau13250/finalProject.git
 * @author  Millanpreet singh ID: 991669923
 * @author Sehnajpreet kaur ID: 991655975
 * @author Ramandeep kaur ID: 991681352
 * @author Mankirat kaur ID: 991653445
 *
 */
public abstract class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public abstract String toString();

}
