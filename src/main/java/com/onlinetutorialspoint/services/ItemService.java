package com.onlinetutorialspoint.services;

import com.onlinetutorialspoint.model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ItemService {
    public static List<Item> items;
    static{
        items = new ArrayList<>(Arrays.asList(new Item(1,"Spring Boot in Action","Books"),
                new Item(2,"Java 8 in Action","Books"),
                new Item(3,"Data Structures","Books")));
    }

    public List<Item> getAllItems(){
        return items;
    }

    public void addItem(Item item){
        items.add(item);
    }

    /*delete an item from database*/
    public void deleteItem(int id){
        items.removeIf(i -> i.getId().equals(id));
    }

}
