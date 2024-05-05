package com.wordz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@Deprecated
public class WordTest {
    @Test
    public void oneIncorrectLetter() {
        var word = new Word("A");
        var score = word.guess("Z"); //guess = adivinar intento de adivinar
        Letter result = score.letter(0);
        assertThat(result).isEqualTo(Letter.INCORRECT);

    }
}
