package com.redis.cache.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.redis.cache.entity.Invoice;
import com.redis.cache.entity.InvoiceNotFoundException;
import com.redis.cache.repo.InvoiceRepository;

@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepo;

//	@Autowired
//	private RedisTemplate template;

	public static final String HAS_KEY = "Invoice";

	@Override
	public Invoice saveInvoice(Invoice inv) {

		return invoiceRepo.save(inv);
	}

	@Override
	@CachePut(value = "Invoice", key = "#invId")
	public Invoice updateInvoice(Invoice inv, Integer invId) {
		Invoice invoice = invoiceRepo.findById(invId)
				.orElseThrow(() -> new InvoiceNotFoundException("Invoice Not Found"));
		invoice.setInvAmount(inv.getInvAmount());
		invoice.setInvName(inv.getInvName());
		return invoiceRepo.save(invoice);
	}

	@Override
	@CacheEvict(value = "Invoice", key = "#invId")
	// @CacheEvict(value="Invoice", allEntries=true) //in case there are multiple
	// records to delete
	public void deleteInvoice(Integer invId) {
		Invoice invoice = invoiceRepo.findById(invId)
				.orElseThrow(() -> new InvoiceNotFoundException("Invoice Not Found"));
		invoiceRepo.delete(invoice);
	}

	@Override
	@Cacheable(value = "Invoice", key = "#invId")
	public Invoice getOneInvoice(Integer invId) {
		Invoice invoice = invoiceRepo.findById(invId)
				.orElseThrow(() -> new InvoiceNotFoundException("Invoice Not Found"));
		return invoice;
	}

	@Override
	@Cacheable(value = "Invoice")
	public List<Invoice> getAllInvoices() {
		return invoiceRepo.findAll();
	}

	@Override
	@Cacheable(value = "Invoice", key = "#invName")
	public List<Invoice> findByInvNameContainingIgnoreCase(String invName) {
		System.out.println("DB");
//		return template.opsForHash().values(HAS_KEY);
		return invoiceRepo.findByInvNameContainingIgnoreCase(invName);
	}

}