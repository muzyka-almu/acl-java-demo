package by.almu.acljavademo.dao;

import by.almu.acljavademo.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemDao extends CrudRepository<Item, Long> {
}
