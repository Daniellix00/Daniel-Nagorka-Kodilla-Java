package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Test
    @Transactional
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("ProduktA");
        Product product2 = new Product("ProduktB");
        productDao.save(product1);
        productDao.save(product2);
        Item item1 = new Item(new BigDecimal(100), 2, new BigDecimal(20), product1);
        Item item2 = new Item(new BigDecimal(150), 3, new BigDecimal(30), product2);
   itemDao.save(item1);
   itemDao.save(item2);
   Invoice invoice = new Invoice();
   invoice.getItems().add(item1);
   invoice.getItems().add(item2);
   invoiceDao.save(invoice);
   //Then
        assertNotNull(invoice.getId());
        assertNotNull(item1.getId());
        assertNotNull(item2.getId());

        //CleanUp
            invoiceDao.delete(invoice);
            itemDao.delete(item1);
            itemDao.delete(item2);

    }
}