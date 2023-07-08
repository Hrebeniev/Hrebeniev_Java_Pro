package com.hillel.hrebeniev.homeworks.homework_30;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;

@Log4j2
@AllArgsConstructor
public abstract class DefaultDao<T> {
    Class<T> entityClass;

    public void insert(T entity) {
        log.info("Inserting a record: " + entity.toString());
        try (Session session = HibernateSession.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
            log.info("Successfully inserted record: " + entity.toString());
        } catch (Exception e) {
            log.error("Exception occurred while inserting record: " + entity.toString());
            e.printStackTrace();
        }
    }

    public void update(T entity) {
        log.info("Updating a record: " + entity.toString());
        try (Session session = HibernateSession.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(entity);
            transaction.commit();
        } catch (Exception e) {
            log.error("Exception occurred while updating record: " + entity.toString());
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        log.info("Deleting a record with id: " + id);
        try (Session session = HibernateSession.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(session.get(entityClass, id));
            transaction.commit();
        } catch (Exception e) {
            log.error("Exception occurred while deleting record with id: " + id);
            e.printStackTrace();
        }
    }

    public T getById(int id) {
        log.info("Getting a record with id: " + id);
        try (Session session = HibernateSession.getSessionFactory().openSession()) {
            return session.get(entityClass, id);
        } catch (Exception e) {
            log.error("Exception occurred while getting record with id: " + id);
            e.printStackTrace();
            return null;
        }
    }

    public List<T> getAll() {
        log.info("Getting all records");
        System.out.println(entityClass.getSimpleName());
        try (Session session = HibernateSession.getSessionFactory().openSession()) {
            HibernateCriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            JpaCriteriaQuery<T> query = criteriaBuilder.createQuery(entityClass);
            query.from(entityClass);
            return session.createQuery(query).getResultList();
        } catch (Exception e) {
            log.error("Exception occurred while getting all records");
            e.printStackTrace();
            return null;
        }
    }
}