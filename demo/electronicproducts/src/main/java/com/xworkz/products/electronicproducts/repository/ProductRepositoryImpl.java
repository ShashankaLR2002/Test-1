package com.xworkz.products.electronicproducts.repository;
import com.xworkz.products.electronicproducts.entity.ProductsEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ProductRepositoryImpl implements  ProductRepository {
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean saveProducts(ProductsEntity productsEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(productsEntity);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            entityManager.close();
        }
    }
}
