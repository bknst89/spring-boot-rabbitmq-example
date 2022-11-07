package by.bknst.practise.rabbitmq.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {

    private static final long serialVersionUID = -4057289311636267835L;

    @JsonProperty
    private String orderIdentifier;

    @JsonProperty
    private int orderId;

    @JsonProperty
    private List<String> orderList;

    @JsonProperty
    private String customerName;

    @Override
    public String toString() {
        return "Order{" +
                "orderIdentifier='" + orderIdentifier + '\'' +
                ", orderId=" + orderId +
                ", orderList=" + orderList +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
