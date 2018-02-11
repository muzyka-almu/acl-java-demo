package by.almu.acljavademo.service;

import by.almu.acljavademo.dao.ItemDao;
import by.almu.acljavademo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private ItemDao itemDao;

    @PreAuthorize("hasRole('ROLE_USER')")
    public Item getByIdUser(Long id) {
        return itemDao.findOne(id);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Item getByIdAdmin(Long id) {
        return itemDao.findOne(id);
    }

    @PostAuthorize("hasPermission(returnObject, 'READ')")
    public Item getByIdRead(Long id) {
        return itemDao.findOne(id);
    }
}
