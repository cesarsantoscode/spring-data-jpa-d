package pe.edu.cibertec.spring_data_jpa_d;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.cibertec.spring_data_jpa_d.entity.Customer;
import pe.edu.cibertec.spring_data_jpa_d.repository.CustomerRepository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringDataJpaDApplication implements CommandLineRunner {

    @Autowired
    CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaDApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        /**
         * save()
         */
//        for (int i = 0; i < 10; i++) {
//            Customer customer = new Customer(null, 1, "César", "Santos", "cesar@mail.com", 1, 1, new Date(), new Date());
//            customerRepository.save(customer);
//        }

        /**
         * findById() - get
         */
//        Optional<Customer> optional = customerRepository.findById(601);
//        Customer customer = optional.get(); //es una mala práctica
//        System.out.println(customer);

        /**
         * findById() - orElse
         */
//        Optional<Customer> optional = customerRepository.findById(600);
//        Customer customer = optional.orElse(null);
//        System.out.println(customer);

        /**
         * findById() - orElseGet
         */
//        Optional<Customer> optional = customerRepository.findById(601);
//        Customer customer = optional.orElseGet(()->{
//            LocalDate today = LocalDate.now();
//            System.out.println("Customer not found " + today);
//            return null;
//        });
//        System.out.println(customer);

        /**
         * findById() - orElseThrow
         */
//        Optional<Customer> optional = customerRepository.findById(601);
//        Customer customer = optional.orElseThrow(Exception::new);
//        System.out.println(customer);

        /**
         * findById() - isPresent
         */
//        Optional<Customer> optional = customerRepository.findById(601);
//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        } else {
//            System.out.println("Customer not found");
//        }

        /**
         * findById() - ifPresent
         */
//        Optional<Customer> optional = customerRepository.findById(601);
//        optional.ifPresent((item) -> {
//            System.out.println(item);
//        });
//        optional.ifPresent(System.out::println);

        /**
         * findById() - ifPresentOrElse
         */
//        Optional<Customer> optional = customerRepository.findById(600);
//        optional.ifPresentOrElse(
//                (element) -> {
//                    System.out.println(String.format("Customer is %s", element.getFirst_name()));
//                    System.out.println(LocalDate.now());
//                },
//                () -> {
//                    System.out.println("Customer not found");
//                }
//        );

        /**
         * existsById()
         */
//        if (customerRepository.existsById(600)) {
//            System.out.println("Customer exist");
//        } else {
//            System.out.println("Customer not exist");
//        }

        /**
         * findAll()
         */
//        Iterable<Customer> iterable = customerRepository.findAll();

        // modelo clásico
//        for (Customer customer : iterable) {
//            System.out.println(customer);
//        }

        // modelo funcional - Referencia al metodo
//        iterable.forEach(System.out::println);

        // modelo funcional - Lambda
//        iterable.forEach((item) -> {
//            System.out.println(item);
//        });

        /**
         * Convertir Iterable -> List
         */
//        List<Customer> customers = List.copyOf((Collection<Customer>) iterable);
//        System.out.println(customers.getLast());

        /**
         * findAllById()
         */
//        Iterable<Integer> ids = List.of(600, 601, 602);
//        Iterable<Customer> iterable = customerRepository.findAllById(ids);
//        iterable.forEach(System.out::println);

        /**
         * deleteById()
         */
//        int id = 600;
//        if (customerRepository.existsById(id)) {
//            customerRepository.deleteById(id);
//        }

        /**
         * deleteAllById()
         */
//        List<Integer> lista = List.of(605, 606, 607, 611);
//        lista.stream().filter((id) -> {
//            return customerRepository.existsById(id);
//        }).collect(Collectors.toList());
//
//        if (!lista.isEmpty()) {
//            customerRepository.deleteAllById(lista);
//        }

        /**
         * delete()
         */
//        Optional<Customer> optional = customerRepository.findById(610);
//        optional.ifPresentOrElse(
//                (customer) -> {
//                    customerRepository.delete(customer);
//                },
//                () -> {
//                    System.out.println("Customer not found");
//                }
//        );

        /**
         * deleteAll()
         */
        Iterable<Customer> iterable = customerRepository.findAllById(List.of(604, 608, 610));
        customerRepository.deleteAll(iterable);


    }

}
