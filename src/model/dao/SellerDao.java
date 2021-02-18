package model.dao;

import java.util.List;
import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

  void insert(Seller seller);

  void update(Seller seller);

  void deleteById(Integer id);

  void findById(Integer id);

  List<Seller> findAll();

}