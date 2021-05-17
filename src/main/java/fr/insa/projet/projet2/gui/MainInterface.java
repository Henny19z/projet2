/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.projet.projet2.gui;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author henny
 */
public class MainInterface extends BorderPane {
    
    private Button bCoucou;
    
    public MainInterface() {
        this.bCoucou = new Button("coucou");
        
        this.setCenter(this.bCoucou);
    }
    
}
