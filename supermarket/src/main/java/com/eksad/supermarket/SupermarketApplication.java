package com.eksad.supermarket;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import com.eksad.supermarket.dao.BrandDao;
import com.eksad.supermarket.dao.CashierDao;
import com.eksad.supermarket.dao.CustomerDao;
import com.eksad.supermarket.dao.PersonDao;
import com.eksad.supermarket.dao.ProductDao;
import com.eksad.supermarket.dao.ProductElectonicDao;
import com.eksad.supermarket.dao.ProductGroceryDao;
import com.eksad.supermarket.dao.TransactionDao;
//import com.eksad.supermarket.entity.Id;
import com.eksad.supermarket.entity.Person;
import com.eksad.supermarket.entity.PersonAddress;
import com.eksad.supermarket.entity.Product;
import com.eksad.supermarket.entity.Transaction;
import com.eksad.supermarket.entity.TransactionDetail;

import antlr.collections.List;

// ApplicationRunner untun merun petama kali

@SpringBootApplication
//public class SupermarketApplication implements ApplicationRunner {
public class SupermarketApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SupermarketApplication.class, args);
	}
		
// 	DAO Sama dengan Bean
	
	@Autowired
	private BrandDao brandDao;
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private PersonDao personDao;

	
	@Autowired
	private TransactionDao transactionDao;
	
	@Autowired
	private CashierDao cashierDao;
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private ProductGroceryDao productgroceryDao;
	
	@Autowired
	private ProductElectonicDao productelectronicDao;
	
//	@Override
//	@Transactional
//	transactional agar berada di dalam datu transaction
//	find first mencari item pertama or else jika data tidak ada data apa yang akan dikembalikan
//	findonebyname fungsinya sama dengan find first
//	bikin error buat method string tetapi isinya null
//	jika menggunakan transactional data akan error dan tidak akan masuk ke database
//	jika tidak menggunakan transactional maka data yg masuk hanya satu.
//	call super untuk 

//	public void run(ApplicationArguments args) throws Exception
//	
	{
		
//		untuk memuncul seluruh data
		
//		personDao.findAll(Sort.by("name"))
//				  .forEach(System.out::println);	

//		untuk mencari dari dari 1 - 10
//		personDao.findAll(PageRequest.of(0, 10))
//				 .forEach(System.out::println);	
		
//		untuk mencari berdasarkan name
//		personDao.findAll(PageRequest.of(0, 10, Sort.by("name")))
//		 .forEach(System.out::println);	
		
		
//		untuk mencari total elemen dan 
//		Page<Person> page = personDao
//				.findAll(PageRequest.of(2, 25, Sort.by("name")));
//				
//		System.out.println("total elemen : " + page.getTotalElements());
//		System.out.println("total page : " + page.getTotalPages());
//		
		
		
		
//		System.out.println(transactionDao.findTotalItemByTransactionId(1L));
//		
//		
//		java.util.List<Object[]> totals = transactionDao.findTotalNominalPerTransaction();
//		
//		for (Object[] total:totals) {
//			System.out.println("id : " + total[0]);
//			System.out.println("total : " + total[1]);
//		}
//
//		
		
		
//		System.out.println("Grocery");
//		productgroceryDao.findAll().forEach(System.out::println);
//		
//		System.out.println("Electronic");
//		productelectronicDao.findAll().forEach(System.out::println);
		
//		System.out.println("Cashier");
//		cashierDao.findAll().forEach(System.out::println);
		
//		System.out.println("Customer");
//		customerDao.findAll().forEach(System.out::println);
//		
//		System.out.println("Person");
//		personDao.findAll().forEach(System.out::println);
		
//		Brand brand1 = new Brand();
//		brand1.setName("Brand Test #1");
//		brand1.setProductType("Test #1");
//		brandDao.save(brand1);
//		
//		String bikinError = null;
//		bikinError.split(",");
//		
//		
//		Brand brand2 = new Brand();
//		brand2.setName("Brand Test #2");
//		brand2.setProductType("Test #2");
//		brandDao.save(brand2);
//		
		
//		
//		Brand brand = brandDao.findOneByName("Nestle");
//		System.out.println(brand);
		
//		Brand brand = brandDao.findByName("Nestle").stream()
//				.findFirst()
//				.orElse(null);
//		if(brand != null)
//		{
//			brand.setProductType("Food and Beveragers");
//			brandDao.save(brand);
//		}
		
//		brandDao.findAll()
//		.forEach(System.out::println);
		
//		Transaction transaction = new Transaction();
//		transaction.setDate(new Date());
//		transaction.setRemark("Test Transaction");
//		transaction.setDetails(new HashSet<TransactionDetail>());
//		
//		TransactionDetail detail1 = new TransactionDetail();
//		detail1.setProduct(productDao.findById(1L).get());
//		detail1.setQuantity(3);
//		detail1.setTransaction(transaction);
//		transaction.getDetails().add(detail1);


//		TransactionDetail detail2 = new TransactionDetail();
//		detail2.setProduct(productDao.findById(3L).get());
//		detail2.setQuantity(5);
//		detail2.setTransaction(transaction);
//		transaction.getDetails().add(detail2);
//		transactionDao.save(transaction);
//		
//		transactionDao.save(transaction);
		
//		Transaction transaction = transactionDao.findById(1L).get();
//		System.out.println("==DONE GET TRANS==");
//		transaction.getDetails().size();
//		
//		transactionDao.findAll()
//		.forEach(System.out::println);

//		Person person = new Person();
//		person.setName("Jane Fulan");
	
//		PersonAddress address = new PersonAddress();
//		address.setAddress("Kebon Raya");
//		address.setCity("Bogor");
//		
//		person.setAddress(address);
//		address.setPerson(person);

//		personDao.save(person);
//		personDao.findAll()
//		.forEach(System.out::println);

//		L = long
//		D = double
		
//		brandDao.findAll()
//			.forEach(System.out::println);
		
//		Product product = new Product();
//		product.setName("Cimory Susu Vanila");
//		product.setPrice(new BigDecimal(20000));
	
//		Brand brand = brandDao.findById(1L).get();

//		product.setBrand(brand);
//		productDao.save(product);
//		
//		productDao.findAll()
//		.forEach(System.out::println);
		
		
		
		
	}

}
