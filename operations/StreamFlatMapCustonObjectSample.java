package operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapCustonObjectSample {

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("1001", Arrays.asList("item1", "item2", "item3")),
                new Order("1002", Arrays.asList("item4", "item5", "item6")),
                new Order("1003", Arrays.asList("item7", "item8", "item9"))
        );

        List<String> allItens = orders.stream()
                .flatMap(order -> order.getItens().stream())
                .collect(Collectors.toList());

        allItens.forEach(System.out::println);
    }
}

class Order {

    private String id;
    private List<String> itens;

    public Order(String id, List<String> itens) {
        this.id = id;
        this.itens = itens;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getItens() {
        return itens;
    }

    public void setItens(List<String> itens) {
        this.itens = itens;
    }
}
