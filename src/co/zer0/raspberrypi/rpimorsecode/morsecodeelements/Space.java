/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.zer0.raspberrypi.rpimorsecode.morsecodeelements;

/**
 *
 * @author klockhart
 */
public class Space extends MorseCodePulse{
    Space(){
        this.multiplier = 3;
        this.setPinHigh = false;
    }
}