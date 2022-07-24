package ru.esstu.firstspringbootapp;

//Next, we need to code a class that uses Spring JDBC to perform CRUD operations on the SALES table.
// Create the SalesDAO class with the following structure:

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional //Also note that this DAO class is annotated with the @Transactional annotation so Spring framework will
// automatically inject code to execute its methods within JDBC transactions.
public class SalesDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;//The key point here is, we specify that an instance of JdbcTemplate class will
    // be automatically created and injected by Spring:
    //The feature lists all the items sold in the home page.
    public List<Sale> list() {
        String sql = "SELECT * FROM " + "\"" + "SALES" +"\""; //Здесь запрос должен быть такой SELECT * FROM "SALES"
        //Поэтому чтобы добавить двойные кавычки пишем "\""

        List<Sale> listSale = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Sale.class));
        //The cool thing here is the BeanPropertyRowMapper does the mapping values from JDBC ResultSet to Java objects.
        // You need to make sure the name of the fields in the Sale class are same as the names of the columns in the table.

        return listSale;
    }

    public void save(Sale sale) {
    }

    public Sale get(int id) {
        return null;
    }

    public void update(Sale sale) {
    }

    public void delete(int id) {
    }
}