/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package flds6.aluno.ifnmg.pedraneles;

import io.github.guisso.jankenpon.AbstractPlayer;
import io.github.guisso.jankenpon.Move;

/**
 *
 * @author Filipe
 */
public class PedraNeles extends AbstractPlayer{

    @Override
    public String getDeveloperName() {
        return "Filipe Santos";
    }

    @Override
    public Move makeMyMove(Move opponentPreviousMove) {
        if(opponentPreviousMove == Move.NONE)
            return Move.NONE;
        else if(opponentPreviousMove == Move.PAPER)
            return Move.SCISSORS;
        else if(opponentPreviousMove == Move.SCISSORS)
            return Move.ROCK;
        else if(opponentPreviousMove == Move.ROCK)
            return Move.PAPER;
        
        return Move.NONE;
    }

}
