public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void displayCustomer(int id) {
        Customer customer = customerRepository.findCustomerById(id);
        System.out.println(customer);
    }
}
