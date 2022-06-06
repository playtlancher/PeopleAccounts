package com.company;

public class MyEntry <K,V>{
    private K k;
    private V v;
    private int key ;
    public K getK(){
        return k;
    }
    public V getV(){
        return v;
    }
    public void setK(K k){
        this.k = k;
    }
    public void setV(V v){
        this.v = v;
    }
    public void setKey(int key){
        this.key = key;
    }
    public int getKey(){
        return key;
    }
    public MyEntry(K k, V v , int key){
        this.v = v;
        this.k = k;
        this.key = key;
    }
}
