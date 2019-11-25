package org.javacream.store.decoratos;

import java.util.Date;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.javacream.store.api.StoreService;
import org.javacream.util.inject.Business;

@ApplicationScoped
public class AuditStoreService implements StoreService{

	public int getStock(String category, String item) {
		System.out.println("called getStock at " + new Date());
		return simpleStoreService.getStock(category, item);
	}

	@Inject @Business
	private StoreService simpleStoreService;
}
