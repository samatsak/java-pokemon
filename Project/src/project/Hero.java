/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author KMT
 */
public interface Hero {
    
    public abstract void createHero(int hero[]);
    public abstract void lvUpHero(int hero[]);
    public abstract String showHero(int hero[]);
    
}