package lk.ijse.dep.app.business.custom;

import lk.ijse.dep.app.business.SuperBO;
import lk.ijse.dep.app.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.List;

public interface ManageCustomersBO extends SuperBO {

    List<CustomerDTO> getCustomers() throws SQLException;

    void createCustomer(CustomerDTO dto) throws Exception;

    void updateCustomer(CustomerDTO dto) throws Exception;

    void deleteCustomer(String customerID) throws SQLException;

    CustomerDTO findCustomer(String id) throws SQLException;



}
