package com.ragnarok;

import com.ragnarok.model.*;
import com.ragnarok.service.Batalha;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Thor", 100, 20, 10, 5);
        Mago mago = new Mago("Merlin", 80, 15, 5, 50);

        Batalha.iniciarBatalha(guerreiro, mago);
    }
}