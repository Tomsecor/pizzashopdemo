package edu.psu.pizzashop;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class PizzaShopController
{
    private HashMap<Integer, String> menuH = new HashMap<>();
    private HashMap<Integer, Order> orderH = new HashMap<>();
    static int orderId = 0;

    public PizzaShopController()
    {
        menuH.put(1, "pizza1: $9, soda: $2, wing: $5");
        menuH.put(2, "pizza1: $8, soda: $2, wing: $5");
        menuH.put(3, "pizza1: $7, soda: $2, wing: $5");
        menuH.put(4, "pizza1: $6, soda: $2, wing: $5");
    }

    @GetMapping("/menu")
    public String getMenu()
    {
        return "pizza1: $10, soda: $2, wing: $5";
    }

    @GetMapping("/menubyid")
    public String getMenuById(@RequestParam(name = "id") int id)
    {
        return menuH.get(id);
    }

    @PostMapping("/order/create")
    public int creatOrder(@RequestBody Order order)
    {
        orderH.put(orderId, order);
        return orderId++;
    }

    @GetMapping("/order/get")
    public Order getOrder(@RequestParam(name = "id") int id){
        return orderH.get(id);

    }
    @PutMapping("/order/update")
    public int updateOrder(@RequestParam(name = "id") int id, @RequestBody Order order) {
        orderH.remove(id);

        orderH.put(id,order);

        return id;

    }
    @DeleteMapping("/order/delete")
    public int deleteOrder(@RequestParam(name = "id") int id)
    {
        orderH.remove(id);
        return id;
    }
}
