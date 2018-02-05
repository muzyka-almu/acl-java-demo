package by.almu.acljavademo.controller;

import by.almu.acljavademo.service.ItemService;
import by.almu.acljavademo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/testAdmin", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String testAdmin() {
        Item item = itemService.getByIdAdmin(1l);

        return item.toString();
    }

    @RequestMapping(value = "/testUser", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String testUser() {
        Item item = itemService.getByIdUser(1l);

        return item.toString();
    }

    @RequestMapping(value = "/testRead", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String testRead() {
        Item item = itemService.getByIdRead(1l);

        return item.toString();
    }
}
