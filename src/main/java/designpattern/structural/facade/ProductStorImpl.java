package designpattern.structural.facade;

public class ProductStorImpl implements ProductStore {

    ProductStoreDao productStoreDao;

    @Override
    public Item getProduct(String itemId) {
        return productStoreDao.getItemById(itemId);
    }
}
