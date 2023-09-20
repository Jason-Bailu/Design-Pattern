package com.bailu.builder.product;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: JasonD
 * @date: 2023/9/2 11:19
 * @Description:
 */
public class Meal {
    public List<Iterm> iterms = new ArrayList<>();

    public void addItem(Iterm iterm) {
        iterms.add(iterm);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Iterm iterm : iterms) {
            cost += iterm.price();
        }
        return cost;
    }

    public void showItems() {
        for (Iterm iterm : iterms) {
            System.out.print("Item: " + iterm.name());
            System.out.print("Packing: " + iterm.packing().pack());
            System.out.println(", Price: " + iterm.price());
        }
    }
}
