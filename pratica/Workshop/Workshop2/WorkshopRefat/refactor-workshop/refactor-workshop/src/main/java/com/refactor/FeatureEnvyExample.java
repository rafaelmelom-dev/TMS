
package com.refactor;

import java.time.LocalDate;
import java.util.List;

/**
 * EXERCÍCIO: Code Smell - Feature Envy
 * Objetivo:
 *  - Mover lógica de formatação (ou parte invejosa) para a classe Order
 * Critério de aceite:
 *  - OrderPrinter deve delegar a Order
 */
public class FeatureEnvyExample {

    public static class OrderItem {
        public final String name;
        public final int qty;
        public final double price;
        public OrderItem(String name, int qty, double price) { this.name = name; this.qty = qty; this.price = price; }
        public double total() { return price * qty; }
    }

    public static class Order {
        public final String id;
        public final LocalDate date;
        public final List<OrderItem> items;
        public Order(String id, LocalDate date, List<OrderItem> items) {
            this.id = id; this.date = date; this.items = items;
        }

        public static void print (Order order) {
            order.toReceipt();
        }

        public double total() {
            return items.stream().mapToDouble(OrderItem::total).sum();
        }

        // TODO: muita "Envy" de Order: mover parte desta lógica para Order.
        // FEITO
        public String toReceipt() {
            StringBuilder sb = new StringBuilder();
            sb.append("ORDER ").append(id).append(" - ").append(date).append('\n');
            for (OrderItem it : items) {
                sb.append(it.qty).append("x ").append(it.name).append(" = ").append(it.total()).append('\n');
            }
            sb.append("TOTAL: ").append(total());
            return sb.toString();
        }
    }
}
