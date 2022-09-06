package hello.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data // @Data를 쓰는 것은 위험하다 dto 정도에 사용하는 것이 적합(잘 알아보고 써야한다.)
// @Getter @Setter를 쓰는 게 낫다.
public class Item {


    private Long id;
    private String itemName;
    private Integer price; // Integer라고 쓰는 이유는 price가 안들어 갈 경우도 있다고 가정.
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
