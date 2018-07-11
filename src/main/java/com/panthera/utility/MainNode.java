/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.utility;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class MainNode {

    int id;
    String description;
    boolean checked;

    List<SubNode> list = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    

    public List<SubNode> getList() {
        return list;
    }

    public void setList(List<SubNode> list) {
        this.list = list;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MainNode other = (MainNode) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
   

    public static void main(String[] args) {

        List<MainNode> mainList1 = new ArrayList<>();
        List<MainNode> mainList2 = new ArrayList<>();
        List<MainNode> mainList3 = new ArrayList<>();
        List<String> list = new ArrayList<String>();
        for (MainNode mainNode : mainList1) {
          
        }
        
        for (int i = 0; i < list.size(); i++) {
            String get = list.get(i);
            
        }
        
        for (int i = 0; i < 20; i++) {
            
        }

    }

}
