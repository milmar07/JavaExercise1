/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markomarkovic.exercise6;

/**
 *
 * @author 330S
 */
public interface Simple <K,V> {
    public void put(K k, V v);
    public Object get(String K);
    public int getLenght();
}

