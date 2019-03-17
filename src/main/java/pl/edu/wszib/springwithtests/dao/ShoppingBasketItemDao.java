package pl.edu.wszib.springwithtests.dao;

import io.swagger.models.auth.In;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.springwithtests.model.ShoppingBasketItem;

import java.util.List;

@Repository
public interface ShoppingBasketItemDao extends CrudRepository<ShoppingBasketItem, Integer> {

    ShoppingBasketItem findByProductIdAndShoppingBasketId(Integer productId, Integer shoppingBasketId);
    List<ShoppingBasketItem> findAll();
    List<ShoppingBasketItem> findAllByShoppingBasketId(Integer id);

}
