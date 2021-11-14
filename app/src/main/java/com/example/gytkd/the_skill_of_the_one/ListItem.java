package com.example.gytkd.the_skill_of_the_one;


public class ListItem {
    String name;
    String boon;
    String Q;
    Integer num;
    String K;
    boolean selected = false;
    public ListItem(String name, String boon){
        this.name = name;
        this.boon = boon;
    }
    public ListItem(String name, String boon,String Q, Integer num, String K,boolean selected){
        this.name = name;
        this.boon = boon;
        this.Q = Q;
        this.num = num;
        this.K = K;
        this.selected = selected;
    }
    public String getQ(){
        return Q;
    }
    public void setQ(String Q){
        this.Q = Q;
    }

    public String getBoon(){
        return boon;
    }
    public void setBoon(String mobile){
        this.boon = mobile;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getNum(){return num;}
    public void setNum(Integer num){this.num = num;}
    public String getK(){return K;}
    public void setK(String K){
        this.K = K;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    public boolean isSelected() {
        return selected;
    }
}
