/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markomarkovic.exercise6;

import java.util.LinkedHashMap;

/**
 *
 * @author 330S
 */
public class SimpleKV implements Simple<String, Integer> {
    private LinkedHashMap<String, Integer> lhm;
    
    public SimpleKV(){
        this.lhm = new LinkedHashMap<String,Integer>();
    }
    @Override
    public void put(String k, Integer v) {
        this.lhm.put(k, v);
    }

    @Override
    public Object get(String K) {
        return this.lhm.get(K);
    }

    @Override
    public int getLenght() {
        return this.lhm.size();
    }
    
}
